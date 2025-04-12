public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap;


    public MyMinHeap() {
        heap = new MyArrayList<>();
    }


    public void insert(T element) {
        heap.add(element);
        siftUp(heap.size() - 1);
    }


    public T extractMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        T min = heap.get(0);
        T last = heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            heap.add(0, last);
            siftDown(0);
        }
        return min;
    }


    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap.get(0);
    }


    public boolean isEmpty() {
        return heap.isEmpty();
    }


    public int size() {
        return heap.size();
    }


    private void siftUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parent)) >= 0) {
                break;
            }
            swap(index, parent);
            index = parent;
        }
    }


    private void siftDown(int index) {
        int minIndex = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < heap.size() && heap.get(leftChild).compareTo(heap.get(minIndex)) < 0) {
            minIndex = leftChild;
        }
        if (rightChild < heap.size() && heap.get(rightChild).compareTo(heap.get(minIndex)) < 0) {
            minIndex = rightChild;
        }

        if (minIndex != index) {
            swap(index, minIndex);
            siftDown(minIndex);
        }
    }


    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.add(i, heap.get(j));
        heap.remove(i + 1);
        heap.add(j, temp);
        heap.remove(j + 1);
    }
}