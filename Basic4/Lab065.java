package Basic4;

import java.util.Scanner;
public class Lab065 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of X");
        double x = sc.nextDouble();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the value of X");
        double y = sc.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter the value of X");
        double z = sc.nextDouble();

        double result=0;
        result= Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);



    }



    //  A = x^2
    // B - y^2
    // c = |z| ->


}
