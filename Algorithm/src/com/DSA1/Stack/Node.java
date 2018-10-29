package com.DSA1.Stack;

public class Node<T> {
	private Node<T> previous;
	private T value;

	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node(T value) {

		this.value = value;
	}

}
