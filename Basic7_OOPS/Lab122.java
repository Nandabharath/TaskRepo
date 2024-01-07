package Basic7_OOPS;

import java.util.Scanner;

public class Lab122 {
    public static void main(String[] args) {
        //swap without 3rd variable

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();

        Scanner sc1 =new Scanner(System.in);
        System.out.println("enter value of b");
        int b=sc.nextInt();

        a=a+b;//a=20,b=10 a= 30
        b=a-b;//b=30-10
        a=a-b;//a= 30-20

        System.out.println(a);
        System.out.println(b);
        sc.close();

    }
}
