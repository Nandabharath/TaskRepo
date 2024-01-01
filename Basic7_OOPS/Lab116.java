package Basic7_OOPS;

import java.util.Scanner;

public class Lab116 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name");
        String  input =sc.next();
        System.out.println(input);
        int val =main(2, 3);
        System.out.println(val);
        System.out.println(main(2,4));

    }
    public static void main(int a){
        System.out.println("Another main");

    }
    public static int main(int a, int b){
        return 99;

    }
    public static void  main(int a, int b,int c){
        System.out.println("Another main ");
    }
}
