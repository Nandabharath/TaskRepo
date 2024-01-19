package OOPs_13th_Jan_2024.Accessmodifiers.Police;

public class Cop {
    public static int gun ;

    // modifier return name_variable
    public Cop(int gun){
        this.gun=gun;
    }

    protected void canishoot(){
        System.out.println("Of-course ,shoot");
    }
}
