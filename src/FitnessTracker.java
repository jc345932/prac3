import java.time.LocalDate;

/**
 * Created by jc345932 on 3/08/17.
 */
public class FitnessTracker {
    private String activity;
    private int minsSpent;
    private LocalDate date;
    public FitnessTracker(){
        activity = "running";
        minsSpent = 1;
        date = LocalDate.of(2017, 1,1);
    }
    public String getActivity(){
        return activity;
    }

    public int getMinsSpent(){
        return minsSpent;
    }
    public LocalDate getDate(){
        return date;
    }
}

