package OOPs_14th_Jan_2024.Innerclass;

public class Lab153 {
    public static void main(String[] args) {
        OC1 oc =new OC1();
      //  OC1.SNci iref= new oc.SNci();
        OC1.SNci icref= new OC1.SNci();
        icref.show();


    }
}

class OC1 {
    static  int o=99;
    int a=20;

    static  class SNci{
        void show(){
         //   System.out.println(a);--a is instance variable
            System.out.println(o);
        }
    }
}