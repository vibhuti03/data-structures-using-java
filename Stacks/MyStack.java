package Stacks;

public class MyStack {
    private static final int MAX_SIZE = 5;

    int[] myStack = new int[MAX_SIZE];

    int top;

    //default constructor initialize with top as -1
    MyStack(){
        top = -1;
    }

    /**
     * PUSH Function
     * Adds given element to top of stack
     */
    public void push(int elementToBePushedToStack){
        if(size()+1 == MAX_SIZE){
            System.out.println("ERROR : STACK OVERFLOW");
        } else {
            myStack[++top] = elementToBePushedToStack;
            System.out.println("Element pushed is: " +  myStack[top]);
        }
    }


    /**
     * POP Function
     * Removes and returns top most element of stack
     */
    public int pop(){
        if(isEmpty()) {
            System.out.println("ERROR: STACK UNDERFLOW");
            return -1;
        } else {
            return myStack[top--];
        }
    }

    /**
     * PEEK Function
     * Returns top most element of stack (without deleting it)
     */
    public int peek(){
        if(isEmpty()) {
            System.out.println("ERROR: STACK UNDERFLOW");
            return -1;
        } else {
            return myStack[top];
        }
    }

    /**
     * ISEMPTY Function
     * Returns true if stack does not contain any element, else false.
     */
    public boolean isEmpty(){
        return size() < 0;
    }

    /**
     * SIZE Function
     * Returns number of elements present in the stack when called
     */
    public int size(){
        return top;
    }

    /**
     * Print current stack (TopElement, TopElement-1, ......LastElement)
     */
    public void print(){
        for (int i=top; i>-1; i--){
            System.out.print(myStack[i] + ", ");
        }
        System.out.println();
    }

}
