package bridge_labz1.programs;

import java.util.Scanner;

public class RiverseString {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter a String");
		String s=scn.nextLine();
		char[] c=s.toCharArray();
		scn.close();
		String s2="";
		for (int i = c.length-1; i >= 0; i--) {
			s2 += c[i]; 
		}
		System.out.println("riverse String: " +s2);
	}

}
