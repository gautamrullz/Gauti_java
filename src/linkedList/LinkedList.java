package linkedList;

public class LinkedList {
	private Node start=null;
	private Node last=null;
	private int index;
	
		//class Node
	private class Node{
		String ele;
		Node next;
		public Node(String ele) {
			this.ele=ele;
			index++;
		}
	}
	
		//add method
	public boolean add(String ele){
		if(start==null){
			start=new Node(ele);
			last=start;
			return true;
		}
		last.next=new Node(ele);
		last=last.next;
		return true;
	}
	
		//get size
	public int size(){
		return index;
	}
	
		//search the string is there or not
	public boolean search(String ele){
		Node p=start;
		for(int i=0;i<size();i++){
			if(ele.equalsIgnoreCase(p.ele)){
				
				return true;
			}
			p=p.next;
		}
		return false;
	}
	
		//check list is empty or not
	public boolean isEmpty(){
		return index==0;
	}
	
		//get the index from the list
	public int index(String ele){
		Node p=start;
		for(int i=0;i<=size();i++){
			if(ele.equalsIgnoreCase(p.ele)){
				return i;
			}
			p=p.next;
		}
		return -1;
	}
	
		//remove the string 
	public boolean remove(String ele){
		Node p=start;
		Node pre=p;
		if(pre.ele.equalsIgnoreCase(ele)){
			start=p.next;
			index--;
			return true;
		}
		int count=0;
		for(int i=0;i<=size();i++){
			
			if(ele.equalsIgnoreCase(p.ele)){
				pre.next=p.next;
				index--;
				count++;
			}
			pre=p;
			p=p.next;
		}
		if(count>0)return true;
		return false;
	}
	
		//print list object
	@Override
	public String toString(){
		if(size()==0){
			return "[null]";
		}
		String s="["+start.ele;
		Node p=start;
		while((p=p.next)!=null){
			s+=", "+p.ele;
		}
		s+="]";
		return s;
	}
	
		//pop element one by one until list is null 
	public String pop(){
		String s=start.ele;
		start=start.next;
		index--;
		return s;
	}
	
	
}
