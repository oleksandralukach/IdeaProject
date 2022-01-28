package practice.oop.complex;

import java.util.Set;

public class Candidate {

    String name;
    int yearsOfExp;
    boolean hasEAD;
    Set<String> skills;
    String phoneNumber;
    String email;

    public Candidate(){
        System.out.println("Calling a constructor");
    }

    /**
     * Constructor overloading = different params
     */
    public Candidate(String name, String email, int years){
        System.out.println("Creating candidate object with params");
        this.name = name;
        this.email = email;
        this.yearsOfExp = years;
    }

}
