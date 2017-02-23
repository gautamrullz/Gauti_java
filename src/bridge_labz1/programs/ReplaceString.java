package bridge_labz1.programs;

import java.util.Scanner;

public class ReplaceString 
{

	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter your name : ");
		String s=scn.nextLine();
		
			while(s.length()<=3)
			{	
				System.out.println("user name too short 'Re-enter'");
					s=scn.nextLine();
			}
			scn.close();
			
			System.out.println("hello "+s+" how are you?");
		
	}

}
