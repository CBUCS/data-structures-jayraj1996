package cbu527.com.tree;

import java.util.Scanner;

public class TreeMain {
    public static void main(String[] args) {
        BinaryTreeMethods binaryTree = new BinaryTreeMethods();
        System.out.println("Binary Tree Test Cases");
        char character;
        do{
            System.out.println("Press 1 to insert node");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the data you want to insert");
                    binaryTree.insert(scan.nextInt());
                    break;
            }
            /* Display Tree*/
            System.out.print("\t Pre Order: ");
            binaryTree.preorder(binaryTree.root);
            System.out.println();
            System.out.print("\t Inorder:");
            binaryTree.inorder(binaryTree.root);
            System.out.println();
            System.out.print("\t PostOrder:");
            binaryTree.postorder(binaryTree.root);
            System.out.println("\n\n Do you want to continue Press y or n \n");
            character = scan.next().charAt(0);
        }while(character == 'Y' || character == 'y');

        NaryTreeMethods nary = new NaryTreeMethods();
        nary.insert(nary.root,1);

    }

}
