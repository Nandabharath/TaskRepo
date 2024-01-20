package OOPs_14th_Jan_2024.Innerclass;

public class Lab155 {
    public static void main(String[] args) {
        student s= new student() {// interface we cannt create object but it call anonyms calss
            @Override
            public void setId() {

            }
        };//must

        s.setId();

        //NoName s2 = new NoName();
        ////        s2.setId();
        B b = new B() {
            // This is a Anoy class
            // No Name
        };
    }

}

abstract  class  B{
    int var_b=122;
}
interface  student {
    int id=11;
    void setId();
}

//class NoName implements Student{
//
//    @Override
//    public void setId() {
//
//    }
//}
