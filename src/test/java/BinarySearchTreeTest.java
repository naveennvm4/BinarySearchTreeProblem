import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
    @Test
    public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree(){
        BinarySearchTree<Integer> myBinaryTree= new BinarySearchTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        System.out.println("Size: "+size);
        Assertions.assertEquals(3, size);
    }
    @Test
    public void given13NumbersWhenAddedToBinaryTreeShouldReturnSizeThree(){
        BinarySearchTree<Integer> myBinaryTree= new BinarySearchTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        int size = myBinaryTree.getSize();
        System.out.println("Size: "+size);
        Assertions.assertEquals(13, size);
    }
    @Test
    public void givenSearch63ToBinaryTreeShouldReturn63(){
        BinarySearchTree<Integer> myBinaryTree= new BinarySearchTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        int result = myBinaryTree.search(63);
        System.out.println("Result: "+result);
        Assertions.assertEquals(63, result);
    }
}
