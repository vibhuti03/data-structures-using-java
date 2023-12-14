package Stacks;

public class UsingStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        for(int i = 0; i<6; i=i+1){
            stack.push(i);
        }
        for(int i = 0; i<3; i++){
            System.out.println("Element popped is: " + stack.pop());
        }
        System.out.println("Is my stack empty? " + stack.isEmpty());

        System.out.println("Size of my stack is: " + (stack.size()+1) );

        System.out.println("Current top element is: " + stack.peek());

        stack.print();

    }
}
