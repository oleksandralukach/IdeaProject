package methods;

public class MethodThatTakesParam {

    // method can take 0 or more params
    // and those params are local to that method only
    // if we pass more than 1 param then they have to be separated by comma

    public static void sayHiToStudent (String studentName, int studentAge){
        System.out.println("Hello " + studentName + ". You are " + studentAge);
    }

    public static void main(String[] args) {
        sayHiToStudent("Fahad",22);
    }
}
