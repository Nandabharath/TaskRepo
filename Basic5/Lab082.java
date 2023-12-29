package Basic5;

public class Lab082 {
    public static void main(String[] args) {
        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop. -> true, false
        // C ->  Increment / Decrement

        // Print the Odd number in between the 1 to 50.
        // If Else

        for(int i=1; i<=50;i++){
            if(i%2==1) //if (!i%2==1)-- even number
            {
                System.out.println("odd num" + i);
            }

        }
        System.out.println("end program");
    }
}
