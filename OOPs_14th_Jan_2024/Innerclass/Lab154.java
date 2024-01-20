package OOPs_14th_Jan_2024.Innerclass;

public class Lab154 {

    public static void main(String[] args) {

        Pramod.Ipad ipad= new Pramod.Ipad();
        ipad.eating();
    }
}
// Class Members
class Pramod{
    int age  = 31; // Data Memebers / Instances Variables

    // Methods
    void eay(){
        System.out.println("I am eating");
    }

    static class Ipad{
        void eating(){
            System.out.println("I am IPAD");
            //System.out.println(age);
        }
    }
    }