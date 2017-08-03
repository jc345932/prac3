import java.time.LocalDate;

/**
 * Created by jc345932 on 3/08/17.
 */
public class TestFitnessTracker {
    public static void main(String[] args){
        FitnessTracker test = new FitnessTracker();
        System.out.println(test.getActivity()+ " "+ test.getMinsSpent()+ " "+"minutes on "+ test.getDate());
    }
}
