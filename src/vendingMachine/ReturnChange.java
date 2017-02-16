package vendingMachine;

import java.util.Scanner;

public class ReturnChange {
	
	static int[] arr={1,2,5,10,20,50,100,500,1000};
	static int ths,h500,h100,t50,t20,t10,o5,o2,o1;
	
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the amount to get a change of that");
		int amount=scn.nextInt();
		scn.close();
		change(amount);
		System.out.println("1000 * "+ths);
		System.out.println("500  * "+h500);
		System.out.println("100  * "+h100);
		System.out.println("50   * "+t50);
		System.out.println("20   * "+t20);
		System.out.println("10   * "+t10);
		System.out.println("5    * "+o5);
		System.out.println("2    * "+o2);
		System.out.println("1    * "+o1);
		System.out.println("Tolal Change :"+(ths+h500+h100+t50+t20+t10+o5+o2+o1));

		
	}
	static int change(int price){
		if(price==0){
			return price;
		}
		while(price>=1000){
			price-=1000;
			ths++;
		}
		if(price<1000&&price>=500){
			while(price<1000&&price>=500){
				price-=500;
				h500++;
			}
		}
		else if(price<500&&price>=100){
			while(price<500&&price>=100){
				price-=100;
				h100++;
			}
		}
		else if(price<100&&price>=50){
			while(price<100&&price>=50){
				price-=50;
				t50++;
			}
		}
		else if(price<50&&price>=20){
			while(price<50&&price>=20){
				price-=20;
				t20++;
			}
		}
		else if(price<20&&price>=10){
			while(price<20&&price>=10){
				price-=10;
				t10++;
			}
		}
		else if(price<10&&price>=5){
			while(price<10&&price>=5){
				price-=5;
				o5++;
			}
		}
		else if(price<5&&price>=2){
			while(price<5&&price>=2){
				price-=2;
				o2++;
			}
		}
		else if(price<2&&price>=1){
			while(price<2&&price>=1){
				price-=1;
				o1++;
			}
		}
		return change(price);
	}
}
