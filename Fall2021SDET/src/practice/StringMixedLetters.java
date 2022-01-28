package practice;

public class StringMixedLetters {
    public static void main(String[] args) {
        String companyName = "Groupon";
        String companyNameMixed = "nopGrou";
        int[] indexes = {3, 4, 5, 6, 2, 1, 0};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < indexes.length; i++) {
            sb.append(companyNameMixed.charAt(indexes[i]));
        }
        System.out.println(sb);
    }
}
