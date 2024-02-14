package CollectionFramework_Feb03;

import java.util.HashSet;
import java.util.Set;
public class Lab190 {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        s.add("nanda");
        s.add("bharath");
        s.add("apple");
        s.add("Apple");

        System.out.println(s);
        System.out.println(s.contains("apple"));
        System.out.println(s.size());

        System.out.println(s.isEmpty());
       // s.add(123);

    }
}
