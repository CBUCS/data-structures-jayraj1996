package cbu527.com.list;

public class ListMain {
    public static void main(String[] args) {
        LinkedListMethods linkedList = new LinkedListMethods();
        System.out.println("hey");
        System.out.println("Linked List Operations");
        linkedList.addItem(1);
        linkedList.addItem(3);
        linkedList.addItem(4);
        linkedList.addItem(5);
        linkedList.addItem(2,1);
        ListNode deleted = linkedList.remove(1);
        linkedList.print();
        System.out.println();
        System.out.println(deleted.data);

        StackMethods stack = new StackMethods();

        System.out.println("Stack Operations");
        stack.addItem(1);
        stack.addItem(2);
        stack.addItem(3);
        stack.addItem(4);
        stack.addItem(5);
        stack.print();
        stack.delete();
        stack.delete();
        System.out.println();
        stack.print();

        System.out.println("Queue and Dequeue operations");
        QueueDequeueMethods queue = new QueueDequeueMethods();
        queue.addItem(1);
        queue.addItem(2);
        queue.addItem(3);
        queue.addItem(4);
        queue.addItem(5);
        queue.delete();
        queue.print();

        System.out.println("Set Operations");
        int[] numbers1 = {9, 1, 4, 3, 7, 5};
        Set set1 = new Set(numbers1);
        int[] numbers2 = {4, 2, 8, 5, 7};
        Set set2 = new Set(numbers2);
        System.out.println(set1);
        System.out.println(set2);

        Set set = set1.intersection(set2);
        System.out.println(set);
    }
}
