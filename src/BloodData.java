/**
 * Created by jc345932 on 3/08/17.
 */
public class BloodData {
    private String bloodType;
    private String rhFactor;

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }
    public BloodData(String ty, String fact) {
      bloodType=ty;
      rhFactor=fact;
    }
    public String getBloodType(){

        return bloodType;
    }
    public void setBloodType(String ty){
        this.bloodType = ty;
    }
    public String getRh(){

        return rhFactor;
    }
    public void setRhFactor(String fact){
        this.rhFactor = fact;
    }
}
