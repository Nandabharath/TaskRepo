package OOPs_20th_Jan_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab179 {
    public static void main(String[] args) {
      //  List mylist =new List();--List is interface cannot create object
        List mylist =new ArrayList();
        mylist.add("nanda");
        mylist.add("Hiremath");
        mylist.add(31);
        mylist.add(true);

        System.out.println(mylist);
        mylist.set(1,"priya");
        System.out.println(mylist);
        mylist.remove("nanda");
        System.out.println(mylist);

        for(int i =0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }

        for(Object o: mylist){
            System.out.println(o);

          //  Iterator i =new Iterator() {

        }
    }
}
