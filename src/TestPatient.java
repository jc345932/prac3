public class TestPatient {
    public static void main(String[] args){
        Patient p1 = new Patient();
        Patient p2 = new Patient("12", 35, "B","+");
        BloodData b2 = new BloodData("A", "-");
        display(p1);
        display(p2);
        p1.setIdNum("34");
        p1.setAge(42);
        BloodData b = new BloodData("B","-");
        p1.setBloodType(b);
        display(p1);
    }
    public static void display(Patient p){
        BloodData bt = p.getBloodData();
        System.out.println("Patient #" + p.getIdNum() + " age: " + + p.getAge() + "\n The blood type is " + bt.getBloodType() + bt.getRh());
    }
}
