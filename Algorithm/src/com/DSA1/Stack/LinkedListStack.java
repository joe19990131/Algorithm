package com.DSA1.Stack;

public class LinkedListStack<T> extends Stack<T> {
	private Node<T> last;

	@Override
	public void push(T value) {
		// TODO Auto-generated method stub
		Node<T> node = new Node<T>(value);
		node.setPrevious(last);
		last = node;
		++count;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		Node<T>node = last;
		last = node.getPrevious();
		node.setPrevious(null);
		--count;
		return node.getValue();
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return last.getValue();
	}

}
