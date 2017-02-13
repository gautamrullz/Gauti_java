package palindrome;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);	
	System.out.println("Enter a String to check its palindrome or not");
	String s=scn.next();
	scn.close();
	char[] c=s.toCharArray();
	System.out.println(checkPalindrome(c,(c.length/2)));
	
	
	}
	static boolean checkPalindrome(char[] c,int size){
		Deque d=new Deque(100);
		for (int i = 0; i <c.length; i++) {
			d.addFront(c[i]);
		}
		
		for (int i = 0; i <size; i++) {	
			if(!((char)d.removeFront()==(char)d.removeRear())){
				return false; 
			}
		}
		return true;
	}
}
