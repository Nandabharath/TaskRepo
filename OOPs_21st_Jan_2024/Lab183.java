package OOPs_21st_Jan_2024;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
// import java.util.*; This is bad practice
public class Lab183 {
    public static void main(String[] args) {
        List courselist =new ArrayList();
        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("PyATB");
        courselist.add("LAPIB");
        courselist.add("SDET Blueprint");

        List numlist =new ArrayList();
        numlist.add(234);
        numlist.add(100);
        numlist.add(100);
        numlist.add(298);

        courselist.addAll(numlist);
        System.out.println(courselist);

        Iterator iterator =courselist.iterator();
        while (iterator.hasNext()){
          //  courselist.add("nanda");
            System.out.println(iterator.next());
        }





    }
}
