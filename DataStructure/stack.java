package DataStructure;
import java.util.Stack;

public class stack {
    static void stack_push(Stack<Integer> stack){
        for(int i=0; i<5; i++) stack.push(i);
    }

    static void stack_pop(Stack<Integer> stack){
        for(int i=0; i<5; i++) stack.pop();
    }

    static void stack_peek(Stack<Integer> stack){
        System.out.println(stack.peek());
    }

    static void stack_search(Stack<Integer> stack, int element){
        System.out.println(stack.search(element));
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        stack_push(stack);
        stack_pop(stack);
        stack_peek(stack);
        stack_search(stack, 3);
        System.out.println(stack);
    }
}
