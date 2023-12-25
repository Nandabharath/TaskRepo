package Basic4;

public class Lab063 {
    public static void main(String[] args) {

        // JDK > 13
        // ->

        int itemCode = 005;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");// we dont need break
            case 002 -> System.out.println("It's a desktop!");
            case 003,004 -> System.out.println("It's a mobile phone!");
            case 005-> System.out.println("-----");
            default -> System.out.println("Heloo!");
        }
    }
}
