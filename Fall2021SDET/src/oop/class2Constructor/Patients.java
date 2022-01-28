package oop.class2Constructor;

public class Patients {
    String dob;
    String nationality;
    String name;
    char gender;

    public Patients(String name, char gender) {
      this( "10/10/10", name,"American",gender); //default value of dob and nationality
    }

    public Patients(String dob, String nationality, String name, char gender) {
        this.dob = dob;
        this.nationality = nationality;
        this.name = name;
        this.gender = gender;
    }

    public Patients(String dob, String nationality, String name) {
        this(dob,nationality,name,'m'); // creating default value of gender
    }


}
