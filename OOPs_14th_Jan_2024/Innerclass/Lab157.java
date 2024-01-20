package OOPs_14th_Jan_2024.Innerclass;

public class Lab157 {
    public static void main(String[] args) {
        Runnable r =new Runnable() {
            @Override
            public void run() {
                System.out.println("Iam a Runnable interfae Thread");

            }
        };
        r.run();
    }
}
