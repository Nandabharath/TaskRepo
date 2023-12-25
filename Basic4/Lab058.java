package Basic4;
import java.util.Scanner;
public class Lab058 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter");
        char c = sc.next().toCharArray()[0];
        System.out.println(c);

        switch (c) {
            case 'a':
                System.out.println("VOWEL");
                break;
            case 'e':
                System.out.println("VOWEL");
                break;
            case 'i':
                System.out.println("VOWEL");
                break;
            case 'o':
                System.out.println("VOWEL");
                break;
            case 'U':
                System.out.println("VOWEL");
                break;
            default:
                System.out.println("consonant");


        }
    }
}
