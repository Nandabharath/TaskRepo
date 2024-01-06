package OOPs_06_jan_2024.Basic1;

public class Lab136 {
    public static void main(String[] args) {

        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Nanda");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        //String buffer is thread safe and multithreaded environment
        //strig buildr is not thresad safe and single threaded environmnet
    }
}
