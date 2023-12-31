package Basic6;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {
        // Take input user Marks of 5 subjects and Print the marks

        Scanner sc =new Scanner(System.in);
        float[] marks =new float[4];
        System.out.println("Enter first subject marks");
        marks[0]= sc.nextFloat();
        System.out.println("Enter first subject marks");
        marks[2]= sc.nextFloat();
        System.out.println("Enter first subject marks");
        marks[2]= sc.nextFloat();
        System.out.println("Enter first subject marks");
        marks[3]= sc.nextFloat();

       // for (int i=0;i<marks.length;i++){
         //   if(marks[i]<30) {
           //     System.out.println("your fail" + marks[i]);
            //}
            //System.out.println(marks[i]);
            //}
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] < 30){
                System.out.println("You are fail in this subject" + marks[i]);
            }
            System.out.println(marks[i]);
        }
        sc.close();
        }


    }

