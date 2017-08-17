import java.time.LocalDate;

/**
 * Created by jc345932 on 3/08/17.
 */
public class TestFitnessTracker {
    public static void main (String[] args){
        FitnessTracker f1 = new FitnessTracker();
        System.out.println(f1.getActivity()+ " " + f1.getMinsSpent()+" minutes on "+ f1.getDate());
        LocalDate date = LocalDate.of(2016,9,30);
        FitnessTracker f2 = new FitnessTracker("Swimming",60,date);
        System.out.println(f2.getActivity()+" "+f2.getMinsSpent()+" minutes on "+f2.getDate());
    }
}
