package OOPs_14th_Jan_2024.Exception;

public class Lab165 {
    public static void main(String[] args) {
try {
    String ip = args[0];
    int a = Integer.parseInt(ip);
    int c = 10 / a;
    System.out.println(a);
    System.out.println(c);
} catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException  e){
    System.out.println(e.getMessage());

} catch (Exception e){
    System.out.println(e.getMessage());
}
finally {
    // 100% executed
    System.out.println("I willbe executed anyHow This cock who can survive the nuclear attack");
}
    }
}
