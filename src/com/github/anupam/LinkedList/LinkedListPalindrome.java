package com.github.anupam.LinkedList;

public class LinkedListPalindrome {
	
	public boolean isPalindrome (Node head) {
		
		//Break the List into equal two halves
		boolean result = true;
		Node[] pointers = breakLinkedList (head);
		Node firstHalf = pointers[0];
		Node secondHalf = pointers[1];
		//reverse the second half
		secondHalf = reverseList(secondHalf);
		//compare both
		Node temp1 = firstHalf;
		Node temp2 = secondHalf;
		if (temp1 == null || temp2 == null) {
			result = false;
		}
		while (temp1 != null && temp2 != null ) {
			System.out.println("Anupam: temp1:"+temp1.data+" temp2:"+temp2.data);
			if (temp1.data != temp2.data) {
				result = false;
				break;
			}
			temp1 = temp1.getNext();
			temp2 = temp2.getNext();
		}
		//reverse the second half again
		secondHalf = reverseList(secondHalf);
		while (firstHalf.next != null){
			firstHalf = firstHalf.getNext();
		}
		//join both halves to get original list
		firstHalf.setNext(secondHalf);
		return result;
	}

	private Node reverseList(Node head) {
		// TODO Auto-generated method stub
		Node curr = head;
		Node prev = null;
		Node next;
		while (curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		return prev;
	}

	private Node[] breakLinkedList(Node head) {
		// TODO Auto-generated method stub
		Node[] arr = new Node[2];
		Node slowPtr = head, fastPtr = head;
		if (head == null) {
			return null;
		}
		while (fastPtr.next != null && fastPtr.next.next != null) {
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
			System.out.println("slow:"+slowPtr.data+" fast:"+fastPtr.data);
		}
		
		
		    Node head1 = head;
		    Node head2 = slowPtr.getNext();
		    slowPtr.setNext(null);
			arr[0] = head1;
			arr[1] = head2;
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node newNode5 = new Node(1);
		Node newNode4 = new Node(3, newNode5);
		Node newNode3 = new Node (3, newNode4);
		Node newNode2 = new Node (1, newNode3);
		Node head = new Node (1, newNode2);
		LinkedListPalindrome llp = new LinkedListPalindrome();
		boolean result = llp.isPalindrome(newNode2);
		System.out.println(result);
	}

}

class Node {
	Node next;
	int data;
	public Node () {
		next = null;
		data = Integer.MAX_VALUE;
	}
	public Node (int data) {
		this.data = data;
		next = null;
	}
	public Node (int data, Node next) {
		this.data = data;
		this.next = next;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}
