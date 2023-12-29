package Basic5;
import java.util.Scanner;
public class Lab094 {
    public static void main(String[] args) {
        // Problem
        // Factorial Program
//        1! -> 1
//        2! -> 2*1
//        3! -> 3*2*1
//        5! -> 5*4*3*2*1 = 120
        //user_input = 5
        //print -> 120

Scanner user_input = new Scanner(System.in);
        System.out.println("Enter the value ");
        int num = user_input.nextInt();
        int fact=1;
        for(int i=1; i<=num; i++) {
            fact = fact * i;
        }
            System.out.println(fact);

        Scanner user_input1 = new Scanner(System.in);
        System.out.println("Enter the value ");
        int num1 = user_input.nextInt();
int fact1= 1;
int j=1;
while(j<=num1) {
    fact1 = fact1 * j;
    j++;
}
        System.out.println(fact1);

}
    }

