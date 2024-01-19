package OOPs_13th_Jan_2024.Abstraction.Interfaces.Interview_question;

public class RC implements pramd ,course{
    @Override
    public void atb() {

    }
}

interface pramd extends  course{

}
interface  course{
    void atb();
}