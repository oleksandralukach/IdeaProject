package coding_bat;

public class countHi {

    public static void main(String[] args) {
        System.out.println(countHi("HilolaHi"));
    }

    public static int countHi(String str) {

        String hi = "Hi";

        int i = 0;
        int count = 0;

        while (i < str.length() - 1) {

            String findHi = str.substring(i, i + 2);
            boolean isHi = findHi.equals("Hi");

            if (isHi) {

                count = count + 1;
            }

            i++;

        }
        return count;

    }


//    while (i < str.length()) {
//
//    if ( (str.charAt(i) == 'h') && (str.charAt(i+1) == 'i') )
//
//     {count+=1;}
//
//     i++;
//
//     }
//
//     }
//
//     return count;


}

