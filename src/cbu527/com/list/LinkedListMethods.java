package cbu527.com.list;


public class LinkedListMethods implements ListInterface{


    public ListNode head; //declaration of class

    //this methods is use to add item
    @Override
    public void addItem(Object item) {
        ListNode tempItem = new ListNode(item);
        if (head == null) {
            head = tempItem;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = tempItem;
        }

        //  incrementCounter();
    }

    //this methods is used to add item at a particular index
    @Override
    public void addItem(int item, int index) {
        ListNode temp = new ListNode(item);
        ListNode current = head;
        int i=0;
        while(i<index-1){
            current = current.next;
            i++;
        }
        temp.next = current.next;
        current.next = temp;
    }

    //remove the item from the list
    @Override
    public ListNode remove(int index) {
        int i=0;
        ListNode current = head;
        while(i<index-1) {
            current = current.next;
            i++;
        }
        ListNode delete = current.next;
        current.next = current.next.next;
        delete.next = null;
        return delete;
    }


    //print the whole linked list
    @Override
    public void print() {
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.print("null");
    }
    @Override
    public Object delete() {
        return null;
    }
}
