package practice.oop.complex;

import java.util.HashSet;
import java.util.Set;

/**
 * Application which filters candidates for job
 * <p>
 * Candidate should have:
 * more than 6 years of expirience
 * know at least Java, Junit, Selenium
 * has EAD
 */
public class CandidatesIsApproved {
    public static void main(String[] args) {
        Set<String> candidate1Skills = new HashSet<>();
        candidate1Skills.add("Java");
        candidate1Skills.add("C++");
        candidate1Skills.add("Junit");
        candidate1Skills.add("Selenium");
        boolean candidate1HasEAD = true;
        int candidate1YearsOfEx = 7;
        System.out.println(isApproved(candidate1HasEAD, candidate1YearsOfEx, candidate1Skills));

        Set<String> candidate2Skills = new HashSet<>();
        candidate2Skills.add("C++");
        candidate2Skills.add("Junit");
        candidate2Skills.add("Selenium");
        boolean candidate2HasEAD = true;
        int candidate2YearsOfEx = 9;
        System.out.println(isApproved(candidate2HasEAD, candidate2YearsOfEx, candidate2Skills));
    }

    public static boolean isApproved(boolean hasEAD, int yearsOfEx, Set<String> skills) {

        Set<String> requiredSkills = new HashSet<>();
        requiredSkills.add("Java");
        requiredSkills.add("Selenium");
        requiredSkills.add("Junit");

        return hasEAD && yearsOfEx > 6 && skills.containsAll(requiredSkills);
    }

}
