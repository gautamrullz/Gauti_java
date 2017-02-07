package bridge_labz1.programs;

import java.io.*;
import java.util.Scanner;

public class TwoDArray {
	static Scanner scn =new Scanner(System.in);
	static int [][]arr;
	public static void main(String[] args) {
		
		System.out.println("press 1 for integer Array[] :");
		System.out.println("press 2 for double Array[] :");
		System.out.println("press 3 for boolean Array[] :");
		int in=scn.nextInt();
		switch(in){
		case 1:	
			getIntegerArray();
			System.out.println();
			
				diaplay();
			
			break;
		case 2:
			getDoubleArray();
			break;
		case 3:
			getBooleanArray();
			break;
		default:
			System.out.println("invalid input");
		}
	}

	private static void diaplay() throws FileNotFoundException {
		//OutputStream output = new FileOutputStream("data/data.bin");
		FileOutputStream fs=new FileOutputStream("txt/text");

		
	}

	private static void getBooleanArray() {
		
	}

	private static void getDoubleArray() {
		
	}

	private static void getIntegerArray() throws IOException {
		File file = new File("txt/text");
		OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream(file));
		System.out.println("enter row");
		int row=scn.nextInt();
		System.out.println("enter coll");
		int coll=scn.nextInt();
		arr=new int[row][coll];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coll; j++) {
				System.out.println("enter the integer values");
				arr[i][j]=scn.nextInt();
				os.write(arr[i][j]);
			}
			
		}
	}
	

}
