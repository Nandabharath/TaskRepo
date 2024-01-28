package OOPs_20th_Jan_2024;

import java.io.FileReader;

public class Lab172 {
    public static void main(String[] args) throws Exception {
main("pramod");
    }
    static void main(String a) throws Exception{

        FileReader file =new FileReader("//a.txt");
        if (a.equalsIgnoreCase("a")) {
            throw new ArithmeticException();
        }
    }
}
