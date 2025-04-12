public class MyMinHeapTest {
    public static void main(String[] args) {
        MyMinHeap<Integer> heap = new MyMinHeap<>();


        heap.insert(3);
        heap.insert(1);
        heap.insert(4);
        heap.insert(2);
        System.out.println("Size after inserts: " + heap.size()); // 4


        System.out.println("Min element: " + heap.peek()); // 1


        int min = heap.extractMin();
        System.out.println("Extracted min: " + min); // 1
        System.out.println("New min: " + heap.peek()); // 2
        System.out.println("New size: " + heap.size()); // 3


        heap.extractMin();
        heap.extractMin();
        heap.extractMin();
        System.out.println("Is empty: " + heap.isEmpty()); // true
    }
}