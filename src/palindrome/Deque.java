package palindrome;

public class Deque {
	public int front,rear,length;
	private Object[] ple;
	private int maxSize;
	public Deque(int size) {
		maxSize=size;
		ple=new Object[maxSize];
		front=-1;
		rear=-1;
		length=0;
	}
	
		//inserting from the rear side
	boolean addRear(Object ele){
		
		if(rear==-1){
			front=maxSize/2;
			rear=maxSize/2;
			ple[rear]=ele;
			length++;
			return true;
		}
		else if(rear+1<=maxSize){
			ple[++rear]=ele;
			length++;
			return true;
		}
		
		throw new StackOverflowError();
	}
	
		//inserting from the front side
	boolean addFront(Object ele){
		
		if(front==-1){
			front=maxSize/2;
			rear=maxSize/2;
			
			ple[front]=ele;
			length++;
			return true;
		}
		else if(front-1>0){
			ple[--front]=ele;
			length++;
			return true;
		}
		
		throw new StackOverflowError( );
	}
	
		//remove from front and return the value
	Object removeFront(){
		if(front<=rear){
		length--;
		return ple[front++];
		}
		return null;
	}
	
		//remove from rear and return the value
	Object removeRear(){
		if(rear>=front){
		length--;
		return ple[rear--];
		}
		return null;
		
		
	}
	
	boolean isEmpty(){
		
		return front==-1||rear==-1||front==rear;
	}
	
	int size(){
		return length;
	}
}
