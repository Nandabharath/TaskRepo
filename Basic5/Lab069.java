package Basic5;
import java.util.Scanner;
public class Lab069 {
    public static void main(String[] args) {
        // Take a user input and print the information

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name ");
        String name =sc.next();

        System.out.println("Enter Age");
        int age = sc.nextInt();

        System.out.println("Enter salary ");
        double salary = sc.nextDouble();

        System.out.println("your datails are" + " " + name + " "+ "your age"+" " +age  +" " +   "your salary"   + salary);

        System.out.println("your name details" +name);
        System.out.println("your age details" +age);
        System.out.println("your salary details" +salary);

    }
}
