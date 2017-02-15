package linkedList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestList {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("/home/bridgeit/Desktop/"
				+ "Gauti_java/Start/txt/list1.txt");
		
		FileReader fs=new FileReader("/home/bridgeit/Desktop/"
				+ "Gauti_java/Start/txt/list.txt");
		
		BufferedReader br =new BufferedReader(fs);
		LinkedList ll=new LinkedList();
		String s="",s1="";
		while((s=br.readLine())!=null){
			s1=s1+s;
		}
		br.close();
		String[] str=s1.split(" ");
		for(int i=0;i<str.length;i++){
			ll.add(str[i]);
		}
		System.out.println(ll);
		System.out.println("enter a string");
		Scanner scn =new Scanner(System.in);
		String ele=scn.nextLine();
		scn.close();
		if(ll.search(ele)){
			ll.remove(ele);
			System.err.println("string present.....!!!!!!! removed");
		}
		else{
			ll.add(ele);
			System.err.println("no match found........!!!!!!!! new string added");
		}
		System.out.println();
		System.out.println(ll.size());
		while(!ll.isEmpty()){
			fw.write(ll.pop()+" ");
		}
		fw.close();
		
		
		
	
	}
}
