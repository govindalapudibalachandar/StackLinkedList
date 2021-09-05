package com.bridgelabz;

public class Test {

	public static void main(String[] args)  throws Exception{
	  
		Stack stack = new Stack();
		stack.display();
		stack.push(70);
		stack.push(30);
		stack.push(56);
	//	stack.display();
		
		int data = stack.peek();
	//	System.out.println(data);

		stack.pop();    //it will remove the top most element
		stack.pop();
		stack.pop();

		stack.display();

       Queue<Integer>queue= new Queue();
       queue.enqueue(56);
       queue.enqueue(30);
       queue.enqueue(70);
       
       System.out.println("Size Of The Queue:"+queue.size());
       System.out.println("An Item Dequeue:"+queue.dequeue());  //removing an item front
       
	} 

}
