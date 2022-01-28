package string_builder;

public class StringBuilder1 {

    // String builder is a sequence of chars just like String, but it's mutable
    // we can use the same object to manipulate its value

    // append is like concat() method from String class
    // it adds string builder to the end of existing string builder

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("School");
        System.out.println(sb);

        sb.append("Devx"); // append method
        System.out.println(sb); //mutable

        String str = "School";
        System.out.println(str);

        str.concat("Devx"); // concat method
        System.out.println(str); // immutable
        str = str.concat("Devx");
        System.out.println(str);

        //==================================================

        StringBuilder sb1 = new StringBuilder("Devx");
        System.out.println(sb1);

        StringBuilder sb2 = sb1;
        System.out.println(sb2); // Devx

        sb1.append("School"); // sb1 = DevxSchool
        System.out.println(sb1);
        System.out.println(sb2); // sb2 pointing to sb1 object

        sb2.append("IsCool");
        System.out.println(sb2); // DevxSchoolIsCool
        System.out.println(sb1); // DevxSchoolIsCool -> bc they are both are pointing to the same object
    }
}
