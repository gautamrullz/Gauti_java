package bridge_labz1.programs;

import java.util.Scanner;

public class PrimeFactor {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int no=scn.nextInt();
		scn.close();
		for(int i=2;i<=no/2;i++){
			if(no%i==0){
				if(isprime(i)){
				System.out.println(i);
				}
				
			}
		}
	}
	private static boolean isprime(int no) {
		for(int i=2;i<=no/2;i++){
			if(no%i==0){
				
				return false;			}
			}
		
		return true;
	}
	
}
