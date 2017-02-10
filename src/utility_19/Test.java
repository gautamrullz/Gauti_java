package utility_19;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("length of array");
		int Size=scn.nextInt();
		int[] arr=new int[Size];
		long[] time=new long[6];
		System.out.println("input the values of the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		String[] str={"hello","sorry","java","android","guti",
					"rahul","rohit","kritarth","amit","alok","baiju"
							+ "sumit","mukesh","pele","sameer","ankush","upender"};
		scn.close();
		Utility u=new Utility();
		int i=0;
		Stopwatch sw=new Stopwatch();
		
		sw.startTimer();
		u.bubbleSortinteger(arr);
		sw.endTimer();
		time[i++]=sw.elapsedTime();
		
		sw.startTimer();
		u.bubbleSortString(str);
		sw.endTimer();
		time[i++]=sw.elapsedTime();
		
		sw.startTimer();
		u.insertionSortinteger(arr);
		sw.endTimer();
		time[i++]=sw.elapsedTime();
		
		sw.startTimer();
		u.insertionSortString(str);
		sw.endTimer();
		time[i++]=sw.elapsedTime();
		
		sw.startTimer();
		u.binarySearchinteger(arr, 10);
		sw.endTimer();
		time[i++]=sw.elapsedTime();
		
		sw.startTimer();
		u.binarySearchString(str, "kritarth");
		sw.endTimer();
		time[i++]=sw.elapsedTime();
		
		time=u.bubbleSortLong(time);
		for(long ele:time){
			System.out.println();
			System.out.println(ele);
		}
		
		
	}

}
