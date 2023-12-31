package Basic6;

public class Lab108 {
    public static void main(String[] args) {
        // Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4,


        // but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.


        // Coding ->
        // 1. user input - ?
        // 2. Rough logic ->( (year%4 == 0) -> leap and  (year%100 !=0) -> leap )  or   year % 400 == 0))
        // 3. Brute force
        // 4. Logic correction


       int  year =1900;
       if ((year % 4 ==0 && year %100 !=0)||(year%400==0)) {
           System.out.println("leap year");
       }
        System.out.println("Not a leap year");
       }
    }

