package com.DSA1.LinkedList;

public class SingltLinkedList2 extends LinkedList2<Student> {

	@Override
	public void addFirst(Student value) {
		// TODO Auto-generated method stub
		Node<Student> node = new Node<Student>(value);
		if (count == 0) {
			last = node;
		} else {
			node.setNext(first);
			first = node;
			++count;
		}
	}

	@Override
	public void addLast(Student value) {
		// TODO Auto-generated method stub
		Node<Student> node = new Node<Student>(value);
		if (count == 0) {
			first = node;
		} else {
			last.setNext(node);
			last = node;
			++count;
		}
	}

	@Override
	// add before node
	public void addBefore(Node<Student> node, Student value) {
		// TODO Auto-generated method stub
		Node<Student> newNode = new Node<Student>(value);
		if (node == first) {
			first = newNode;
		} else {
			Node<Student> preNode = findPreviousNode(node);
			preNode.setNext(newNode);
		}
		newNode.setNext(node);
		++count;

	}

	@Override
	public void addAfter(Node<Student> node, Student value) {
		// TODO Auto-generated method stub
		Node<Student> newNode = new Node<Student>(value);
		newNode.setNext(node.next);
		node.setNext(newNode);
		if (node == last) {
			last = newNode;
		}
		++count;
	}

	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub
		if (count == 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else if (count == 1) {
			first = null;
			last = null;
		} else {
			Node<Student> node = first.getNext();
			first.setNext(null);
			first = node;
		}
		--count;
	}

	@Override
	public void removeLast() {
		// TODO Auto-generated method stub
		if (count == 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else if (count == 1) {
			first = null;
			last = null;
		} else {
			Node<Student> node = findPreviousNode(last);
			node.setNext(null);
			last = node;
		}
	}

	@Override
	public void remove(Node<Student> node) {
		// TODO Auto-generated method stub
		if (node == first) {
			removeFirst();
		} else if (node == last) {
			removeLast();
		} else {
			Node<Student> preNode = findPreviousNode(node);
			if (preNode == null) {
				throw new ArrayIndexOutOfBoundsException();
			}
			preNode.setNext(node.next);
			node.setNext(null);
			--count;
		}
	}

	private Node<Student> findPreviousNode(Node<Student> node) {
		Node<Student> preNode = first;
		while (preNode != null) {
			if (node == preNode.getNext())
				break;
			preNode = preNode.getNext();
		}
		return preNode;
	}
}
