package set;

import java.util.HashSet;
import java.util.Set;

public class RemoveAll {

    // to find out what left in course (return what different between set1 and set2)
    public static void main(String[] args) {

        Set<String> SDETCurriculum = new HashSet<>();
        SDETCurriculum.add("Java");
        SDETCurriculum.add("Jira");
        SDETCurriculum.add("Junit");
        SDETCurriculum.add("Selenium");
        SDETCurriculum.add("Git");
        SDETCurriculum.add("Unix");


        Set<String> completedTools = new HashSet<>();
        completedTools.add("Junit");
        completedTools.add("Unix");

        SDETCurriculum.removeAll(completedTools);
        System.out.println(SDETCurriculum);



    }
}
