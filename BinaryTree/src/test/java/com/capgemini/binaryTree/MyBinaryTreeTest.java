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
        int size = myBinaryTree.getSize();
        Assert.assertEquals(3,size);
    }
}
