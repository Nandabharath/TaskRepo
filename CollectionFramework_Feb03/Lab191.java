package CollectionFramework_Feb03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab191 {
    public static void main(String[] args) {

        Set courseSets = new HashSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");

        System.out.println(courseSets);

        //no sequesnce in printing randaomly it wil print
        for (Object o :courseSets){
        System.out.println(o);
    }

        Iterator i = courseSets.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
