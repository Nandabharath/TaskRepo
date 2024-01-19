package OOPs_13th_Jan_2024.Encapsulation;

public class Lab147 {
    public static void main(String[] args) {

    Student s= new Student();
        s.name="nanda";
        s.name="Bharath";
        s.age=32;
s.print();

// Getter and setter - Condition Based
        // They should hidden
        Person p=new Person();
        p.id=1;
        p.id=2334;
        p.id=-1;
        p.bal=999;
        System.out.println( p.sum(12,23));
    }
}
