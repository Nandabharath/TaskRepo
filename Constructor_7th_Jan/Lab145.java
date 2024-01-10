package Constructor_7th_Jan;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Lab145 {

    public static void main(String[] args) {

//        Person p = new Person();
//        new Person();
//        Person p;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name ");
        String name = sc.next();


        Person p2 = new Person(name);
        p2.print(name);


        System.out.println("Enter second name");
        String name3 = sc.next();
        //  Person P3 =new Person("nanda", 11, 19);

        Person p3 = new Person(name3);
        p3.print(name3);



        // this ->

        // p3 -> name -> nanda -> this -> p3
        // p2 -> name -> Pramod -> this -> p2
        // p ->  name -> null -> this -> nothing
    }
    }


