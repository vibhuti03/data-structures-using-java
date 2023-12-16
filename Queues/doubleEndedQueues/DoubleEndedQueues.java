package Queues.doubleEndedQueues;

public class DoubleEndedQueues {
    private static int MAX_SIZE;
    private int[] deQueue;
    private int headPos = 0, size = 0, tailPos = -1;

    DoubleEndedQueues(final int capacity){
        MAX_SIZE = capacity;
        deQueue = new int[capacity];
    }

    /**
     * topEnqueue()
     * Inserts elements to the top of the queue
     */
    public void topEnqueue(final int elementToBeAddedToTheTop){
        if(size == MAX_SIZE){
            throw new RuntimeException("QUEUE OVERFLOW");
        }
        if (headPos==0){
            headPos = MAX_SIZE;
        }
        deQueue[--headPos] = elementToBeAddedToTheTop;
        size++;
    }

    /**
     * bottomEnqueue()
     * Inserts elements to the bottom of the queue
     */
    public void bottomEnqueue(final int elementToBeAddedToTheLast){
        if(size == MAX_SIZE){
            throw new RuntimeException("QUEUE OVERFLOW");
        }
        if(tailPos == MAX_SIZE){
            tailPos = -1;
        }
        deQueue[++tailPos] = elementToBeAddedToTheLast;
        size++;
    }

    /**
     * topDequeue()
     * Returns elements from the top of the queue and deletes it
     */
    public int topDequeue(){
        if(size <= 0){
            throw new RuntimeException("QUEUE UNDERFLOW");
        }
        int value = deQueue[headPos++];
        size--;
        if(size == 0){
            headPos = 0;
            tailPos = -1;
        }
        else if(headPos == MAX_SIZE-1){
            headPos = 0;
        }
        return value;
    }

    /**
     * bottomDequeue()
     * Returns elements from the bottom of the queue and deletes it
     */
    public int bottomDequeue(){
        if(size <= 0){
            throw new RuntimeException("QUEUE UNDERFLOW");
        }
        int value = deQueue[tailPos--];
        size--;
        if(size == 0){
            headPos = 0;
            tailPos = -1;
        }
        else if(tailPos < 0 && size > 0){
            tailPos = MAX_SIZE-1;
        }
        return value;
    }
}
