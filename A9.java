package Assignment;
import static java.lang.System.exit; 

 class A9 {
	public class Node{
		
	
	int data;
	Node link;
	Node top;
	
	void A9()
	{
		this.top = null;
	}
	public void push(int x)
	{
		Node temp = new Node(); //create node n allocate mem
		if(temp == null)

	{
			System.out.print("overflow");
					
	}
		temp.data = x;//data into temp data field
		temp.link = top;//top reference into temp link
		top = temp;//upadte top refer
	}
	public boolean isEmpty()
	{
		return top == null;
	}
	public int peek()
	{
		if(isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("stack is empty");
			return -1;
		}
	}
		public void pop()
		{
			if(top == null) {
				System.out.print("underflow");
			}
			top = (top).link;
		}
		public void display()
		{
			if(top == null) {
				System.out.print("underflow");
				exit(1);
			}
			else {
				Node temp = top;
				while(temp != null) {
					System.out.print(temp.data+ "");
					temp = temp.link;
				}
			}
		}
	}
	public class stack{
 
 public static void main(String args[])
 {
	A9 a = new A9();
	a.push(10);
	a.push(20);
	a.push(30);
	a.push(40);
	
	a.display();
	System.out.println("peek:" + a.peek());
	a.pop();
	a.pop();
	a.display();
 }
}
	}
 