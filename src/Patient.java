/**
 * Created by jc345932 on 3/08/17.
 */
public class Patient {
    private String idNum;
    private int age;
    private BloodData bloodData;
    public Patient(){
        idNum = "0";
        age = 0;
        bloodData = new BloodData();
    }
    public Patient(String id, int age, String btype, String rhfactor)
    {
        this.idNum = id;
        this.age = age;
        bloodData = new BloodData(btype, rhfactor);
    }

    public String getIdNum(){
        return idNum;
    }
    public void setIdNum(String idNum){
        this.idNum = idNum;
    }
    public int getAge(){

        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public BloodData getBloodData(){
        return bloodData;
    }
    public void setBloodType (BloodData b){
        bloodData = b;
    }

}
