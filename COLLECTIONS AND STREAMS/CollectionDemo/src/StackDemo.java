import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(" Current Stack " + stack);
        System.out.println(" Stack Pop = " + stack.pop());
        System.out.println(" Current Stack " + stack);
        System.out.println(" Stack Pop = " + stack.peek());
        System.out.println(" Current Stack " + stack);
        System.out.println(" Check if Stack is Empty " + stack.isEmpty());
        System.out.println(" Search in Stack  " + stack.search(20));

        for ( Integer x : stack)
            System.out.println(x);




    }
}
