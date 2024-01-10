package Constructor_7th_Jan;

public class ATBPerson {

    String name;
    String email;
    Long Phonenumber;
    Boolean married;
    String course_name;

    // default constructor

    ATBPerson(){  //Default constructor
        course_name="Automation";
        System.out.println("iam default constructor");
    }

    void talk(){
        System.out.println("iam a Method");
    }
     void Printdetails(){
         System.out.println(this.name);
         System.out.println(this.course_name);
     }

}
