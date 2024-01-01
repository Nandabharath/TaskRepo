package Basic7_OOPS;

public class Lab112 {
    public static void main(String[] args) {

        int c= sum();// no argument
        int c1 = sum(2);// 1 argument
        int c2 = sum(3,8);// 2 argument
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

        sayhello();

    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a){
        return a;
    }
    static  int sum(){
        return 99;
    }
    static  int sum (int a, int b, int c){
        return  a+b+c;
    }
    static  void sayhello(){
        System.out.println("say hello");
    }
}
