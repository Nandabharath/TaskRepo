package OOPs_14th_Jan_2024.Exception;

public class Lab169 {
    public static void main(String[] args) {

        // Thorws and customeExcpetipon// Learn in the NExt Class
        // 1 Lecture - Multi Threading self paced - This week
        extracted2();
        System.out.println("main execute");

    }

    public static void extracted2() {
        extracted1();
        System.out.println("Extraceted2 execute");
    }

    public static void extracted1() {
        extracted();
        System.out.println("Extracted1 execute");
    }

    public static void extracted() {
        try {
            String name = null;
            name.length();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
