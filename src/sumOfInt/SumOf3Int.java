package sumOfInt;

import java.util.Scanner;

public class SumOf3Int {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size=scn.nextInt();
		int arr[] =new int [size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter element to the array");
			arr[i]=scn.nextInt();
		}
		scn.close();
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==0){
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						return;
					}
				}
			}
		}
		System.out.println("Sorry cant find any combination");
	}
}
