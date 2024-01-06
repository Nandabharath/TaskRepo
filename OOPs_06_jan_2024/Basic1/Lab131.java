package OOPs_06_jan_2024.Basic1;

public class Lab131 {
    public static void main(String[] args) {
        String Str1 = "nanda";
        System.out.println(Str1.concat("hiremath"));
        System.out.println(Str1 + "Bharath");
        System.out.println(Str1.contains("a"));
        System.out.println(Str1);

        String name = "Hello";
        String Exoected_res = "Password@123";
        String Actual_res = "password@123";
        System.out.println(Exoected_res.equals(Actual_res));
        System.out.println(Exoected_res.equalsIgnoreCase(Actual_res));
        // or
        if(Exoected_res.equalsIgnoreCase(Actual_res));
        {
            System.out.println("yes");
        }
        }
}


