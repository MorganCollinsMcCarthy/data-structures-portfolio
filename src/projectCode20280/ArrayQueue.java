package projectCode20280;

public class ArrayQueue<E> implements Queue<E> {
	
	private int size;
	private int front;
	private E[] s;

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
	public void enqueue(E e) {
		int rear = (front + size) % s.length;
		s[rear] = e;
		size++;
		
	}

	@Override
	public E first() {
		if(isEmpty())
			return null;
		return s[front];
	}

	@Override
	public E dequeue() {
		if(isEmpty())
			return null;
		E first = s[front];
		s[front]=null;
		front=(front++)%s.length;
		return first;
	}

}
