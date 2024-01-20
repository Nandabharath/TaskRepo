package OOPs_13th_Jan_2024.Polymorphism.MethodOverriding;

public class RC {
    public static void main(String[] args) {

        Dog d= new Dog();
        d.bark();

        Hound h= new Hound();
        h.bark();

        Dog f= new Hound();
        f.bark();//Runtime polymorphism

        //Hound a = new Dog(); // Java 22 This is not possible
        // Latest java 22 - It is never possible in JAVA

    }
}
