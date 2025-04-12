public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();


        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Size after adds: " + list.size()); // 3


        list.add(1, "X");
        System.out.println("Element at 1: " + list.get(1)); // X


        System.out.println("Element at 2: " + list.get(2)); // B


        String removed = list.remove(1);
        System.out.println("Removed: " + removed); // X
        System.out.println("New size: " + list.size()); // 3


        System.out.print("List contents: ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println(); // A B C


        list.clear();
        System.out.println("Is empty: " + list.isEmpty()); // true
    }
}