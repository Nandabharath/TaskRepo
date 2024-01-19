package OOPs_13th_Jan_2024;

public class Lab146 {
    public Lab146() {
    }

    public static void main(String[] args) {

        Blockclass b =new Blockclass();
        // as soon as we create object IIb wil be called and then Constructor will call
//SIB will  call only once
        new Blockclass();//object creted
        new Blockclass();//obj creted
        Blockclass b1 = null;
    }
}
