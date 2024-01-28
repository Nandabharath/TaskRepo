package OOPs_20th_Jan_2024;

import java.util.List;

public class Lab178 {
    public static void main(String[] args) {
        // Collections Framework
        List Fruties= List.of("apple","Banana","guava","apple","Watermelon");
        List shoping =List.of("Bread","Milk","atta");
        List marks =List.of(70,98,90,98,87,78);
        List differnt_datatypes = List.of("nanda",98,89.67,true);

        System.out.println(Fruties.get(2));
        System.out.println(shoping.size());
        System.out.println(Fruties);
        System.out.println(Fruties.indexOf("Banana"));

       // IsEmpty
        System.out.println(Fruties.isEmpty());
        //fruites.add("pramod");
        Fruties.remove("pramod");
        // ArrayList, LinkedList, - Add or Replcae anything - Full Auth

    }
}
