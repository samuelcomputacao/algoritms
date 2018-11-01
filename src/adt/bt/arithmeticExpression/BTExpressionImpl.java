package adt.bt.arithmeticExpression;

import adt.bt.BTNode;

/**
 * An implementation of a BTExpression. Its root contains an Arithmetic Expression.
 * Some methods do not make sense in this kind of tree.  
 */
public class BTExpressionImpl implements BTExpression {
	
	private ArithmeticExpression root;

	public BTExpressionImpl(Builder builder) {
		root = builder.root;
	}

	@Override
	public BTNode<String> getRoot() {
		return this.root;
	}

	@Override
	public boolean isEmpty() {
		return this.root.isEmpty();
	}

	@Override
	public int height() {
		throw new RuntimeException("Method does not make sense");
	}

	@Override
	public BTNode<String> search(String elem) {
		throw new RuntimeException("Method does not make sense");
	}

	@Override
	public void insert(String value) {
		throw new RuntimeException("Method does not make sense");
	}

	@Override
	public void remove(String key) {
		throw new RuntimeException("Method does not make sense");	
	}

	@Override
	public String[] preOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] order() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] postOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return sizerec(getRoot());
	}

	private int sizerec(BTNode<String> node) {
		int resultado = 0;
		if(!node.isEmpty()) {
			resultado = 1 + sizerec(node.getLeft()) + sizerec(node.getRight());
		}
		return resultado;
	}

	@Override
	public Integer evaluate() {
		return root.evaluate();
	}
	
	public static class Builder{
		
		ArithmeticExpression root;
		
		public BTExpressionImpl.Builder root(ArithmeticExpression node){
			this.root = node;
			return this;
		}
		
		public BTExpressionImpl builder(){
			return new BTExpressionImpl(this);
		}
	}

}
