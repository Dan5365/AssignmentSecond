public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();


        queue.enqueue("A");
        queue.enqueue("B");
        System.out.println("Size after enqueues: " + queue.size()); // 2


        System.out.println("Front element: " + queue.peek()); // A


        String dequeued = queue.dequeue();
        System.out.println("Dequeued: " + dequeued); // A
        System.out.println("New size: " + queue.size()); // 1


        queue.dequeue();
        System.out.println("Is empty: " + queue.isEmpty()); // true
    }
}