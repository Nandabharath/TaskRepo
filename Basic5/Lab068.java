package Basic5;
import java.util.Scanner;
public class Lab068 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        // You have to tell JVM which input user is enter
//        sc.next() ->  String;
        // sc.nextInt()
        // sc.nextDouble();
        // sc.nextBoolean();
        // sc.nextFloat();

        System.out.println("Enter the value of x");
        double x =SC.nextInt();
        System.out.println("Enter the value of Y");
        double y=SC.nextInt();
        System.out.println("Enter the value of z");
        double z =SC.nextInt();
        double result;

        //3/x^2+y^2-|z|
        // A+B-C ->  A ->  x^2 , B -> Y ^2 , C ->  |Z| abs(Z)  -1 ->  1, -199.98 -> +199.98

        result= Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);

        // Scanner steam should be closed after we are done.
        // JVM will do it, Garbage Collector -> Who wil do it for you
        // It is not a good practice ->

        SC.close();

    }
}
