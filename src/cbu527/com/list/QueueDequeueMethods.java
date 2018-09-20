package cbu527.com.list;

public class QueueDequeueMethods implements ListInterface{
    QueueNode front,rear;
    private int size;

    //Default constructor
    public QueueDequeueMethods(){
        front = null;
        rear = null;
        size = 0;
    }
    @Override
    public void addItem(Object data) {
        QueueNode temp = new QueueNode(data);
        if(rear == null){
            rear = temp;
            front = temp;
        }else{
            QueueNode current = rear;
            while(current.next != null){
                current = current.next;
            }
            current.next = temp;
        }
        size++;
    }

    @Override
    public Object delete() {
        if(front == null){
            System.out.println("Queue is empty");
        }
        QueueNode current = front;
        while(current != null){
               current = current.next;
        }
        return current;
    }

    @Override
    public void print() {
        if(size == 0){
            System.out.println("Queue is empty");
        }
        QueueNode temp = front;
        System.out.println("Queue List");
        while(temp != null){
            System.out.print("\t"+temp.data);
            temp = temp.next;
        }
        System.out.println();
    }


    @Override
    public void addItem(int item, int index) {

    }

    @Override
    public ListNode remove(int index) {
        return null;
    }


}

