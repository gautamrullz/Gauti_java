package bankingCashCounter;

public class People {
	private double cash;
	
	public boolean deposit(double d){
		cash+=d;
		System.out.println("Total amount :"+cash);
		return true; 
	}
	public boolean withdraw(double w){
		if(cash<100){
			System.out.println("insufficient fund..!!!!!!");
			return false;
		}
		else if(cash<w){
			System.out.println("you have less money..!!!!!!");
			System.out.println("total cash: "+cash);
			System.out.println("try next time..!!!!!!");
			return false;
		}
		cash-=w;
		System.out.println("remaining bal :"+cash);
		return true;
	}
	public double balance(){
		return cash;
	}

}
