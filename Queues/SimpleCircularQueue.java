package Queues;

public class SimpleCircularQueue {

    private static int MAX_SIZE;
    private int[] myQueue;
    private int headPos = 0, size = 0;
    private int tailPos = -1;

    SimpleCircularQueue(int capacity){
        MAX_SIZE = capacity;
        myQueue = new int[capacity];
    }

    /**
     * ENQUEUE()
     * Adds the given element to the end of the queue
     */
    public void enqueue(final int elementToBeEnteredIntoQueue){
        if(size == MAX_SIZE){
            System.out.println("QUEUE OVERFLOW");
        }
        if(tailPos == MAX_SIZE-1){ //Queue is not empty so start entering elements from the front end
            tailPos=-1;
        }
            myQueue[++tailPos] = elementToBeEnteredIntoQueue;
            size++;
            System.out.println("Element enqueued: " +myQueue[tailPos]);

    }

    /**
     * DEQUEUE()
     * @return First element in the queue & deletes it
     */
    public int dequeue(){
        if(isEmpty()){
            System.out.println("QUEUE UNDERFLOW");
            return -1;
        }
        int dequeueElement = myQueue[headPos++];
        if(headPos == MAX_SIZE){ //Queue is not empty but headPos is already at (size+1), so put it to first position
            headPos=0;
        }
        size--;
        return dequeueElement;

    }

    /**
     * HEAD()
     * @return Value of first element in the queue
     */
    public int head(){
        if(isEmpty()){
            System.out.println("QUEUE UNDERFLOW");
            return -1;
        }
        return myQueue[headPos];
    }

    /**
     * TAIL()
     * @return Value of last element in the queue
     */
    public int tail(){
        if(isEmpty()){
            System.out.println("QUEUE UNDERFLOW");
            return -1;
        }
        return myQueue[tailPos];
    }

    /**
     * ISEMPTY()
     * @return True if there are no elements in the queue
     */
    public boolean isEmpty(){
        return (size == 0);
    }

    /**
     * SIZE()
     * @return Number of elements in queue
     */
    public int size(){
        return size;
    }

    /**
     * PRINT()
     * Prints the contents of queue at a given point in time from head to tail
     */
    public void print(){
        if(isEmpty()){
            System.out.println("QUEUE UNDERFLOW");
        }
        System.out.print("Contents of queue are: ");
        if(headPos<=tailPos)
        for(int i = headPos; i<=tailPos; i++){
            System.out.print(myQueue[i]+ ", ");
        }
        else {
            for(int i=headPos;i<MAX_SIZE;i++){
                System.out.print(myQueue[i]+ ", ");
            }
            for (int i =0; i<=tailPos; i++){
                System.out.print(myQueue[i]+ ", ");
            }
        }
        System.out.println();
    }

}
