package OOPs_14th_Jan_2024.Interview;

public class Abstraction {
}

abstract class per{
    abstract void say();
    abstract  void say1();
    void  eat () {
        System.out.println(" i can eat");
    }
}
abstract class  student extends per{
    abstract void m3();
    abstract void m4();
}
class nanda extends student{

    @Override
    void m3() {

    }

    @Override
    void m4() {

    }

    @Override
    void say() {

    }

    @Override
    void say1() {

    }
}