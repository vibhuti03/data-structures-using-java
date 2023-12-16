package Queues;

public class UsingPriorityQueues {
    public static void main(String[] args) {
        PriorityQueues priorityQueue = new PriorityQueues(5);

        priorityQueue.enqueue(20, 4);
        priorityQueue.enqueue(30, 3);
        priorityQueue.enqueue(50, 2);
        priorityQueue.enqueue(10, 1);
        priorityQueue.enqueue(60, 1);
//        priorityQueue.enqueue(50, 2);

        TopPriorityElement element = priorityQueue.peek();
        System.out.println("Highest prioirity in queue: " +element.index+ " has value : " +element.value);

        System.out.println("Element dequeued: " + priorityQueue.dequeue());
        System.out.println("Element dequeued: " + priorityQueue.dequeue());
        System.out.println("Element dequeued: " + priorityQueue.dequeue());
        System.out.println("Element dequeued: " + priorityQueue.dequeue());
        System.out.println("Element dequeued: " + priorityQueue.dequeue());
//        System.out.println("Element dequeued: " + priorityQueue.dequeue());


    }
}
