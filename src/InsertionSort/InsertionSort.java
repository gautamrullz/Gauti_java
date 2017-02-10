package InsertionSort;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		String arr[];
		Scanner scn =new Scanner(System.in);
		System.out.println("length of array");
		int Size=scn.nextInt();

		arr=new String[Size];
		System.out.println("input the values of the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.next();
		}	
		scn.close();
		for (int i = 1; i < arr.length; i++) {
			String key=arr[i];
			int j=i-1;
			while(j>-1 && key.compareTo(arr[j])<=0){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(String ele: arr){
			System.out.println(ele);
		}
	}
}