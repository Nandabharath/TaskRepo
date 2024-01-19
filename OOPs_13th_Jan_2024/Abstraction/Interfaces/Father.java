package OOPs_13th_Jan_2024.Abstraction.Interfaces;

public interface Father {
void  Loan();

default void  print(){
    System.out.println("iam default method");
}

static void print2(){
    System.out.println("iam static method");
}
}
