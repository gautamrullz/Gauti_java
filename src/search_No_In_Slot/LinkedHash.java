package search_No_In_Slot;
public class LinkedHash {

	private Node start=null;
	private Node last=null;
	private int index;
	
	private class Node{
		int ele;
		Node next;
		public Node(int ele) {
			this.ele=ele;
			index++;
		}
	}
	
	public boolean add(int ele){
		if(start==null){
			start=new Node(ele);
			last=start;
			return true;
		}
		last.next=new Node(ele);
		last=last.next;
		return true;
	}
	
	public int size(){
		return index;
	}
	
	public boolean search(int ele){
		Node p=start;
		for(int i=0;i<size();i++){
			if(ele==p.ele){
				
				return true;
			}
			p=p.next;
		}
		return false;
	}
	
	public boolean isEmpty(){
		return index==0;
	}
	
	public boolean remove(int ele){
		Node p=start;
		Node pre=p;
		if(pre.ele==ele){
			start=p.next;
			index--;
			return true;
		}
		int count=0;
		for(int i=0;i<=size();i++){
			
			if(ele==p.ele){
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
	
	@Override
	public String toString(){
		if(size()==0){
			return "[null]";
		}
		String s="["+start.ele;
		Node p=start;
		while((p=p.next)!=null){
			s+=","+p.ele;
		}
		s+="]";
		return s;
	}
	
}