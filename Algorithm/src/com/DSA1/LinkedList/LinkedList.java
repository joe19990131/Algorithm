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
	Node ptr;
	public boolean isEmpty() {
		return first == null;
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

	public void headInsert(int no, String name, int score) {
		Node newNode = new Node(no, name, score);
		newNode.next = first;
		first = newNode;
	}

	public void endInsert(int no, String name, int score) {
		Node newNode = new Node(no, name, score);
		last.next = newNode;
		last = newNode;
	}

	public void midInsert(int no, String name, int score,Node ptr) {
		Node newNode = new Node(no, name, score);
		newNode = first;
		Node tmp = first;
		while(ptr.next!=newNode.next) {
			tmp = newNode;
			newNode = newNode.next;
		}
		tmp.next = ptr;
		ptr.next = newNode;
	}

	public void print() {
		Node current = first;
		while (current != null) {
			System.out.println("[" + current.no + " " + current.name + " " + current.score + "]");

			current = current.next;
		}
		System.out.println("");
	}

	public static void main(String args[]) {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int no;
		String name;
		int score;

	}
}
