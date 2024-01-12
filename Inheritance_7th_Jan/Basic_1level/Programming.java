package Inheritance_7th_Jan.Basic_1level;

public class Programming {

    int version;
    String Author;

    Programming(){
        System.out.println("Programming -DC");
    }

    Programming(String Author1, int version1){
        this.Author=Author1;
        this.version= version1;
    }

    void printinfo(){
        System.out.println("print info-->"+"Author--" + this.Author +" Version --" + this.version);
    }

    void Car(){
        System.out.println("Lambo");
    }

    void BHK3(){
        System.out.println("3BHK");
    }
}
