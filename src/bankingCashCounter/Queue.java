package bankingCashCounter;

public class Queue {
	private int front,rear,length;
	private Object[] ple;
	private int maxSize;
	public Queue(int size) {
		maxSize=size;
		ple=new Object[maxSize];
		front=-1;
		rear=-1;
		length=0;
	}
	boolean enqueue(Object ele){
		
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
	Object deQueue(){
		if(rear<=size()){
		//front--;
		length--;
		return ple[front++];
		}
		return null;
	}
	boolean isEmpty(){
		
		return front==-1;
	}
	int size(){
		return length;
	}
}
