package OOPs_13th_Jan_2024.Accessmodifiers.Criminal;

import OOPs_13th_Jan_2024.Accessmodifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c=new Cop(10);
        System.out.println(Cop.gun);
       // Cop.canIShoot();
        //He is not in the Protect Police folder
    }
}
