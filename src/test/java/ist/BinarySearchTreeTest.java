package ist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTreeTest {

    @Test
    public void testConstructor() {
        
    }

    @Test
    public void testInsert() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(100);
        tree.insert(50);
        tree.insert(75);
        tree.insert(60);
        tree.insert(150);

        assertEquals(100, tree.root.data);
        assertEquals(50, tree.root.left.data);
        assertEquals(150, tree.root.right.data);
        assertEquals(60, tree.root.left.right.left.data);
    }

    @Test
    public void testInOrder() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(100);
        tree.insert(50);
        tree.insert(75);
        tree.insert(60);
        tree.insert(150);

        assertEquals("50 60 75 100 150 ", tree.inOrderTraversal());
    }

    @Test
    public void testDelete() {
        
    }

    @Test
    public void testContains() {
        
    }

    @Test
    public void testToString() {
        
    }

    @Test
    public void testRebalance() {
        
    }

    @Test
    public void testPartition() {
        
    }
}
