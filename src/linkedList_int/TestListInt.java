package linkedList_int;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import linkedList_int.LinkedListInt;
import utility_19.Utility;

public class TestListInt {
	public static void main(String[] args) throws IOException {
		//reading the file
		FileReader fs=new FileReader("/home/bridgeit/Desktop/"
				+ "Gauti_java/Start/txt/intList.txt");
		
		BufferedReader br =new BufferedReader(fs);
		LinkedListInt ll=new LinkedListInt();
		String s="",s1="";
		while((s=br.readLine())!=null){
			s1=s1+s;
		}
		br.close();
		String[] str=s1.split(" ");
		int[] arr=new int[str.length];
		for (int i = 0; i < str.length; i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		//sort the array in ascending order
		Utility ut=new Utility();
		arr=ut.bubbleSortinteger(arr);
		
		for (int i = 0; i < arr.length; i++) {
			ll.add(arr[i]);
		}
		System.out.println(ll);
		System.out.println("enter a no to find.....");
		Scanner scn=new Scanner(System.in);
		int find=scn.nextInt();
		scn.close();
		if(ll.search(find)){
			ll.remove(find);
			System.out.println("value found....so..!!!!! Removed");
		}
		else{
			ll.add(find);
			System.out.println("value not found....so..!!!!! Added");
		}
		System.out.println(ll);
	}
}
