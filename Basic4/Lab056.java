package Basic4;

import java.util.Scanner;
public class Lab056 {
    public static void main(String[] args) {
        // If, Switch -  Condition Based
        // Loops -> Which will repeat something - for, while, do while

        // Switch - Condition based - Multiple Condition


        // Which day is today!!
        Scanner sc =new Scanner(System.in);
        // 1 ->  Monday, 7 -> Sunday,  MTWTFSS , invalid -> 99 - are you mad?
        System.out.println("Enter the number 1-7, I will tell which day it is");
        int daynum =sc.nextInt();

        switch (daynum) {

            case (1):
                System.out.println("Monday");
                break;
            case (2):
                System.out.println("Tuesday");
                break;
            case (3):
                System.out.println("Wednesday");
                break;
            case (4):
                System.out.println("Thursday");
                break;
            case (5):
                System.out.println("Friday");
                break;
            case (6):
                System.out.println("Saturday");
                break;
            case (7):
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid");
        }





        }



    }

