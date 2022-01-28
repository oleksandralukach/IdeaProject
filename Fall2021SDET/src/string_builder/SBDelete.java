package string_builder;

public class SBDelete {

    // StringBuilder delete(int start, int end)
    // return a reference to the same StringBuilder by deleting char sequence
    // starting at start index and ending before end index

    // StringBuilder deleteCharAt(int target)
    //returns a reference to the same string builder object by removing the char at target index

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("DevX");

        sb.delete(1,3);
        System.out.println(sb); // DX

        StringBuilder school = new StringBuilder("Stanford");

        String s = school.substring(school.indexOf("f")); // substring() does not change the value of string builder object

//        StringBuilder s1 = new StringBuilder();
//        s1.append(school.substring(school.indexOf("f")));

        StringBuilder schoolDeleted = school.delete(school.indexOf("f"),school.length());

        System.out.println(schoolDeleted); // Stan
        System.out.println(school); // Stan
        System.out.println(s); // ford

        //======================================================================

        StringBuilder college = new StringBuilder("Harvard");

        college.deleteCharAt(college.length()/2); // dividing by 2 we get the index of middle char
        System.out.println(college); // Harard
    }
}
