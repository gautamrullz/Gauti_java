package coupon;


import java.util.*;

public class CouponNum {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("no. of coupon you want");
		int n=scn.nextInt();
		scn.close();
		int count=1;
		List<Object> l= new LinkedList<>();
		Random rm=new Random();			
		int generate;
		
		for (int i = 0; i < n; i++) {
			generate=rm.nextInt(100);
			
			if(!l.contains(generate)){
				l.add(generate);
			}
			else
				n=n+count;
				
		}
		for(Object ele:l){
			System.out.println((Integer)ele);
		}
	}
}
