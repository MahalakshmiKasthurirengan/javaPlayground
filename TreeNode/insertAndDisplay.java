package TreeNode;

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class TreeNode{
    static Node root;
    
    public static void insert(int data){
        root = insertRec(root, data);
    } 
    
    public static Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
        }
        else if(data < root.data){
            root.left = insertRec(root.left, data);
        }
        else if(data > root.data){
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    
    public static void display(){
        postOrderRec(root);
    }
    
    public static void postOrderRec(Node root){
        if(root != null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}

public class insertAndDisplay {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        TreeNode tree = new TreeNode();
        for(int i = 0; i < n; i++){
            tree.insert(sc.nextInt());
        }
        tree.display();
    }
}