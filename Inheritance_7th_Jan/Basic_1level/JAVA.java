package Inheritance_7th_Jan.Basic_1level;

public class JAVA extends Programming{

    String newfeature;

    JAVA(){
        System.out.println("Java-dc");
    }

    JAVA(String Feature){
        this.newfeature=Feature;
    }

    void print(){
        System.out.println("print new feature-->" +this.newfeature);

       //when you extend all featuers in programming are directly can access in java class

    //    int version;
//    String author;

//    Programming(){
//        System.out.println("DC");
//    }
//
//    Programming(String author, int version){
//        this.author = author;
//        this.version = version;
//    }
//
//    void printInfo(){
//        System.out.println(" Program Info ->  "+ this.version + " Author " + this.author);
    }

}
