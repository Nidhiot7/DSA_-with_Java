import java.util.*;

public class ArrayAssignment {

    // Q.1 Given an integer array nums, return true if any value appears at least
    // twice
    // in the array, and return false if every element is distinct

    // Brute Force

    // public static boolean containsDuplicate(int nums[]) {
    // for (int i = 0; i < nums.length - 1; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] == nums[j]) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // public static boolean containsDuplicate(int nums[]) {
    // HashSet<Integer> set = new HashSet<>();
    // for (int i = 0; i < nums.length; i++) {
    // if (set.contains(nums[i])) {
    // return true;
    // } else {
    // set.add(nums[i]);
    // }
    // }
    // return false;
    // }

    // public static void main(String[] args) {
    // int nums[] = { 1, 2, 3, 4, 1 };
    // System.out.println(containsDuplicate(nums));
    // }

    // Q.2 There is an integer array nums sorted in ascending order (with distinct
    // values).Prior to being passed to your function, nums is possibly rotated at
    // an unknown pivot index k (1 <= k < nums.length) such that the resulting array
    // is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
    // (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3
    // and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation
    // and an integer target, returnthe index oftarget if it is in nums, or -1 if it
    // is not in nums.You must write an algorithm with O(log n) runtime complexity

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate mid to avoid overflow

            // Check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which half is sorted
            if (nums[low] <= nums[mid]) {
                // Left half is sorted
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1; // Target is in the left half
                } else {
                    low = mid + 1; // Target is in the right half
                }
            } else {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1; // Target is in the right half
                } else {
                    high = mid - 1; // Target is in the left half
                }
            }
        }

        // If we reach here, the target was not found
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int result = search(nums, target);
        System.out.println("Index of target: " + result); // Output: Index of target: 4
    }
}
