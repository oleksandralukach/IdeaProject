package data_structure_algo;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class QueueDataStructure {

    ArrayList<String> queue = new ArrayList<>();

    public void enQueue(String element){
        queue.add(element); //adds in the end
    }

    public String deQueue(){ //takes out first added element
        String bottomElement = peek();
        queue.remove(bottomElement);
        return bottomElement;
    }
    public String peek(){
        if(queue.isEmpty()){
            throw new EmptyStackException();
        }
        return queue.get(0);
    }
    public static void main(String args[]) {
        QueueDataStructure q = new QueueDataStructure();
        q.enQueue("Hello");
        q.enQueue("World");
        q.enQueue("Let's");
        q.enQueue("Smile");
        System.out.println("Initial Q: " + q.queue);
        System.out.println("Bottom element is: " + q.peek());
        System.out.println("Dequeue from the q: " + q.deQueue());
        System.out.println("Bottom element now is: " + q.peek());
        System.out.print("Elements present in stack now: " + q.queue);
    }
}
