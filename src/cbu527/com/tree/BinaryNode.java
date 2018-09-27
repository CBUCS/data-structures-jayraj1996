package cbu527.com.tree;

public class BinaryNode<T> {
    BinaryNode right,left,next;
    int data;

    //Default constructor
    public BinaryNode(int data){
        this.right = null;
        this.left = null;
        this.data = data;
    }

    //Mutator methods
    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
