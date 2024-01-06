package OOPs_06_jan_2024.Basic1;

public class Lab133 {
    public static void main(String[] args) {
        // Immutable in nature (that can't changed)
        String s1 = "Pramod";
        String s2 = new String("Pramod");


        // Mutable - that can be changed!!
       // StringBuilder  sb1 = new StringBuilder("automation");
        //  StringBuffer Sbuf =new StringBuffer("Automation");

        StringBuilder  sb1 = new StringBuilder("automation");
        sb1.append("Testing");
        System.out.println(sb1);

        StringBuffer SBF1= new StringBuffer("Hello");
        SBF1.append("world");
        System.out.println(SBF1);

    }
}
