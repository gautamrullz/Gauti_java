package bridge_labz1.programs;

import java.util.Scanner;

public class GamblerGauti {
	
	static int p1stack=10,n,goal=150;
	static int p2stack=10;
	static int count=0;
	static Scanner scn =new Scanner(System.in);
	
	public static void main(String[] args) {
	 
	
	
	System.out.println("enter no of time to be played");
	n=scn.nextInt();
	
	System.out.println(game(p1stack,p2stack,n));
	
	
	}

	private static String game(int p1,int p2, int noOftime) {
		for(int k=1;k<=noOftime;k++){
			if(p1stack<=0||p2stack<=0)
				return "game over";
			int moneyOnBoard=0;
			moneyOnBoard=1+1;
			p1stack=p1-1;
			p2stack=p2-1;
			
			
			System.out.println("want to increase the bet : ");
			int i=1;
			while(i>=0){
				
				i=scn.nextInt();
				if(i==0)break;
				p1stack=increseBets1(i);
				p2stack=increseBets2(i);
				moneyOnBoard+=(2*i);System.out.println("want to increase the bet once again: ");
				
				
				
			}
			double j=Math.random();
			if(j<0.5){
				System.out.println("player 1 won");
				
				p1stack+=moneyOnBoard;
				count++;
				System.out.println("p1Stack="+p1stack);
				System.out.println("p2Stack="+p2stack);
				
			}
			else{
				System.out.println("player 2 won");
				p2stack+=moneyOnBoard;
				System.out.println("p1Stack="+p1stack);
				System.out.println("p2Stack="+p2stack);
			}
			
		}
		System.out.println("player 1 won "+count+" times");
		System.out.println("player 2 won "+(noOftime-count)+" times");
		
	return "game over";
	}
	private static int increseBets2(int i) {
		return p2stack=p2stack-i;
	}

	private static int increseBets1(int i){
		
		return p1stack=p1stack-i;
	}
}
