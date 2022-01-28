package practice;

public class practiceInheritanceB extends practiceInheritance {
    int x = 30;
    // vars are not polymorphic,they do no not override each other.
    // Variables decision always happens at compile time so always Base Class Vars will be executed

    public static void main(String[] args) {

        practiceInheritanceB b = new practiceInheritanceB();
        System.out.println(b.x);
        practiceInheritance a = new practiceInheritance();
        System.out.println(a.x);
        practiceInheritance a2 = new practiceInheritanceB();
        System.out.println(a2.x);
    }
}


