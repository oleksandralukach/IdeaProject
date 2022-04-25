package practice;

public class StringContainsDigits {

    public static void main(String args[]){
        String sample = "krishna64";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sample.length(); i++) {
            if (Character.isDigit(sample.charAt(i))){
                sb.append(sample.charAt(i));
            }
        }
        System.out.println(sb);

        //option2: with array
        StringBuilder sb2 = new StringBuilder();

        char[]arr = sample.toCharArray();
        for (char ch : arr) {
            if (Character.isDigit(ch)){
                sb2.append(ch);
            }
        }
        System.out.println(sb2);
    }
}
