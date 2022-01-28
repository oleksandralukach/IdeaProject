package practice.oop.complex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ObjectsCandidateApproved {
    public static void main(String[] args) {

        Candidates c1 = new Candidates();
        c1.name = "John Doe";
        c1.yearsOfExp = 10;
        c1.hasEAD = true;
        c1.skills = new HashSet<>();
        c1.skills.add("java");
        c1.skills.add("junit");
        c1.skills.add("selenium");
        c1.phoneNumber = "773 999 5367";
        c1.email = "johndoe@gmail.com";
        System.out.println(isApproved(c1));

        Candidates c2 = new Candidates();
        c2.name = "David";
        c2.yearsOfExp = 8;
        c2.hasEAD = false;
        c2.skills = new HashSet<>();
        c2.skills.add("java");
        c2.skills.add("junit");
        c2.skills.add("selenium");
        c2.phoneNumber = "773 555 3338";
        c2.email = "david@gmail.com";
        System.out.println(isApproved(c2));

        // now we have a way of storing all the candidates
        List<Candidates> allCandidates = new ArrayList<>();
        allCandidates.add(c1);
        allCandidates.add(c2);

        printApprovedInfo(allCandidates);
    }

    public static boolean isApproved(Candidates candidate) {

        Set<String> requiredSkills = new HashSet<>();
        requiredSkills.add("java");
        requiredSkills.add("selenium");
        requiredSkills.add("junit");
        return candidate.yearsOfExp > 6 && candidate.hasEAD && candidate.skills.containsAll(requiredSkills);
    }
    // write a method which takes list of candidates
    // and print out name, phone number and email of approved candidates
    public static void printApprovedInfo(List<Candidates> allCandidates){
      for(Candidates object : allCandidates) {
          if (isApproved(object)){
              System.out.println(object.name);
              System.out.println(object.phoneNumber);
              System.out.println(object.email);
          }
      }
    }
}
