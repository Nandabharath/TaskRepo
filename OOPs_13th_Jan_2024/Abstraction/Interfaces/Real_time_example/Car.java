package OOPs_13th_Jan_2024.Abstraction.Interfaces.Real_time_example;

public class Car implements Engine, Break{

    void start(){
        System.out.println("Strating car");
        startengine();
        breaks();
    }
    @Override
    public void startengine() {
        System.out.println("Engine started");
    }

    @Override
    public void breaks() {
        System.out.println("Break is working fine");
    }
}
