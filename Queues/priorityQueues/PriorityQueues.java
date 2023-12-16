package Queues.priorityQueues;

/**
 * ELEMENT - Class to represent the priority and value of each element in the Priority queue
 */
class Element {
    int priority, value;

    Element(int priority, int value) {
        if (priority <= 0 || value <= 0) {
            throw new RuntimeException("Priority and/or value cannot be less than 1");
        }
        this.value = value;
        this.priority = priority;
    }
}

public class PriorityQueues {
    private static int MAX_SIZE;
    private Element[] priorityQueue;
    private int size = 0;

    PriorityQueues(final int capacity) {
        MAX_SIZE = capacity;
        priorityQueue = new Element[MAX_SIZE];
    }

    /**
     * ENQUEUE() -
     * Adds the element to the queue along with storing its priority appropriately
     */
    public void enqueue(final int elementToBeAdded, final int priorityOfElementToBeAdded) {
        if (size == MAX_SIZE) {
            throw new RuntimeException("PRIORITY QUEUE OVERFLOW");
        }
        priorityQueue[size++] = new Element(priorityOfElementToBeAdded, elementToBeAdded);
        System.out.println("Element enqueued: " + elementToBeAdded + " with priority: " + priorityOfElementToBeAdded);
    }

    /**
     * PEEK()
     * Provides the index and value of the top most element in the priority queue
     */
    public TopPriorityElement peek() {
        if (isEmpty()) {
            throw new RuntimeException("PRIORITY QUEUE UNDERFLOW");
        }
        int highestPriority = 100000, highestPriorityValue = -1;
        int highestPriorityIndex = -1;
        for (int i = 0; i < size; i++) {
            if ((priorityQueue[i].priority < highestPriority)
                    || ((priorityQueue[i].priority == highestPriority) && (priorityQueue[i].value > highestPriorityValue))
            ) {
                highestPriority = priorityQueue[i].priority;
                highestPriorityValue = priorityQueue[i].value;
                highestPriorityIndex = i;
            }
        }
        return new TopPriorityElement(highestPriorityIndex, highestPriorityValue);
    }

    /**
     * DEQUEUE()
     * Gives the top element of the priority queue along-with removing it from the queue.
     */
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("PRIORITY QUEUE UNDERFLOW");
        }
        TopPriorityElement elementToBeDequeued = peek();
        int valueBeingDequeued = elementToBeDequeued.value;
        size--;
        for (int i = elementToBeDequeued.index; i < size; i++) {
            priorityQueue[i] = priorityQueue[i + 1];
        }
        return valueBeingDequeued;
    }

    private boolean isEmpty() {
        return size <= 0;
    }

}

/**
 * Class to store the index and value of top element in the priority queue.
 */
class TopPriorityElement {
    protected int index, value;

    TopPriorityElement(int index, int value) {
        if (index < 0) {
            throw new RuntimeException("Index value cannot be less than 1");
        }
        this.value = value;
        this.index = index;
    }
}
