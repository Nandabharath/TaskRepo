package Basic7_OOPS;

import java.util.Scanner;

public class Lab124 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int [] new_array = new int[n];
        System.out.println(new_array);// reference value

        System.out.println("Enter the element ");
       for(int i=0;i<n;i++) {
           new_array[i] = sc.nextInt();
       }

        System.out.println("---Output");
       for(int i =0;i<n;i++){
           System.out.println(new_array[i]);
       }
       sc.close();
    }

}
