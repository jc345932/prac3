/**
 * Created by jc345932 on 3/08/17.
 */
public class TestBloodData {
    public static void main (String[] args){
        BloodData bd1 = new BloodData();
        BloodData bd2 = new BloodData("A","-");
        display(bd1);
        display(bd2);
        bd1.setBloodType("AB");
        bd1.setRhFactor("-");
        display(bd1);
    }
    public static void display(BloodData bd){
        System.out.println("This blood type is: "+ bd.getBloodType()+ bd.getRh());
    }
}
