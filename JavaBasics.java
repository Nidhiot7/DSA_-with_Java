import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of week ( 1-7) : ");
        int dayOfWeek = sc.nextInt();
  
        if(dayOfWeek == 1){
            System.out.println("Sunday");
        }else if(dayOfWeek == 2){
            System.out.println("Monday");
        }else if(dayOfWeek == 3){
            System.out.println("Tuesday");
        }else if(dayOfWeek == 4){
            System.out.println("Wednesday");
        }else if(dayOfWeek == 5){
            System.out.println("Thursday");
        }else if(dayOfWeek == 6){
            System.out.println("Friday");
        }else if(dayOfWeek == 7){
            System.out.println("Saturday");
        }else{
            System.out.println("empty");
        }
    }
}

// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input the year: ");
//         int year = sc.nextInt();

//         boolean x = (year % 4) == 0;
//         boolean y = (year % 100) != 0;
//         boolean z = ((year % 100 == 0) && (year % 400 == 0));

//         if(x && (y || z) ){
//             System.out.println(year +" is a leap year");
//         }else{
//             System.out.println(year +" is not a leap year");
//         }
    
//     }
// }
// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int week = sc.nextInt();
//     switch(week){
//         case 1: System.out.println("Sunday");
//         break;
//         case 2: System.out.println("Monday");
//         break;
//         case 3: System.out.println("Tuesday");
//         break;
//         case 4: System.out.println("Wednesday");
//         break;
//         case 5: System.out.println("Thursday");
//         break;
//         case 6: System.out.println("Friday");
//         break;
//         case 7: System.out.println("Saturday");
//         break;
//         default:System.out.println("nope");
//     }
//     }
// }
// public class JavaBasics {
//     public static void main(String[] args) {
//         double temp = 103.5;
//         if(temp > 100){
//             System.out.println("fever");
//         }else{
//             System.out.println("noFever");
//         }

//     }
// }

// public class JavaBasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// if(num > 0){
// System.out.println(num + "is a positive");
// }else if(num < 0){
// System.out.println(num + "is a negative");
// }else{
// System.out.println(num + "is zero");
// }
// }
// }

// public class JavaBasics {
// public static void main(String[] args) {
// int x = 200, y = 50, z = 100;
// if (x > y && y > z) {
// System.out.println("Hello");
// }
// if (z > y && z < x) {
// System.out.println("Java");
// }
// if ((y + 200) < x && (y + 150) < z) {
// System.out.println("Hello Java");
// }
// }
// }
// public static void main(String args[]) {
// byte b = 4;
// char c = 'a';
// short s = 512;
// int i = 1000;
// float f = 3.14f;
// double d = 99.9954;
// double result = (f*b) + (i%c) - (d*s);
// System.out.println(result);
// }
// }

// public class JavaBasics {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// float pencil = sc.nextFloat();
// float pen = sc.nextFloat();
// float eraser = sc.nextFloat();
// float totalItems = pencil + pen + eraser;
// float addGst = totalItems * 1.18f;
// System.out.println("GST tax to the items in bill :" + addGst);
// }
// }
// public class JavaBasics {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the first number A: ");
// double A = sc.nextDouble();
// System.out.print("Enter the first number B: ");
// double B = sc.nextDouble();
// System.out.print("Enter the first number C: ");
// double C = sc.nextDouble();
// double average = (A + B + C) / 3;
// System.out.println(average);
// }
// }

// public class JavaBasics {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// // System.out.print("Enter the radius: ");
// int a = sc.nextInt();
// int square = a * a;
// System.out.println(square);
// }
// }