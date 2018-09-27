package cbu527.com.tree;

public interface TreeInterface<T> {
    public void insert(int data);
    public BinaryNode insert(BinaryNode node, int data);
    public void preorder(BinaryNode node);
    public void inorder(BinaryNode node);
    public void postorder(BinaryNode node);
}
