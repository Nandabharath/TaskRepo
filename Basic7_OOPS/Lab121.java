package Basic7_OOPS;

import java.util.Scanner;

public class Lab121 {
    public static void main(String[] args) {
        // swap

        //int a=10;
        //int b =20;
        //b=10, a=20
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of A");
        int a= sc.nextInt();

        Scanner sc1 =new Scanner(System.in);
        System.out.println("Enter value of B");
        int b= sc.nextInt();

        int temp=0;
         temp=a;// temp=10
         a=b;//a=20
         b=temp;// b=10

        System.out.println(a);
        System.out.println(b);

    }
}
