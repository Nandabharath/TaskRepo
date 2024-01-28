package OOPs_20th_Jan_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab180 {
    public static void main(String[] args) {
        List<String> mylist =new ArrayList<>();
        mylist.add("nanda");
        mylist.add("priya");
        mylist.add("hiremath");
        mylist.add("abcd");
       // mylist.add(11);

        System.out.println(mylist);
        mylist.set(1,"Yak");
        System.out.println(mylist);
        mylist.remove("Yak");
        System.out.println(mylist);

        System.out.println("---------");
        //For loop

        for(int i =0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }
        System.out.println("-----");

        for (Object o :mylist){
            System.out.println(o);
        }

        System.out.println("--------");

        //Iteraror
        Iterator iterator =mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
