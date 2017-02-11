package balance;

public class Stack {
	private char[] cArr;
	private int top;
	private int maxSize=0;
	private int length=0;
	
	public Stack(int size) {
		maxSize=size;
		cArr=new char[maxSize];
		top=-1;
	}
	
	public boolean push(char ele){
		if(length<=maxSize){
			cArr[++top]=ele;
			length++;
			return true;
			}
		else
			throw new StackOverflowError();
	}
	
	public char pop(){
		if(size()>=0){
			length--;
			return cArr[top--];
			}
		else
			throw new ArrayIndexOutOfBoundsException();
	}
	
	public char peak(){
		if(size()>=0){
			return cArr[top];
			}
		else
			throw new ArrayIndexOutOfBoundsException();
	}
	
	public boolean isEmpty(){
		return top==-1;
	} 
	
	public int size(){
		return length;
	}
}
