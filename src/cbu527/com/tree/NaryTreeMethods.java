package cbu527.com.tree;
import cbu527.com.tree.BinaryTreeMethods.*;

public class NaryTreeMethods implements TreeInterface {
    BinaryNode root,firstChild,nextSiblings;

    @Override
    public void insert(int data) {
        root = insert(root,data);
    }

    @Override
    public BinaryNode insert(BinaryNode node, int data) {
        if(node == null){
            return new BinaryNode(data);
        }else{
            firstChild = node;
            while(firstChild.next != null){
                firstChild = firstChild.next;  //Iterate till last node points to null
            }
            firstChild.next = node;
        }
        return firstChild.next;
    }


    @Override
    public void preorder(BinaryNode node) {
        System.out.println(node.data+" ");
        preorder(firstChild.next);
        preorder(firstChild = firstChild.next);
    }

    @Override
    public void inorder(BinaryNode node) {
        inorder(firstChild);
        System.out.println(node.data+" ");
        inorder(firstChild = firstChild.next);

    }

    @Override
    public void postorder(BinaryNode node) {
        postorder(firstChild);
        postorder(firstChild = firstChild.next);
        System.out.println(node.data+" ");
    }
}
