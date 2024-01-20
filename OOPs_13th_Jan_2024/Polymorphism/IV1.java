package OOPs_13th_Jan_2024.Polymorphism;

import OOPs_13th_Jan_2024.Polymorphism.MethodOverloading.Person;

public class IV1 {
    public static void main(String[] args) {


        Person1 p = new Person1();
        System.out.println(p.a);


        Person p2 =new Person();
      //  System.out.println(p2.a);


        Person1 h3=new Person1(23,true);
       System.out.println(h3.a);
        System.out.println(h3.b);
        System.out.println(p.b);
        p.a=99;
        System.out.println(p.a);
    }
}
class Person1 {
    int a;
    boolean b;

    // Default
    Person1(){
        this.a = 10;
    }

    // Parameter Constructor
    Person1(int b){
        this.a = b; //  h2.a
    }

    Person1(int b,boolean a){
        this.a = b;
        this.b = a;
    }
}
