package OOPs_13th_Jan_2024.Abstraction.Realtimeexample.Realtime;

public class TC2_Firefox extends Baseclass{
    @Override
    String openbrowser() {
        System.out.println("Opening firefox browser");
        return null;
    }

    @Override
    String closebrowser() {
        System.out.println("closing Firefox browser");
        return null;
    }
}
