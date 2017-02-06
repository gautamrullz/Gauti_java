package bridge_labz1.programs;


import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner scn =new Scanner (System.in);
		System.out.println("how many time you want to flip the coin: ");
		double count=scn.nextInt();
		scn.close();
		int head=0;
		for(int i=1;i<=count;i++){
			double j=Math.random();
			if(j<0.5){
				System.out.println(i+" Heads");
				head++;
			}
			else{
				System.out.println(i+" Tails");
			}
			
		}
		double perc =(head*100)/count;
		System.out.println();
		System.out.println("Hesds % = "+perc);

		System.out.println("Tails % = "+(100-perc));
		
		}
		
	}
