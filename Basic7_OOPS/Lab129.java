package Basic7_OOPS;

public class Lab129 {
    public static void main(String[] args) {
        // reverse string with charat
    String name ="Nanda";
    String Y="";

    for (int i=name.length()-1;i>=0;i--){
        Y=Y+name.charAt(i);
    }
        System.out.println(Y);
    }
}
