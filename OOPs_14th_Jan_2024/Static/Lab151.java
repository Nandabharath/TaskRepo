package OOPs_14th_Jan_2024.Static;

public class Lab151 {
    public static void main(String[] args) {
        P01.m2();

        P01 p01 = new P01();
        P01 p02 = new P01();

        p01.m1();
        P01.m2();

        P01 p03 = null;
        // p03.m1();
        p03.m2();
    }
}

class P01{
    static {
        System.out.println("Iam a SIB");
    }

    {
        System.out.println("Iam IIB");
    }

    int a=10;
    static  int b=20;

    void  m1() {
        System.out.println("m1");
        System.out.println(a);
        System.out.println(b);
    }
    static void m2(){
        //System.out.println(a);--static method should not call instance variable
        System.out.println(b);

    }
}

