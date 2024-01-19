package OOPs_13th_Jan_2024.Abstraction.Interfaces;

public class Nanda implements Father{

    @Override
    public void Loan() {
        Father.print2();
        System.out.println("i will give Money");
    }

    @Override
    public void print() {
        Father.super.print();
    }
}
