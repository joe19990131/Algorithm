package com.DSA1.LinkedList;

public class DoublyLinkedList2 extends LinkedList2<Student> {

	@Override
	public void addFirst(Student value) {
		// TODO Auto-generated method stub
		Node<Student> node = new Node<Student>(value);

		if (count == 0) {
			last = node;
		} else {
			
		}
	}

	@Override
	public void addLast(Student value) {
		// TODO Auto-generated method stub
		Node<Student> node = new Node<Student>(value);

		if (count == 0) {
			first = node;
		} else {
			
		}
	}

	@Override
	public void addBefore(com.DSA1.LinkedList.Node<Student> node, Student value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addAfter(com.DSA1.LinkedList.Node<Student> node, Student value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeLast() {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(com.DSA1.LinkedList.Node<Student> node) {
		// TODO Auto-generated method stub

	}

}
