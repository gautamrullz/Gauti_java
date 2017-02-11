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
	
	boolean addRear(Object ele){
		
		if(rear==-1){
			front=0;
			rear=0;
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
	
	boolean addFront(Object ele){
		
		if(rear==-1){
			front=0;
			rear=0;
			ple[rear]=ele;
			length++;
			return true;
		}
		else if(front>=0){
			ple[++front]=ele;
			length++;
			return true;
		}
		
		throw new StackOverflowError( );
	}
	
	Object removeFront(){
		if(rear<=size()||rear==front){
		length--;
		return ple[front++];
		}
		return null;
	}
	
	Object removeRear(){
		if(front<=size()||rear==front){
		length--;
		return ple[rear--];
		}
		return null;
	}
	boolean isEmpty(){
		
		return front==-1||front==rear;
	}
	int size(){
		return length;
	}
}
