package homework_assignments;

public class HomeWork_4_Data_Types {
    /**
     //print out info of Microsoft Executives https://news.microsoft.com/leadership/ ->
     //title, First and Last Name, and their email. one executive per line. Email formats are firstname.lastname@microsoft.com
     //CEO - Satya Nadella - Satya.Nadella@microsoft.com
     //CCO -Judson Althoff - Judson.Althoff@microsoft.com
     */
    public static void main(String[] args) {
        String firstName1 = "Judson";
        String firstName2 = "Chris";
        String firstName3 = "Kathleen";
        String firstName4 = "Amy";
        String firstName5 = "Satya";
        String firstName6 = "Brad";
        String firstName7 = "Christopher";

        String lastName1 = "Althoff";
        String lastName2 = "Capossela";
        String LastName3 = "Hogan";
        String lastName4 = "Hood";
        String lastName5 = "Nadella";
        String lastName6 = "Smith";
        String lastName7 = "Young";

        String title1 = "CCO";
        String title2 = "CMO";
        String title3 = "CHRO";
        String title4 = "CFO";
        String title5 = "CEO";
        String title6 = "President and VC";
        String title7 = "EVP";

        String e = "@microsoft.com";
        String email1 = firstName1 + "." + lastName1 + e;
        String email2 = firstName2 + "." + lastName2 + e;
        String email3 = firstName3 + "." + LastName3 + e;
        String email4 = firstName4 + "." + lastName4 + e;
        String email5 = firstName5 + "." + lastName5 + e;
        String email6 = firstName6 + "." + lastName6 + e;
        String email7 = firstName7 + "." + lastName7 + e;

        System.out.println(title1 + " - " + firstName1 + " " + lastName1 + " - " + email1);
        System.out.println(title2 + " - " + firstName2 + " " + lastName2 + " - " + email2);
        System.out.println(title3 + " - " + firstName3 + " " + LastName3 + " - " + email3);
        System.out.println(title4 + " - " + firstName4 + " " + lastName4 + " - " + email4);
        System.out.println(title5 + " - " + firstName5 + " " + lastName5 + " - " + email5);
        System.out.println(title6 + " - " + firstName6 + " " + lastName6 + " - " + email6);
        System.out.println(title7 + " - " + firstName7 + " " + lastName7 + " - " + email7);
    }
}
