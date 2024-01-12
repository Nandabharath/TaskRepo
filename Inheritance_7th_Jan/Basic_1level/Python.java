package Inheritance_7th_Jan.Basic_1level;

public class Python extends Programming  {

    @Override
    void BHK3() {
        super.BHK3();

        Programming p =new Programming();
        p.printinfo();
        p.Car();
        p.BHK3();
        //YOU CAN call methods from programing class
    }


}
