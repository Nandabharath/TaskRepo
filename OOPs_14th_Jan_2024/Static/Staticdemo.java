package OOPs_14th_Jan_2024.Static;

public class Staticdemo {

    // Static variable
    public static String colleagename = "The testing academy";

    // Non static variable -> Local variable or Instance variable
    public int version = 3;

    //static method

    public static void printname() {
        int age = 20;
        System.out.println("Name is " + colleagename);
    }
        // You can't have an Instance variable into the Static Method!!
        //System.out.println("Version is : " + version);

        // Non static method
        public void printVersion () {
            int age = 40;
            System.out.println("Version is : " + version);
            System.out.println("Name is :" + colleagename);
        }
    }

