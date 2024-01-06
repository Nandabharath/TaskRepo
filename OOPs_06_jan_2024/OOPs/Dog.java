package OOPs_06_jan_2024.OOPs;

import java.lang.reflect.Method;

public class Dog {
    public static void main(String[] args) {

        //constructor
        Dog(){

        }

        // Attribute / Data member / varaible
        String name;
        //Method /Behaviour
        void eat(){
            System.out.println("EAT");
        }
        int age =10;
        static void printdetails() {
            System.out.println("iam static");
        }
        //inner class
        class smalldog{

        }

    }
}
