package Queues.doubleEndedQueues;

public class UsingDoubleEndedQueues {
    public static void main(String[] args) {
        DoubleEndedQueues doubleEndedQueue = new DoubleEndedQueues(5);
        doubleEndedQueue.bottomEnqueue(10);
        System.out.println(doubleEndedQueue.topDequeue());
        doubleEndedQueue.topEnqueue(20);
        doubleEndedQueue.bottomEnqueue(30);
        System.out.println(doubleEndedQueue.bottomDequeue());
        System.out.println(doubleEndedQueue.topDequeue());
        doubleEndedQueue.bottomEnqueue(10);
        doubleEndedQueue.bottomEnqueue(20);
        doubleEndedQueue.bottomEnqueue(30);
        doubleEndedQueue.bottomEnqueue(40);
        doubleEndedQueue.bottomEnqueue(50);
        System.out.println(doubleEndedQueue.bottomDequeue());
        System.out.println(doubleEndedQueue.topDequeue());
        System.out.println(doubleEndedQueue.bottomDequeue());
        System.out.println(doubleEndedQueue.topDequeue());
        System.out.println(doubleEndedQueue.bottomDequeue());
//        System.out.println(doubleEndedQueue.topDequeue());
        doubleEndedQueue.topEnqueue(30);
        doubleEndedQueue.bottomEnqueue(50);
    }
}
