package practice.oop.complex;

public class CandidateConstructorTest {
    public static void main(String[] args) {
        Candidate mark = new Candidate();
        // every time we create new object constructor will be called
        System.out.println(mark.name);

        Candidate elon = new Candidate("Elon Musk", "elon@gmail.com", 2);
        System.out.println(elon.name);
    }
}
