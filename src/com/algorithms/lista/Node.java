package com.algorithms.lista;

public class Node<T> {
	
	private T date;
	private Node<T> next;
	
	public Node(T date, Node<T> next) {
		super();
		this.date = date;
		this.next = next;
	}
	
	public Node() {
	}
	
	public T getDate() {
		return date;
	}
	public void setDate(T date) {
		this.date = date;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.date);
	}
	
	public boolean isNUll(){
		return this.date == null;
	}
	
	

}
