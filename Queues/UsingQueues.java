package Queues;

public class UsingQueues {
    public static void main(String[] args) {
        SimpleCircularQueue queue = new SimpleCircularQueue(5);

        System.out.println("Size of queue: " +(queue.size()));
        for(int i = 1; i<=5; i++){
            queue.enqueue(i);
        }
        System.out.println("Size of queue: " +(queue.size()));

        System.out.println("Current top element: " + queue.head());
        System.out.println("Current last element: " + queue.tail());

        for(int i=1; i<=5; i++){
            queue.print();
            System.out.println("Element dequeued: " + queue.dequeue());
            if(i==2 || i==4){
                queue.enqueue(i*10);
            }
        }


        System.out.println("Current top element: " + queue.head());
        System.out.println("Current last element: " + queue.tail());



    }
}
