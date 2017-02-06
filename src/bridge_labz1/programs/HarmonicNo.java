package bridge_labz1.programs;

import java.util.Scanner;

public class HarmonicNo {

	public static void main(String[] args) {
		System.out.println(" Enter no to find Harmonic no: ");
		Scanner scn=new Scanner(System.in);
		int count=scn.nextInt();
		scn.close();
		if(count>0){
		double har=0.0;
		for(int i=1;i<=count;i++){
			har=har+((double)1/(double)i);
			
		}
		System.out.println("Harmonic no. for "+count+" = "+har);
		}
		else System.out.println("input can't be 0 or nigative");
	}

}
