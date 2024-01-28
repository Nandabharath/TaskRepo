package OOPs_21st_Jan_2024;

import java.util.Stack;

public class Lab188 {
    public static void main(String[] args) {
        //stack

        Stack<String> s= new Stack();
        s.push("nanda");
        s.push("yadvik");
        s.push("bharath");
        //  s.push(123);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);

    }
}
