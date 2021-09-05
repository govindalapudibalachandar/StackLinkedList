package com.bridgelabz;

public class Queue<T> {
	private Node<T> front;
	private Node<T>rear;
	private int length;
	
	private static class Node<T> {
		//variables
		private final T data;
		private Node <T> next;
		
		//constructor
		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	//enqueue operation
	public void enqueue(T data) {
		if(front == null) {
			rear=new Node<T>(data);
			front = rear;       
		}
		else
		{
			rear.next = new Node<T>(data);
			rear = rear.next;
		}
		length++;
		}
	public T dequeue() {
		if(front!=null) {
			T result = front.data;
			front = front.next;
			length--;
			return result;
		}
		return null;
	}
		//current size
		public int size() {
			return length;
		}
		//display method
		public void displayQueue() {
			Node<T>currentNode = front;
					while(currentNode!= null) {
						System.out.print(currentNode.data+" ");
						currentNode = currentNode.next;
						
		}
	}
	}


