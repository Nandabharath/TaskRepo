package Basic2;

public class Lab007 {
    /**
     * Author - Nanda
     * showcase difference of Println and Printf
     * @param args
     */
    public static void main(String[] args) {
int age= 34;
int age1 =31;

// %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float

        System.out.printf("Your age is %d",age);
        System.out.println();
        System.out.printf("My age is %d", age1);
    }
}
