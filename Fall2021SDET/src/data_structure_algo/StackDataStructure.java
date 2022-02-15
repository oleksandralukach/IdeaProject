package data_structure_algo;


import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class StackDataStructure {

    ArrayList<Integer> stack = new ArrayList<>();

    public Integer push(Integer element) {
        stack.add(element); //adds at the end
        return element;
    }

    public Integer pop() { //takes out last added element
        Integer topElement = peek();
        stack.remove(topElement);
        return topElement;
    }

    public Integer peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public static void main(String args[]) {
        StackDataStructure s = new StackDataStructure();
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        System.out.println("Initial Stack: " + s.stack);
        System.out.println("Top element is: " + s.peek());
        System.out.println("Popped from the stack: " + s.pop());
        System.out.println("Top element now is: " + s.peek());
        System.out.print("Elements present in stack now: " + s.stack);
    }
}

