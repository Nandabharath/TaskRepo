package OOPs_14th_Jan_2024.Innerclass;

public class Lab152 {

    public static void main(String[] args) {
        car c =new car("Lambo 132");
        c.drive();
        car.Engine engine =c.new Engine("400cc");
        engine.start();

        // OC.IC ref = OCRef.new IC();
    }

}
class car{

    String make;

    public car(String make) {
        this.make = make;
    }
    //method
    void  drive(){
        System.out.println("You can drive");
    }

    public  class Engine{
        String Horsepower;
        public Engine(String horsepower) {
            Horsepower = horsepower;
        }
void start(){
    System.out.println("Engine started "+make );
}


    }
}