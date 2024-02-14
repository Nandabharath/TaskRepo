package CollectionFramework_Feb03;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab192 {
    public static void main(String[] args) {

        Set courseset = new LinkedHashSet();
        courseset.add("SDET Blueprint");
        courseset.add("Java for Testers");
        courseset.add("MTB");
        courseset.add("ATB");
        courseset.add("API");
        System.out.println(courseset);

        //it will print in order sequence
    }
}
