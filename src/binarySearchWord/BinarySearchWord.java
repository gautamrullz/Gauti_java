package binarySearchWord;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BinarySearchWord {
	public static void main(String[] args) throws IOException {
		Scanner scn =new Scanner(System.in);
		String s="",ts="";
		FileReader f=new FileReader("/home/bridgeit/Desktop/Gauti_java/Start/abc.txt");
		BufferedReader b= new BufferedReader(f);
		while((s=b.readLine())!=null){
			System.out.println(s);
			ts+=s;
			}
		b.close();
		System.out.println(s);
		String[] str=ts.split(",");
		str=sort(str);
		System.out.println();
		System.out.println("search a string");
		String s1=scn.next();
		int first=0;
		int last=str.length-1;
		int mid;
		while(first<=last){
			mid=(first+last)/2;
			if(s1.compareTo(str[mid])>0){
				first=mid+1;
			}
			else if(s1.compareTo(str[mid])<0){
				last=mid-1;
			}
			else{
				System.out.println();
				System.out.println("found the string....!!!!!   :"+str[mid]);
				return;
			}
		}
		System.out.println();
		System.out.println("could not found the string");
	}

	private static String[] sort(String[] str) {
		
		for (int i = 0; i < str.length-1; i++) {
			for (int j = 0; j < str.length-1-i; j++) {
				if(str[j].compareTo(str[j+1])>0){
					String temp= str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		for(String ele :str){
			System.out.println(ele);
		}
		
		return str;
	}

}
