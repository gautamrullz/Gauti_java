package bankingCashCounter;

import java.util.Scanner;

public class TestPeopleQueue {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		Queue q=new Queue(20);
		q.enqueue(new People());
		People p;
		String y;
			while(!((p=(People)q.deQueue())==null)){
		
			y="y";
			while(y.equalsIgnoreCase("y")){
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Show balance");
				System.out.println("4. new person came join the queue");
				double d;
				int ch=scn.nextInt();
			if(ch==1){
				System.out.println("enter amount you want to Deposit");
				d=scn.nextDouble();
				p.deposit(d);
			}
			else if(ch==2){	
				System.out.println("enter amount you want to Withdraw");
				d=scn.nextDouble();
				p.withdraw(d);
			}
			
			else if(ch==3){
				System.out.println(p.balance());	
			}
			
			else if(ch==4){
				q.enqueue(new People());
				System.out.println("person in queue: "+q.size());
			}
			
			else{
				System.out.println("invalid input");
			}
			
			System.out.println("press 'Y' to continue else 'N'");
			y=scn.next();
			}
		}
			scn.close();
		System.out.println("no person in Queue");
			
			
	}
		
}


