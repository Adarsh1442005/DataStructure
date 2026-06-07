package Binarytree;

import java.util.*;
import java.io.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }

}

class info {
    int height;
    int diameter;

    public info(int dia, int height) {
        this.height = height;
        this.diameter = dia;

    }
}

class BinaryTree {
    int indx = -1;

    public Node build(int arr[]) {
        indx++;
        
        if (arr[indx] == -1) {
            return null;
        }
        Node root = new Node(arr[indx]);
        root.left = build(arr);
        root.right = build(arr);
        return root;

    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) {
            return;

        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    public int calcheight(Node root) {
        if (root == null) {
            return 0;
        }
        int left = calcheight(root.left);
        int right = calcheight(root.right);
        return Math.max(left, right) + 1;

    }

    public info dia(Node root) {
        if (root == null) {
            return new info(0, 0);
        }
        info left = dia(root.left);
        info right = dia(root.right);
        int diameter = Math.max(Math.max(left.diameter, right.diameter), left.height + right.height + 1);
        int height = Math.max(left.height, right.height) + 1;
        return new info(diameter, height);

    }

    public int sumnode(Node root) {
        if (root == null) {
            return 0;
        }
        int left = sumnode(root.left);
        int right = sumnode(root.right);
        return left + right + root.data;
    }

    public int countnode(Node root) {
        if (root == null) {
            return 0;
        }
        int left = countnode(root.left);
        int right = countnode(root.right);
        return left + right + 1;
    }
    public boolean  isidentical(Node root, Node subroot){
       if(root==null && subroot==null){
        return true;
       }
       else if(root==null || subroot==null || root.data!=subroot.data){
        return false;
       }
       if(!isidentical(root.left,subroot.left)){
        return false;
       }
       if(!isidentical(root.right,subroot.right)){
        return false;
       }
       return true;



    }
    public boolean subtree(Node root, Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isidentical(root, subroot)){
                return true;
            }
            else{
                return false;
            }
        }
        return subtree(root.left,subroot)|| subtree(root.right,subroot);
    


    }

}

public class Binarytreeconstruction {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("enter the size of the array");
        // int size=Integer.parseInt(obj.readLine());
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.build(arr);
        tree.preorder(root);
        System.out.println("the sum of the nodes are:");
        System.out.println(tree.sumnode(root));
        System.out.println(tree.countnode(root));
        System.out.println(tree.dia(root).diameter + "and height" + tree.dia(root).height);

    }

}
