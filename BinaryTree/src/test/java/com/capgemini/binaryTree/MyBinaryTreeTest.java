package com.capgemini.binaryTree;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MyBinaryTreeTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void given3Numbers_WhenAddedBinaryTree_ShouldReturnSizeThree() 
    {
        MyBinaryTree<Integer>myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int size = myBinaryTree.getSize();
        Assert.assertEquals(13,size);
    }
}
