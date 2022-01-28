package methods;

public class CharReturnType {
    public static void main(String[] args) {

        System.out.println(new CharReturnType().calculateGrade(78));
    }

    public char calculateGrade (int testScore){

        char grade = ' ';

        if (testScore >= 80){
            return 'A';
        } else if (testScore >= 60 && testScore < 80){
            return 'B';
        } else if (testScore >= 40 && testScore < 60){
            return 'C';
        }
        else {
            return 'D';
        }
    }

    // Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    // or return 0 if neither is in that range.

    public int max1020(int a, int b) {

        boolean isA = a >= 10 && a <= 20;
        boolean isB = b >= 10 && b <= 20;

        int max = 0;

        if (isA || isB){
            if ((isA && !isB)
                    || (isA && a > b)){
                return max = a;
            }
            else if ((isB && !isA)
                    || (isB && b >a)){
                return max = b;
            }}
        else {
            return max = 0;
        }
        return max;
    }
// or:
    public int max1020ab(int a, int b) {
        // First make it so the bigger value is in a
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    public boolean posNeg(int a, int b, boolean negative){

        if (negative) {
            negative = (a < 0 && b < 0);
            return negative;
        }

        if (!negative) {
            negative = (a > 0 && b < 0) || (b > 0 && a < 0);
            return negative;
        }
        else
            return false;
    }
}
