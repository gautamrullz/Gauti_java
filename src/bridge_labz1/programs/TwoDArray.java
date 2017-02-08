package bridge_labz1.programs;

import java.io.*;
import java.util.Scanner;
public class TwoDArray {
	static Scanner scn =new Scanner(System.in);
	static int [][]arrInt;
	static double [][] arrDouble;
	public static void main(String[] args)  {
		
		System.out.println("press 1 for integer Array[] :");
		System.out.println("press 2 for double Array[] :");
		System.out.println("press 3 for boolean Array[] :");
		int in=scn.nextInt();
		System.out.println("enter row");
		int row=scn.nextInt();
		System.out.println("enter coll");
		int coll=scn.nextInt();
		switch(in){
		case 1:	
			
			try {
				getIntegerArray(row, coll);
				diaplay(row ,coll);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
					
			
			break;
		case 2:
			try {
				getDoubleArray(row ,coll);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			getBooleanArray();
			break;
		default:
			System.out.println("invalid input");
		}
	}
	//Display method
	private static void diaplay(int row,int coll) throws FileNotFoundException {
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coll; j++) {
				
				int p=arrInt[i][j];
			}
		}
	}

	private static void getBooleanArray() {
		
	}

	private static void getDoubleArray(int row,int coll) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("/home/bridgeit/Desktop/Gauti_java/Start/txt/double.txt");
		arrDouble=new double[row][coll];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coll; j++) {
				System.out.println("enter the integer values");
				arrDouble[i][j]=scn.nextDouble();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coll; j++) {
				pw.flush();
				double p=arrDouble[i][j];
				pw.print(p+" ");
			}
			pw.println();
		}
		pw.close();
	}

	
	private static void getIntegerArray(int row,int coll) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter("/home/bridgeit/Desktop/Gauti_java/Start/txt/int.txt");
		arrInt=new int[row][coll];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coll; j++) {
				System.out.println("enter the integer values");
				arrInt[i][j]=scn.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coll; j++) {
				pw.flush();
				int p=arrInt[i][j];
				pw.print(p+" ");
			}
			pw.println();
		}
		pw.close();
	}
	
}
