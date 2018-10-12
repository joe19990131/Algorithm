package com.DSA1.LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Node {
	String name;
	int no;
	int score;
	Node next;

	public Node(int no, String name, int score) {
		this.name = name;
		this.no = no;
		this.score = score;
		this.next = null;
	}
}

public class LinkedList {
	private Node first;
	private Node last;

	public boolean isEmpty() {
		return first == null;
	}

	public void print() {
		Node current = first;
		while (current != null) {
			System.out.println("[" + current.no + " " + current.name + " " + current.score + "]");

			current = current.next;
		}
		System.out.println("");
	}

	public void insert(int no, String name, int score) {
		Node newNode = new Node(no, name, score);
		if (this.isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	public static void main(String args[]) {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int no;
		String name;
		int score;
		
		
	}
}
