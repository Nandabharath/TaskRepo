package OOPs_13th_Jan_2024.Abstraction.Interfaces.Interview_question;

public class II1 {
    public static void main(String[] args) {
    Hello h = new Hello();
    h.say();
    h.hello();

    II i=new Hello();// object of hello class withinterface refrence
        //interface cannt create object
    i.hello();



    }
}

interface II{

    void say();
    default void hello(){
        System.out.println("Hello default");
    }
}

interface  p{ }

class Hello implements II{

    @Override
    public void say() {
        System.out.println("Say");
    }

    @Override
    public void hello() {
        System.out.println("say hello");
    }
}