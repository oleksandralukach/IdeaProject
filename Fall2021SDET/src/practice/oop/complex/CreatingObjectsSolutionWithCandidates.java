package practice.oop.complex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CreatingObjectsSolutionWithCandidates {

    public static void main(String[] args) {

        // we are creating an instance of the data type
        // like int a = 3;

        // if our instance vars are not initialized
        //they will get default value
        Candidates johnDoe = new Candidates();
        johnDoe.name = "John Doe";
        johnDoe.yearsOfExp = 5;
        johnDoe.hasEAD = true;

        // in order to access instance variables of an object
        // we need to put . after variable object name
        System.out.println(johnDoe.name);
        System.out.println(johnDoe.hasEAD);
        System.out.println(johnDoe.yearsOfExp);

        // storing our own data type in list, so we can store all info in one place
        List<Candidates> allCandidates = new ArrayList<>();
        allCandidates.add(johnDoe);

    }
//    Class is a data type
//    object is the instance(version)


}

class Candidates {

    // Every entity must have some characteristics aka state.
    //instance variable define an object characteristics/attributes
    //we have created our own data type (type of information)
    String name;
    int yearsOfExp;
    boolean hasEAD;
    Set<String> skills;
    String phoneNumber;
    String email;

}

