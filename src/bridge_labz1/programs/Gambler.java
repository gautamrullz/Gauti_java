package bridge_labz1.programs;

import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		int count=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the stack");
		int stack=scn.nextInt();
		int amount=stack;
		System.out.println("enter the gole");
		int goal=scn.nextInt();
		System.out.println("no. of you want to play: ");
		int no=scn.nextInt();
		System.out.println("bet amount is 1$:");
		//loop for no. of time to played
		for(int i=0;i<no;i++){
			
			if(stack==0||stack==goal){
				if(stack==0)
					System.out.println("finally you loss the whole amount");
				
				else{
					System.out.println("you won and reached the goal");
					System.out.println("no. of wins = "+count);
					System.out.println("win %= "+((count)*100)/no);
					System.out.println("loss %= "+(100-((count)*100)/no));
				}
					return;
			}
			//generate random value from 0-1
			double j=Math.random();
			if(j>0.5){
				System.out.println(" you won");
				stack++;
				count++;
				System.out.println("new stack = "+stack);
				
			}
			
			else{
				System.out.println(" you loss");
				stack--;
				System.out.println("new stack = "+stack);

			}
		}
		
		//check the result for win or loss
		if(amount<stack){
			System.out.println("finally you won "+(stack-amount));
			System.out.println("no. of wins = "+count);
			System.out.println("win %= "+((count)*100)/no);
			System.out.println("loss %= "+(100-((count)*100)/no));
			}
		else if(amount>stack){
			System.out.println("finally you loss "+(amount-stack));
			System.out.println("no. of loss = "+(no-count));
			System.out.println("loss % ="+((no-count)*100)/no);
			System.out.println("win %= "+(100-((no-count)*100)/no));


		}
		else{
			System.out.println("you dint loss nor won ");
			System.out.println("win %= "+((count)*100)/no);
			System.out.println("loss %= "+(100-((count)*100)/no));
		}
		
	}

}
