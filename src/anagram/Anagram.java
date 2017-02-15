package anagram;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in); 
		System.out.println("enter the first string");
		String s1=scn.nextLine();
		System.out.println("enter the second string");
		String s2=scn.nextLine();
		scn.close();
		s1=s1.replace(" ","");
		s2=s2.replace(" ","");
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		System.out.println(findAnagram(s1,s2));
	}

	private static boolean findAnagram(String s1, String s2) {
		if(s1.length()==s2.length()){
			int [] arr1=new int[128];
			int [] arr2=new int[128];
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			for (int i = 0; i < c2.length; i++) {
				arr1[c1[i]]++;
				arr2[c2[i]]++;
			}
			for (int i = 0; i < arr1.length; i++) {
				if(arr1[i]!=arr2[i]){
					return false;
				}
			}
			
		}else
		return false;
		
		return true;
	}
}
