package oop.class8Abstarction;
class Box <T>{

   T data;

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

}
public class Generic {
    public static void main(String[] args) {
        Box <Integer> b = new Box<>();
        b.setData(10);
        System.out.println(b.getData());

        Box <String> b2 = new Box<>();
        b2.setData("Alex");
        System.out.println(b2.getData());
    }
}
