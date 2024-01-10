package Constructor_7th_Jan;

public class Dog {
    String name;//Instance varibale

    Dog() {
        System.out.println("dog default constructor");
    }

    Dog(String dname) {
        this.name = dname;
        System.out.println("PC");

    }

    void bark() {
        int age = 10;//local variable
        System.out.println("Bark");
        System.out.println(this.name);
    }

    public static void main(String[] args) {

        Dog d = new Dog();
        d.name = "Shitzu";
        d.bark();

        Dog d1 = new Dog("Pomo");
        {
            d1.bark();
        }
    }
}
