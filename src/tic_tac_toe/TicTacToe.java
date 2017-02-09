package tic_tac_toe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	//static int arr[][]=new int[3][3];
		static char arrchar[][]=new char[3][3];
		static int row;
		static int col;
		
		public static void main(String[] args) {
			for (int i = 0; i < arrchar.length; i++) {
				for (int j = 0; j < arrchar.length; j++) {
					arrchar[i][j]='.';
				}
			}
			System.out.println(startGame());
			System.out.println();
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print((char)arrchar[i][j]+"  ");
				}
				System.out.println();
			}
		}
		
		private static String startGame() {
			Scanner scn=new Scanner(System.in);
			
			for (int l = 0; l <5; l++) {
				Random rm=new Random();
				 int count=0;
				 while(count==0){
					row=rm.nextInt(3);
					col=rm.nextInt(3);
					if(arrchar[row][col]=='.'){
						count++;
						//arr[row][col]=2;
						arrchar[row][col]='0';
					}
				 }
				 if(arrchar[0][0]=='0'&&arrchar[0][1]=='0'&&arrchar[0][2]=='0'||
							arrchar[1][0]=='0'&&arrchar[1][1]=='0'&&arrchar[1][2]=='0'||
							arrchar[2][0]=='0'&&arrchar[2][1]=='0'&&arrchar[2][2]=='0'||
							arrchar[0][0]=='0'&&arrchar[1][0]=='0'&&arrchar[2][0]=='0'||
							arrchar[0][1]=='0'&&arrchar[1][1]=='0'&&arrchar[2][1]=='0'||
							arrchar[0][2]=='0'&&arrchar[1][2]=='0'&&arrchar[2][2]=='0'||
							arrchar[0][0]=='0'&&arrchar[1][1]=='0'&&arrchar[2][2]=='0'||
							arrchar[2][0]=='0'&&arrchar[1][1]=='0'&&arrchar[0][2]=='0')
					{
						return "Player 1 won";
					}
				 
				 for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							System.out.print((char)arrchar[i][j]+"  ");
						}
						System.out.println();
					}
				 System.out.println();
				
				if(l<4){		
					count=0;
					while(count==0){
						System.out.println("enter row");
						row=scn.nextInt();
						System.out.println("enter coll");
						col=scn.nextInt();
						if(arrchar[row][col]=='.'){
							//arr[row][col]=1;
							count++;
							arrchar[row][col]='X';
						}
						else
							System.out.println("already exist");
					}
				 
				}
				
				if(arrchar[0][0]=='X'&&arrchar[0][1]=='X'&&arrchar[0][2]=='X'||
						arrchar[1][0]=='X'&&arrchar[1][1]=='X'&&arrchar[1][2]=='X'||
						arrchar[2][0]=='X'&&arrchar[2][1]=='X'&&arrchar[2][2]=='X'||
						arrchar[0][0]=='X'&&arrchar[1][0]=='X'&&arrchar[2][0]=='X'||
						arrchar[0][1]=='X'&&arrchar[1][1]=='X'&&arrchar[2][1]=='X'||
						arrchar[0][2]=='X'&&arrchar[1][2]=='X'&&arrchar[2][2]=='X'||
						arrchar[0][0]=='X'&&arrchar[1][1]=='X'&&arrchar[2][2]=='X'||
						arrchar[2][0]=='X'&&arrchar[1][1]=='X'&&arrchar[0][2]=='X')
				{
				return "Player 2 won";
				}
			}
			return "Match draw";
			}
	}