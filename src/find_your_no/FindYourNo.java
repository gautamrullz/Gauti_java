package find_your_no;

import java.util.Scanner;

public class FindYourNo {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=Integer.parseInt(args[0]);
		int arr[]=new int[no];
		int pow=1;
		int count=0;
		for(int i=1;i<=no/4;i++){
			pow=pow*2;
			count++;
			if(no==pow){
				break;
			}
		}
		for(int i=0;i<no;i++){
			arr[i]=++i;
		}
		System.out.println("assume a no between 1-"+(no-1));
		int f=0;
		int l=arr.length-1;
		int m;
		
		while(f<=l&&count!=0){
			
			m=(f+l)/2;
			System.out.println(m);
			System.out.println("you have "+count+" turns");
			System.out.println("enter 'true' if the value is greater if the value is smaller type 'false' if you found it press 'ok'");
			String s=scn.next();
			if(s.equalsIgnoreCase("true")){
				f=m+1;
			}
			else if(s.equalsIgnoreCase("false")){
				l=m-1;
			}
			else if(s.equalsIgnoreCase("ok")){
				System.out.println("got it!!!!!!!!!  :"+m);
				return;
			}
			else {
				System.out.println("invalid input");
				count++;
			}
			count--;
		}
		
		System.out.println("!!!!!!!!!!!....first assume then search....!!!!!!!!!!!");
		
	}
}
