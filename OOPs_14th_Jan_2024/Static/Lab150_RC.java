package OOPs_14th_Jan_2024.Static;

public class Lab150_RC {
    public static void main(String[] args) {

        //   System.out.println(StaticDemo.college_name);
//        StaticDemo.printName();

        Staticdemo s= new Staticdemo();
        s.version=3;
        s.printVersion();
        Staticdemo.colleagename="TTA";

        Staticdemo s2 =new Staticdemo();
        s2.version=99;
        s2.printVersion();
    }
}
