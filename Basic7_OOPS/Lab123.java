package Basic7_OOPS;

import java.util.Scanner;

public class Lab123 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of a");
            int a = sc.nextInt();
            System.out.println("Enter the value of  b");
            int b = sc.nextInt();
    //a=10,b=20
            a = a * b;//a=10*20=200
            b = a / b;//b=200/20=10
            a = a / b;//a=200/10=20


            System.out.println("Value of a -> " + a);
            System.out.println("Value of b -> " + b);

        } catch (Exception e) {
            System.out.println("Not Possible zero");
        }




//        // bitwise xor
//        a = a ^ b; // BINARY AND XOR GATE
//        b = a ^ b;
//        a = a ^ b;

    }
}
