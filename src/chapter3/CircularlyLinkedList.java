package chapter3;

public class CircularlyLinkedList<E> 
{
	private static class Node<E>
	{
		private E element;
		private Node<E> next;
		public Node(E e, Node<E> n)
		{
			element=e;
			next=n;
		}
		public E getElement() {return element;}
		public Node<E> getNext() {return next;}
		public void setNext(Node<E> n){next = n;}
	}
	
	private Node<E> tail = null;
	
	public CircularlyLinkedList(){}
	public boolean isEmpty(){return size() == 0;}
	public E first()
	{
		if (isEmpty()) return null;
		return tail.getNext().getElement();
	}
	public E last()
	{
		if (isEmpty()) return null;
		return tail.getElement();
	}
	
	public void rotate()
	{
		if (tail != null)
			tail = tail.getNext();
	}
	
	public void addFirst(E e)
	{
		if(size()==0)
		{
			tail = new Node<>(e,null);
			tail.setNext(tail);
		}
		else 
		{
			tail.setNext(new Node<>(e,tail.getNext()));
		}
	}
	
	public void addLast(E e)
	{
		addFirst(e);
		tail = tail.getNext();
	}
	
	public E removeFirst()
	{
		if(isEmpty()) return null;
		Node<E> head = tail.getNext();
		if (head == tail) tail = null;
		else tail.setNext(head.getNext());
		//size--;
		return head.getElement();
	}
	
	public int size()
	{
		if (tail==null) return 0;
		int size = 1;
		final Node<E> originalTail = tail;
		rotate();
		while (tail!=originalTail)
		{
			size++;
			rotate();
		}
		return size;
	}
	
	public boolean equals(CircularlyLinkedList cll)
	{
		System.out.println(this.size());
		System.out.println(cll.size());
		if (this.size() != cll.size()) return false;
		for (int i = 0; i < size(); i++)
		{
			if (this.first() != cll.first())
				return false;
			else
				rotate();
				cll.rotate();
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		CircularlyLinkedList<Integer> cll = new CircularlyLinkedList<Integer>();
		for (int i = 1; i < 100; i++)
		{
			cll.addFirst(i);
		}
		
		CircularlyLinkedList<Integer> circ = new CircularlyLinkedList<Integer>();
		for (int i = 1; i < 100; i++)
		{
			circ.addFirst(i);
		}
		
		if (cll.equals(circ)) System.out.println("True");
		else System.out.println("False");
		
//	System.out.println(cll.size());
	}

}
