package OOPs_21st_Jan_2024;

import java.util.Enumeration;
import java.util.Vector;

public class Lab185 {
    public static <vector> void main(String[] args) {

        Vector v=new Vector();
        v.add("nanda");
        v.add("bharath");
        v.add("ooop");
        v.remove("nanda");

        // Array - can store simirlar only<string>

        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
