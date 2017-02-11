package linkedList_int;

public class LinkedListInt {
	
		private Node start=null;
		private Node last=null;
		private int index;
		
			//class Node
		private class Node{
			int ele;
			Node next;
			public Node(int ele) {
				this.ele=ele;
				index++;
			}
		}
		
			//add method
		public boolean add(int ele){
			if(start==null){
				start=new Node(ele);
				last=start;
				return true;
			}
			else if(ele<=start.ele){
				Node n=start;
				
				start=new Node(ele);
				start.next=n;
				return true;
				
			}
			else if(ele>=last.ele){
				last.next=new Node(ele);
				last=last.next;
			}
			
			else{
				Node p=start;
				for(int i=0;i<size();i++){
					Node ad=p;
					p=p.next;
					if(ele>=ad.ele && ele<=p.ele){
						ad.next=new Node(ele);
						
						ad.next.next=p;
						return true;
					}
					
				}
			
			}
			return false;
		}
		
			//get size
		public int size(){
			return index;
		}
		
			//search the string is there or not
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
		
			//check list is empty or not
		public boolean isEmpty(){
			return index==0;
		}
		
			//get the index from the list
		public int index(int ele){
			Node p=start;
			for(int i=0;i<=size();i++){
				if(ele==p.ele){
					return i;
				}
				p=p.next;
			}
			return -1;
		}
		
			//remove the string 
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
		
			//remove all the value matched
		public boolean removeAll(int ele){
			Node p=start;
			if(p.ele==ele){
				while(p.ele==ele){
					index--;
					p=p.next;
				}
				start=p;
				return true;
			}
			for(int i=0;i<=size();i++){
				Node pre=p;
				p=p.next;
				if(ele==p.ele){
					while(ele==p.ele){
						index--;
						p=p.next;
					}
					pre.next=p;
					return true;
					}
			}
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
		public int pop(){
			int s=start.ele;
			start=start.next;
			index--;
			return s;
		}
}
