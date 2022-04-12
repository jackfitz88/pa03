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
        return deleteNode(this.root, data);
    }

    private Node deleteNode(Node current, Integer data){
        //if it is the root
        if(current == this.root){
            this.root = null;
        }
        // if it isn't in there
        if(data < current.data){
            // before recurse you would have to check if left is null
            current.left = this.deleteNode(current.left, data);
        }
        else if(data > current.data){
            // before recurse you would have to check if right is null
            current.right = this.deleteNode(current.right, data);
        }
        else{
            //no child
            if(current.left == null && current.right == null){
            //just delete it
            return null;
            }
            //one child
            else if(current.left == null){
                return current.right;
            }
            else if(current.right == null){
                return current.left;
            }
        }
        
        //two children
        //(find the smallest value in the biggest subtree... go right then left all the way)

        return new Node(null);
    }

    public boolean contains(Integer data){
        Node current = this.root;

        while(current != null){
            if(data < current.data){
                current = current.left;
            }
            else if(data > current.data){
                current = current.right;
            }
            else{
                return true;
            }
        }
        
        return false;
    }

    public String toString(){
        Node current = this.root;
        StringBuilder stringBuilder = new StringBuilder();

        if(current != null){
            stringBuilder.append(this.inOrderTraversalNode(current.left));

            stringBuilder.append(current.data);
            stringBuilder.append(" ");

            stringBuilder.append(this.inOrderTraversalNode(current.right));
        }
        else{
            stringBuilder.append("Null ");
        }

        return stringBuilder.toString();
    }

    public BinarySearchTree rebalance(){
        BinarySearchTree bst = new BinarySearchTree();

        // get arraylist of current tree using in order

        //insert recursivley

        
        return bst;
    }

    public BinarySearchTree insertMidPoint(ArrayList<Integer> list, int start, int end){
        BinarySearchTree bst = new BinarySearchTree();

        //chcek if the start == end
        if(start == end){
            insert(start);
        }
        //find midpoint
        else if(start != end){
            int midpoint = end + start / 2;

        }
        //insert the midpoint

        //call with the left side(update the end index)

        //call wiht the right side(update the start index)

        return bst;
    }

    protected ArrayList<Integer> getSortedList(Node current){
        //create new array list
        ArrayList<Integer> sortedList = new ArrayList<>();
        // check is current is null
        if(current != null){

        }
        //add all the things from the left of the tree
        //recursive

        //add the current node

        //add all the things from the right of the tree
        //recursive

        //return the arraylist
        return sortedList;
    }

    public ArrayList<Integer> partition(Integer data){
        ArrayList<Integer> nums = new ArrayList<>();
        Node current = this.root;
        
        while(current != null){
            if(data < current.data){
                if(current.data.compareTo(data) >= 1){
                    nums.add(current.data);
                }
                current = current.left;
            }
            else if(data > current.data){
                if(current.data.compareTo(data) >= 1){
                    nums.add(current.data);
                }
                current = current.right;
            }
        }

        return nums;
    }


}
