package Constructor_7th_Jan;

public class Lab144 {
    public static void main(String[] args) {

        BankAccount sbi_ref=new BankAccount();
        sbi_ref.printDetails();

        System.out.println("----------- ----------");
        BankAccount hdfc_ref =new BankAccount("HDFC","hdfc0002");
        hdfc_ref.printDetails();

        System.out.println("------------ ---------");

        BankAccount icici_ref =new BankAccount("ICICI","icici0003");
        icici_ref.Bankcode="icici0005";
        icici_ref.printDetails();

        System.out.println("--------------- --------");

        BankAccount Yes_ref=new BankAccount("YESBANK", "YES0006");
        Yes_ref.printDetails();
    }
}
