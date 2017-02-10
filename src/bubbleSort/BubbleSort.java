package bubbleSort;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the Size of Array");
		int size=scn.nextInt();
		int[] arr=new int[size];
		System.out.println("enter element to the Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		scn.close();
		arr=bubbleSort(arr);
		System.out.println();
		for(int ele:arr){
			System.out.println(ele);
		}
	}

	private static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
}
