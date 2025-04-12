public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();


        stack.push("A");
        stack.push("B");
        System.out.println("Size after pushes: " + stack.size()); // 2

        System.out.println("Top element: " + stack.peek()); // B


        String popped = stack.pop();
        System.out.println("Popped: " + popped); // B
        System.out.println("New size: " + stack.size()); // 1


        stack.pop();
        System.out.println("Is empty: " + stack.isEmpty()); // true
    }
}