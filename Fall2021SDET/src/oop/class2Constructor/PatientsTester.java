package oop.class2Constructor;

public class PatientsTester {
    public static void main(String[] args) {

        Patients p = new Patients("12/12/10", "Egyptian","Mark");
        System.out.println(p.gender);

        Patients p2 = new Patients("Nana", 'w');
        System.out.println(p2.dob);
    }
}
