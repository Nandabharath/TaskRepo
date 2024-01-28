package OOPs_20th_Jan_2024;

public class Lab170 {
    public static void main(String[] args) throws Exception {
        //extracted(10);
        extracted(0);
        throw new Exception("Hello");

    }
    private static void extracted(int b){
        int a;
        if(b==0) {
            throw new ArithmeticException("B cant be zero");
        }else{
            a=b/10;
        }
        System.out.println(a);
        // wEB AUT  a ==0 -> throw exception and exit the program
        try {
     //       int a = 10 / b;
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}
