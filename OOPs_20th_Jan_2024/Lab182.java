package OOPs_20th_Jan_2024;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab182 {
    public static void main(String[] args) {
        List<String> mylist =new LinkedList<>();
        mylist.add("nanda");
        mylist.add("Hiremath");
        mylist.add("Bharath");
        System.out.println(mylist);

        List<Integer> mylist1 =new LinkedList<Integer>();
        mylist1.add(123);
        mylist1.add(98);

        for(Object o:mylist1){
            System.out.println(o);
    }
        Iterator iterator =mylist.iterator();
            while (iterator.hasNext()){
            //    mylist.add("ooooo");
                System.out.println(iterator.next());
            }
        }
}
