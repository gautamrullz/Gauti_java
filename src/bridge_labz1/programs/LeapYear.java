package bridge_labz1.programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Year");
		int year=scn.nextInt();
		while(!(year>=1000 && year <=9999)){
			System.out.println("re-enter the year : ");
			year=scn.nextInt();
		}
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println("its a leap year");
		}
		else System.out.println("not a leap year");
	}

}
