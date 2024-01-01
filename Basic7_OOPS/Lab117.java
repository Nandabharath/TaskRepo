package Basic7_OOPS;

public class Lab117 {
    public static void main(String[] args) {
        System.out.println("Run fine!");
        main("nanda");
       // System.out.println();

        int d = main(10);
        System.out.println(d);
    }
    static void main(String a){// JVm recognige with public static void main(String[]
        System.out.println("I am a Main function but JVM doesn't recognize me");
    }

    static int main(int a) {
        return a + 101;
    }
}
