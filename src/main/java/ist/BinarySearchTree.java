package ist;

import java.util.ArrayList;

public class BinarySearchTree {
    Node root;
    
    public void insert(Integer data){
        this.root = insertNode(this.root, data);
    }

    private Node insertNode(Node current, Integer data){
        // if the current is null just return the node
        if(current == null){
            return new Node(data);
        }

        // compare the data to the current node
        if(data < current.data){
            // before recurse you would have to check if left is null
            current.left = this.insertNode(current.left, data);
        }
        else if(data > current.data){
            // before recurse you would have to check if right is null

            current.right = this.insertNode(current.right, data);
        }

        return current;
    }

    public String inOrderTraversal(){
        return this.inOrderTraversalNode(this.root);
    }

    private String inOrderTraversalNode(Node current){
        StringBuilder stringBuilder = new StringBuilder();

        if(current != null){
            stringBuilder.append(this.inOrderTraversalNode(current.left));

            stringBuilder.append(current.data);
            stringBuilder.append(" ");

            stringBuilder.append(this.inOrderTraversalNode(current.right));
        }

        return stringBuilder.toString();
    }

    public Node delete(Integer data){
        //if it is the root

        // if it isn't in there

        //no child
        //just delete it

        //one child
        //shift up the child

        //two children
        //

        return new Node(null);
    }

    public boolean contains(Integer data){

        return true;
    }

    public String toString(){
        Node toPrint = this.root;

        StringBuilder stringBuilder = new StringBuilder();
        
        while(toPrint != null){
            stringBuilder.append(toPrint.data);
            stringBuilder.append(" -> ");
            toPrint = toPrint.right;
        }

        stringBuilder.append("Null");

        return stringBuilder.toString();
    }

    public BinarySearchTree rebalance(){
        BinarySearchTree bst = new BinarySearchTree();

        return bst;
    }

    public ArrayList<Integer> partition(Node data){
        ArrayList<Integer> nums = new ArrayList<>();

        return nums;
    }


}
