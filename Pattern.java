import java.util.*;

public class Pattern {
    public static void hollow_rectangle(int totRows, int totCols) {
        // outer loops
        for (int i = 1; i <= totRows; i++) {
            // inner colums
            for (int j = 1; j <= totCols; j++) {
                // cell - ( i, j )
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundry cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollow_rectangle(4, 5);
    }
}

// public class Pattern {
// public static void main(String args[]) {
// int n = 4;
// char ch = 'A';
// for (int line = 1; line <= n; line++) {
// for (int character = 1; character <= line; character++) {
// System.out.print(ch);
// ch++;
// }
// System.out.println();
// }
// }
// }

// public class Pattern {
// public static void main(String args[]) {
// int n = 4;
// char ch = 'A';
// for (int line = 1; line <= n; line++) {
// for (int character = 1; character <= line; character++) {
// System.out.print(ch);
// ch++;
// }
// System.out.println();
// }
// }
// }

// public class Pattern {
// public static void main(String args[]) {

// for (int line = 1; line <= 4; line++) {
// for (int num=1; num<=line; num++) {
// System.out.print(num);
// }
// System.out.println();
// }
// }
// }

// public class Pattern {
// public static void main(String args[]) {
// int n = 4;
// for (int line = 1; line <= n; line++) {
// for (int star = 1; star <= n-line+1; star++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// public class Pattern {
// public static void main(String args[]){
// for(int line=1; line<=4; line++){
// for(int star=1; star<=line; star++){
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }
