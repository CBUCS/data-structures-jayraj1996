package cbu527.com.tree;

public class BinaryTreeMethods<T> implements TreeInterface<T>{
    BinaryNode root;
    @Override
    public void insert(int data) {
        root = insert(root,data);
    }

    @Override
    public BinaryNode insert(BinaryNode node, int data) {
        if (node == null) {
            return new BinaryNode(data);
        }
        if(data < node.data){   //if the current data is less than root than insert to left node or else right node
            node.left = insert(node.left,data);
        }else if(data > node.data){
            node.right = insert(node.right,data);
        }else{
            return node;  //value already exists.
        }
        return node;
    }
    //Traverse the tree in preorder manner
    @Override
    public void preorder(BinaryNode node) {
        if(node != null){
            System.out.print(node.getData()+" ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }
    //traverse the tree in inorder manner
    @Override
    public void inorder(BinaryNode node) {
        if(node != null){
            inorder(node.getLeft());
            System.out.print(node.getData()+" ");
            inorder(node.getRight());
        }
    }
    //traverse the tree in postorder manner
    @Override
    public void postorder(BinaryNode node) {
        if(node != null){
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getData()+" ");
        }
    }
}
