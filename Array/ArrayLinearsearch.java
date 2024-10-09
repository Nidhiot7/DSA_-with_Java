import java.util.*;

public class ArrayLinearsearch {
    // ........................................ For Linear Search

    // public static int linearsearch(String[] menu, String key){
    // for(int i=0; i<menu.length; i++){
    // if(menu[i].equals(key)){
    // return i;
    // }
    // }
    // return -1;
    // }

    // public static void main(String args[]){
    // // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
    // String menu[] = {"dosa","itali","samosa","khamand","pani-puri","sandwich"};
    // String key = "samosa";

    // int index = linearsearch( menu, key);
    // if(index == -1){
    // System.out.println("not found");
    // }else{
    // System.out.println("key is at index : " + index);
    // }

    // }

    // ................................... For Get Largest and Smallest Value

    // public static int getLargest(int numbers[]){
    // int largest = Integer.MIN_VALUE;
    // int smallest = Integer.MAX_VALUE;

    // for(int i=0; i<numbers.length; i++){
    // if(largest < numbers[i]){
    // largest = numbers[i];
    // }
    // if(smallest > numbers[i]){
    // smallest = numbers[i];
    // }
    // }
    // System.out.println("smallest vlaue is : " + smallest);
    // return largest;
    // }

    // public static void main(String args[]) {
    // int numbers[] = { 1, 2, 3, 4, 5 };
    // System.err.println("largest value is : " + getLargest(numbers));
    // }

    // ............................................ For Binary Search in array

    // public static int binarySearch(int numbers[], int key) {
    // int start = 0, end = numbers.length - 1;

    // while (start <= end) {
    // int mid = (start + end) / 2;

    // if (numbers[mid] == key) {
    // return mid;
    // }
    // if (numbers[mid] < key) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    // public static void main(String args[]) {
    // int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
    // int key = 10;

    // System.out.println("index for key is : " + binarySearch(numbers, key));
    // }

    // ...................................................For Reverse array

    // public static void reverse(int numbers[]){
    // int first = 0, last = numbers.length-1;

    // while (first < last) {
    // int temp = numbers[last];
    // numbers[last] = numbers[first];
    // numbers[first] = temp;

    // first++;
    // last--;
    // }
    // }

    // public static void main(String args[]){
    // int numbers[] = {2, 4, 6, 8, 10};

    // reverse(numbers);
    // for(int i=0; i<numbers.length; i++){
    // System.out.println(numbers[i] + " ");
    // }
    // System.out.println();
    // }

    // ..........................................For Print Pairs

    // public static void printPairs(int numbers[]) {
    //     int tp = 0;

    //     for (int i = 0; i < numbers.length; i++) {
    //         int curr = numbers[i];
    //         for (int j = i + 1; i < numbers.length; j++) {
    //             System.out.println("(" + curr + "," + numbers[j] + ")");
    //             tp++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total pair is : " + tp);
    // }

    // public static void main(String args[]) {
    //     int numbers[] = { 2, 4, 6, 8, 10 };
    //     printPairs(numbers);
    // }

    // .................................................... For Print Subarrays

    public static void printSubarrays(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=0; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.println(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray :" + ts);
    }

    public static void main(String args[]) {
            int numbers[] = { 2, 4, 6, 8, 10 };
            printSubarrays(numbers);
        }


}