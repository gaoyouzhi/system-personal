package com.haochang.structure;

import com.alibaba.druid.sql.visitor.functions.Bin;

/**
 * 二叉查找树
 */
public class BinaryTree {
    int data;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void insert(BinaryTree root, int data){
        if(root.data < data){
            if(root.right == null){
                root.right = new BinaryTree(data);
            } else {
                insert(root.right, data);
            }
        } else {
            if(root.left == null){
                root.left = new BinaryTree(data);
            } else {
                insert(root.left, data);
            }
        }
    }


    //中序遍历
    public void in(BinaryTree node){
        if(null != node){
            in(node.left);
            System.out.print(node.data + " ");
            in(node.right);
        }

    }

    //前序遍历
    public void pre(BinaryTree node){
        if(null != node){
            System.out.print(node.data + " ");
            pre(node.left);
            pre(node.right);
        }
    }

    //后序遍历
    public void next(BinaryTree node){
        if(null != node){
            next(node.left);
            next(node.right);
            System.out.print(node.data + " ");
        }

    }

    public static void main(String[] args) {
        int[] data = new int[]{0, 23, 21, 1, 3, 4, 5};
        BinaryTree binaryTree = new BinaryTree(data[0]);

        for (int i = 1; i < data.length; i++) {
            binaryTree.insert(binaryTree, data[i]);
        }

        System.out.println("中序遍历");
        binaryTree.in(binaryTree);
        System.out.println("");

        System.out.println("前序遍历");
        binaryTree.pre(binaryTree);
        System.out.println("");

        System.out.println("后序遍历");
        binaryTree.next(binaryTree);
    }

}
