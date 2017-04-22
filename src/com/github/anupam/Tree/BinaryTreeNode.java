/**
 * 
 */
package com.github.anupam.Tree;

/**
 * @author anupam
 *
 */
public class BinaryTreeNode {

	private int data = Integer.MIN_VALUE;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	public BinaryTreeNode(int data) {
		this.data = data;
		left = right = null;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}
