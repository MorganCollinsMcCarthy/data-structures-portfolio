package projectCode20280;

public class ArrayStack<E> implements Stack<E> {
	public static final int CAPACITY=500;
	
	private int size;
	private int top=-1;
	private E[] s;
	
	public ArrayStack() {
		this(CAPACITY);
	}

	public ArrayStack(int c) {
		s=(E[]) new Object[c];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public void push(E e) {
		s[++top]=e;
		size++;
	}

	@Override
	public E top() {
		if(isEmpty())
			return null;
		return s[top];
	}

	@Override
	public E pop() {
		E pop = s[top];
		s[top]=null;
		top--;
		size--;
		return pop;
	}

}
