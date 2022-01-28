package arrays;

public class EnhancedForLoop {

    // enhanced for loop is aka for each loop
    // which is used to iterate over collections
    // Syntax is as follows:
    // for (dataType elementName : collection) {}

    public static void main(String[] args) {

        String[] names = new String[]{"Aisha", "Vipra", "Elena", "Serhii"};
        System.out.println("The length of names array is: " + names.length);

//        for (String nameElement : names) {
//            System.out.println(nameElement);
//        }

        for (String name : names) {
            if (name.startsWith("E")) System.out.println(name);
        }

        char[] charArr = {'a', 'b', 'f', 'd', 'r'};
        System.out.println("The length of charArr array is: " + charArr.length);

        for (char charElement : charArr) {
            if (charElement == 'a' || charElement == 'f' || charElement == 'r')
                System.out.println("The current char is: " + charElement);
        }
    }
}
