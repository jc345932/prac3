

/**
 * Created by jc345932 on 3/08/17.
 */
public class BloodData {
    private String bloodType;
    private String rhFactor;
    public BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }
    public String getBloodType(){
        return bloodType;
    }
    public String getRh(){
        return rhFactor;
    }
}