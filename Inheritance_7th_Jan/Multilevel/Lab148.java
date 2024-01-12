package Inheritance_7th_Jan.Multilevel;

public class Lab148 {
    public static void main(String[] args) {


        // GrandFather g =new GrandFather();
        // Father f = new Father();
        // GrandFather g1 =new Father();
        // Son s =new Son();

        //Not possible
        // Son s1 =new Father();
        //Son s2 = new GrandFather();
        //Father f1= new GrandFather();

        GrandFather g = new Son();
        g.BHK3();

        Father f = new Father();
        f.BHK2();
        f.BHK3();

        Son s1 = new Son();
        s1.bhk1();
        s1.BHK2();
        s1.BHK2();

    }
}
