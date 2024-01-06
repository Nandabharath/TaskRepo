package OOPs_06_jan_2024.Basic1;

import java.util.Scanner;

public class Lab137 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string , i will tell you Palindrome or not");
        String pal = scanner.next();
     //pal=pal.toLowerCase();
    boolean result =  ispalindrome(pal);
    if(result){
        System.out.println("Palindrome");
    }else {
        System.out.println("Not a Palindrome");
    }
    }
    public static boolean ispalindrome(String pal) {
        StringBuilder stringBuilder = new StringBuilder(pal);
        String Original_str1 = pal;
        String sb = stringBuilder.reverse().toString();
return  Original_str1.equalsIgnoreCase(sb);


    }


}
