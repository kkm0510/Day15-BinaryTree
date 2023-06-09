package test;

import main.MyBinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {

    MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree<>();

    @Test
    public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree(){
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size= myBinaryTree.getSize();
        Assert.assertEquals(3, size);
    }

    @Test
    public void givenMultipleNumbersWhenAddedToBinaryTreeShouldReturnSizeEqualToCountOfNumbers(){
        given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree();
        myBinaryTree.add(3);
        myBinaryTree.add(11);
        myBinaryTree.add(16);
        myBinaryTree.add(22);
        myBinaryTree.add(60);
        myBinaryTree.add(40);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int size= myBinaryTree.getSize();
        Assert.assertEquals(13, size);
    }

    @Test
    public void givenANumberSearchInABinarySearchTreeShouldReturnTrueIfPresentElseFalse(){
        givenMultipleNumbersWhenAddedToBinaryTreeShouldReturnSizeEqualToCountOfNumbers();
        boolean isPresent=myBinaryTree.search(63);
        Assert.assertTrue(isPresent);
    }
}
