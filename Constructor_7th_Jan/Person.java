package Constructor_7th_Jan;

public class Person {
    String name ;
    int Rollnum;
    int age ;

    Person(){
        System.out.println("DC");
    }
    Person(String ref_name){
        this.name=ref_name;
    }

    Person(String ref_name , int ref_roll){
this.name=ref_name;
    }

    Person(String ref_name, int ref_roll, int age){
        this.name=ref_name;
        this.age=age;
        this.Rollnum=ref_roll;

    }void Print(){
        System.out.println(this.name);
    }

    void print(String name){
        System.out.println(this.name);
    }
    int printDetail(){
        System.out.println(this.name);
        System.out.println(this.age);
return 99;
    }
}
