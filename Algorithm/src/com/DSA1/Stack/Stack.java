package com.DSA1.Stack;

public abstract class Stack<T> {
	protected int count;
	abstract public void push(T value);
	abstract public  T pop();
	abstract public T peek();
	public int size() {
		return count;
	}
	
}
