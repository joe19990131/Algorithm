package com.DSA1.LinkedList;

class Node {
	int no;
	int score;
	Node next = null;

	public Node(int no, int score) {
		this.no = no;
		this.score = score;
		this.next = null;

	}

}

public class LinkedList2 {
	private Node first;
	private Node last;

	public Boolean isEmpty() {
		return first == null;
	}

	public void print() {
		Node current = first;
		while (current != null) {
			System.out.println("[" + current.no + " " + current.score + "]");
			current = current.next;
		}
		System.out.println(" ");
	}

	public void insert(int no ,int name ,Node ptr) {
		
	}



}
