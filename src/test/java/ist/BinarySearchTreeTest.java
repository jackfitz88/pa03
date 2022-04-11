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
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(100);
        tree.insert(50);
        tree.insert(75);
        tree.insert(60);
        tree.insert(150);

        tree.delete(50);

        assertEquals("60 75 100 150", tree.inOrderTraversal());
    }

    @Test
    public void testContains() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(100);
        tree.insert(50);
        tree.insert(75);
        tree.insert(60);
        tree.insert(150);

        assertEquals(true, tree.contains(50));
        assertEquals(false, tree.contains(80));
    }

    @Test
    public void testToString() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(100);
        tree.insert(50);
        tree.insert(75);
        tree.insert(60);
        tree.insert(150);

        assertEquals("100 50 75 60 150", tree.toString());
    }

    @Test
    public void testRebalance() {
        
    }

    @Test
    public void testPartition() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(100);
        tree.insert(50);
        tree.insert(75);
        tree.insert(60);
        tree.insert(150);

        assertEquals("[100 75 60 150]", tree.partition(55).toString());
        assertEquals("[100 150]", tree.partition(75).toString());
        assertEquals("[]", tree.partition(150).toString());
    }
}
