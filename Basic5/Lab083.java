package Basic5;

public class Lab083 {
    public static void main(String[] args) {

        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop. -> true, false
        // C ->  Increment / Decrement

        // Print the Mutliplication table of 5
        // If Else
        int number=5;
        for ( int i= 1; i<=10;i++){
            System.out.println(number + "X"+ i + "=" + number*i);
        }
    }
}
