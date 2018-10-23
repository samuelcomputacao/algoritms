package com.algorithms.lista;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lista<T> implements List<T> {

	private Node<T> node;
	private int elements;

	public Lista() {
		elements = 0;
		node = new Node<>(null,new Node<>());
	}

	@Override
	public int size() {
		return this.elements;
	}

	@Override
	public boolean isEmpty() {
		return this.elements == 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T e) {
		if(node.isNUll()) {
			node.setDate(e);
			node.setNext(new Node<T>());
		}else {
			Node aux = node;
			while(!aux.isNUll()) {
				aux = aux.getNext();
			}
			
			aux.setDate(e);
			aux.setNext(new Node<T>());
			
		}
		elements++;
		return true;
		
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub

	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		String str = "[";
		Node node = this.node;
		while (!node.isNUll()) {
			if (str.length() > 1) {
				str += ", " + node.toString();
			} else {
				str += node.toString();
			}
			node = node.getNext();
		}
		str += "]";
		return str;

	}

	public void inverte() {
		if(!this.isEmpty()) {
			Node node = new Node<>(this.node.getDate(),new Node<>());
			
			Node aux = node.getNext();
			while(!aux.isNUll()) {
				Node novo = aux;
				novo.setNext(node);
				node = novo;
				aux = aux.getNext();
			}
			this.node = node;
		}
		
	}

}
