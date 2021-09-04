package com.bridgelabz;

//class representing node
 class Node {
	 int data;
	 Node next;
	 //constructor
	 public Node (int data) {
		 this.data= data;
		 this.next= null;
	 }
 }
public class Stack {
	private Node head;
	//constructor
	public Stack() {
		this.head=null;  //intiall first it is a null
	}
	//method for push
	public void push(int data) {
		//constructor
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}
	//method for display
	public void display() {
		if (this.head==null)
		{
			System.out.println("Stack Is Empty");
		}
		Node temp = this.head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		
		}
	}

}
