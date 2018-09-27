package cbu527.com.list;

public interface ListInterface<T> {
    public void addItem(T item);
    public void addItem(int item,int index);
    public ListNode remove(int index);
    public Object delete();
    public void print();

}
