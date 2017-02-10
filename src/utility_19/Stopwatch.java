package utility_19;

import java.util.Scanner;

public class Stopwatch {
	long start;
	long end;
	long timeTaken;
	public void startTimer(){
		start=System.nanoTime();
	}
	public void endTimer() {
		end=System.nanoTime();
	}
	public long elapsedTime(){
		
		timeTaken=(end-start);
		return timeTaken;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Stopwatch sw=new Stopwatch();
		System.out.println("type any think to start the Stopwatch");
		scn.nextLine();
		sw.startTimer();
		System.out.println("type any think to stop the stopwatch");
		scn.nextLine();
		scn.close();
		sw.endTimer();
		System.out.println("time :"+sw.elapsedTime());
	}
	
}
