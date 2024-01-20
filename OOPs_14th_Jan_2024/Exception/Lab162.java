package OOPs_14th_Jan_2024.Exception;

public class Lab162 {
    public static void main(String[] args) {
       try {
           String name = null;
           name.trim();
           System.out.println(name);
       } catch (Exception E){
           System.out.println(E.getMessage());
           System.out.println("You are trying to trim a null string that is not possible in java!!");
       }

        System.out.println("Hi iam the end ");

    }
}

// Exception -?>
//  event that occurs during the execution of a program
//  that disrupts the normal flow of instructions.