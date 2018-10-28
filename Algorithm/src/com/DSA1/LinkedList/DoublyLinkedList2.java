package com.DSA1.LinkedList;

public class DoublyLinkedList2<T> extends LinkedList2<T> {

	@Override
	public void addFirst(T value) {
		// TODO Auto-generated method stub
		Node<T> node = new Node<T>(value);

		if (count == 0) {
			last = node;
		} else {
			node.setNext(first);
			first.setPrevious(node);
		}
		first = node;
		++count;
	}

	@Override
	public void addLast(T value) {
		// TODO Auto-generated method stub
		Node<T> node = new Node<T>(value);

		if (count == 0) {
			first = node;
		} else {
			last.setNext(node);
			node.setPrevious(last);
		}
		last = node;
		++count;
	}

	@Override
	public void addBefore(Node<T> node, T value) {
		// TODO Auto-generated method stub
		Node<T> newNode = new Node<T>(value);
		newNode.setPrevious(node.getPrevious());
		node.getPrevious().setNext(newNode);
		node.setPrevious(newNode);
		newNode.setNext(node);
		if (count == 0) {
			first = newNode;
		}
		++count;

	}

	@Override
	public void addAfter(Node<T> node, T value) {
		// TODO Auto-generated method stub
		Node<T> newNode = new Node<T>(value);
		newNode.setNext(node.getNext());
		node.getNext().setPrevious(newNode);
		node.setNext(node);
		newNode.setPrevious(node);
		if (node == last) {
			last = newNode;
		}
		++count;

	}

	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub
		if (count == 0)
			throw new ArrayIndexOutOfBoundsException();
		else if (count == 1) {
			first = null;
			last = null;
		} else {
			Node<T> node = first.getNext();
			first.setNext(null);
			first.getNext().setPrevious(null);
			first = node;
		}--count;

	}

	@Override
	public void removeLast() {
		// TODO Auto-generated method stub
		if(count == 0)
			throw new ArrayIndexOutOfBoundsException();
		else if(count == 1){
			first = null;
			last = null;
		}else {
			Node<T> node = last.getPrevious();
			last.setPrevious(null);
			node.setNext(null);
			last = node;
		}--count;
	}

	@Override
	public void remove(Node<T> node) {
		// TODO Auto-generated method stub
		if(node == first)
			removeFirst();
		else if(node == last)
			removeLast();
		else {
			node.getPrevious().setNext(node.getNext());
			node.getNext().setPrevious(node.getPrevious());
			node.setNext(null);
			node.setPrevious(null);
			--count;
		}
	}

}
