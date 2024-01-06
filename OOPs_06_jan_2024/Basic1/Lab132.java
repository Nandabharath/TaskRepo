package OOPs_06_jan_2024.Basic1;

public class Lab132 {
    public static void main(String[] args) {
        String str1= "nanda";
        String str2 =new String("nanda");
        String  str3 = new String("Nanda");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        System.out.println(str1.equalsIgnoreCase(str3));
    }
}
