package com.DSA1.LinkedList;

class Node<T> {
	// value
	
	private T value;
	Node<T> next = null;
	Node<T> previous;

	public Node(T value) {
		this.value = value;
	}

	

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
}

public abstract class LinkedList2<T> {
	protected int count;
	protected Node<T> first;
	protected Node<T> last;

	public Node<T> getFirst() {
		return first;
	}

	public Node<T> getLast() {
		return last;
	}

	public int size() {
		return count;
	}

	abstract public void addFirst(T value);

	abstract public void addLast(T value);

	abstract public void addBefore(Node<T> node, T value);

	abstract public void addAfter(Node<T> node, T value);

	abstract public void removeFirst();

	abstract public void removeLast();

	abstract public void remove(Node<T> node);
}


