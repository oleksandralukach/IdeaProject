package collections_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class NestedArrayList {
    public static void main(String[] args) {

        //ArrayList can store other collections as elements

        ArrayList <String> school1 = new ArrayList<>(Arrays.asList("Stanford", "PNU"));
        ArrayList <String> school2 = new ArrayList<>(Arrays.asList("MIT","OPI","UIC"));

        ArrayList <ArrayList<String>> schoolList = new ArrayList<>();

        schoolList.add(school1);
        schoolList.add(school2);

        System.out.println("School 1" + school1);
        System.out.println("School 2" + school2);
        System.out.println("School 3" + schoolList);

        //adding $ to every element in schoolList:
        for(int i = 0; i < schoolList.size();i++){
            for (int j = 0; j <schoolList.get(i).size(); j++){
                schoolList.get(i).set(j, ("$" + schoolList.get(i).get(j))); //double get to go inside nested element
            }
        }
        System.out.println("After adding $: " + schoolList);




    }
}
