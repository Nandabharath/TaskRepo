package Basic3;

public class Lab029 {
    public static void main(String[] args) {
        String s1 = "Nanda";
        // String Constant Pool - SCP / String Pool

        // new Operator - Object
        String s2 = new String("Nanda");
        //new operator is used to create the new object for class.
        // It returns of the address of newly created object.
        System.out.println(s2);
        System.out.println(new String("Nanda"));
    }
}
