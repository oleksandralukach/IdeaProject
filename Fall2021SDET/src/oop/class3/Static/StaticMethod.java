package oop.class3.Static;


class Company{
    String companyName;
    static String regulation;

    public void displayCompanyName(){ // instance method
        System.out.println(companyName);

    }
    public static void displayRegulation(){ //static method
        System.out.println(regulation);
        // only way to call instance var is to create object of the class.
        // company name don't exist in a memory until object is created.
        Company c2 = new Company();
        System.out.println(c2.companyName);
    }

}
public class StaticMethod {
    public static void main(String[] args) {

        // How access static variable
        System.out.println(Company.regulation);
        Company.displayRegulation();

        // How access instance variable
        Company c = new Company();
        System.out.println(c.companyName);
        c.displayCompanyName();


        String str = "Hello";
        str.toUpperCase();

    }
}


