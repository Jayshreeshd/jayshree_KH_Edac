package Assignment;

public class B2 {
	int rear, front, capacity;
	int queue[];
	B2(int c)
	{
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}
	void enqueue(int data)
	{
		if(capacity == rear)
		{
			System.out.println("full");
			return;
		}
		else {
			queue[rear] = data;
			rear++;
			return;
		}
		
	}
	void dequeue()

	{
		if(front == rear)
		{
			System.out.println("empty");	
			return;
		}
		else {
			for(int i=0;i<rear-1;i++)
			{
				queue[i] = queue[i+1];
			}
			if(rear < capacity)
			{
				queue[rear]=0;
				rear--;
			}	return;
			}
		}
             void display()
            {
            	int i;
            	if(front == rear)
            	{
            		System.out.println("empty");
            		return;
            	}
            	for(i=0 ; i<rear;i++)
            	{
            		System.out.println(" " + queue[i]);
            		
            	}
            	return;
            }
            void front()
            {
            	if(front==rear)
            	{
            		System.out.println("empty");
            		return;
            	}
            	System.out.print(" " + queue[front]);
            	return;
            }
	
	
		public static void main(String[] args) 
	{
		B2 b = new B2 (5);
		b.enqueue(10);
		b.enqueue(20);
		b.enqueue(30);
		b.enqueue(40);
		b.enqueue(50);
		b.display();
		b.dequeue();
		b.front();
		b.display();
	}
	}
	


