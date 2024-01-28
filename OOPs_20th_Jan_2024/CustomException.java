package OOPs_20th_Jan_2024;

public class CustomException extends Exception{
    public CustomException(String Msg){
        super(Msg);
        System.out.println("If i got , custom exp");
    }

}
