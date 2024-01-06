package OOPs_06_jan_2024.Basic1;

public class Lab134 {
    public static void main(String[] args) {

        // Immutable in nature (that can't changed)
        String password = "pass@123";

        // 1000 times I am going to change the password value
        // should I use the Sb, sb OR String

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("Password");
        password2.append("@123");
        System.out.println(password2);
    }
}
