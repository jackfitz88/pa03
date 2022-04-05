package ist;

import java.util.ArrayList;

public class BinarySearchTree {
    Node root;
    
    public Node insert(Integer data){

        return new Node(null);

    }

    public Node delete(Integer data){
        //if it is teh root

        // if tit isn't in there

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
