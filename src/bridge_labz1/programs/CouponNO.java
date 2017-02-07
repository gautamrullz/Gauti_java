package bridge_labz1.programs;

import java.util.Random;
import java.util.Scanner;

public class CouponNO {
	static int[] arr;
	static int[] coupon;
	static int index=0;
	
	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter a no.: ");
		int n=scn.nextInt();
		scn.close();
		arr =new int[n];
		coupon =new int[n];
		getRandomNo();
		for(int i=0;i<index;i++){
			
			System.out.println(coupon[i]);
		}
	}
	
	//get random value from the method
	private static int[] getRandomNo() {
		Random rm=new Random();			
		int generate;
		
		//put the random no in the array
		for (int i = 0; i < arr.length; i++) {
			generate=rm.nextInt(100);
			arr[i]=generate;
		}
		//now check the no is distinct or not
		for(int i=0;i<arr.length;i++){
			int count=0;
			//compare with the another array and put only distinct element
			for (int j = 0; j < index; j++) {
				if(i==0&&j==0){
					coupon[index++]=arr[i];
				}
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count==0){
				coupon[index++]=arr[i];
			}
		}
		//return integer []
		return coupon;
	}
}
