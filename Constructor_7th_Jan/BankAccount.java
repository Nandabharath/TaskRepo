package Constructor_7th_Jan;

public class BankAccount {

    String Bankname;
    String Bankcode;
    int Balance;

    BankAccount(){ // default constructor
        Bankname="SBI BANK";
        Bankcode="sbi0001";
        System.out.println("Default C");
    }

    BankAccount(String Bname, String bcode){// Paramaterised constructor
        this.Bankname=Bname;
        this.Bankcode=bcode;
        System.out.println("Param constructor");

    }

    void printDetails() {
        System.out.println("Bank Name -> " + this.Bankname);
        System.out.println("Bank Code -> " + this.Bankcode);
        System.out.println("Bal ->" + Balance);
    }


}
