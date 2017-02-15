package regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.*;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	
	static String s="";
	static String ptrn2="<<full\\sname>>";
	static String ptrn1="<<name>>";
	static String ptrn3="...xxxxxxxxxx";
	static String ptrn4="01/01/2016";
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("/home/bridgeit/Desktop/Gauti_java/Start/src/regex/message.txt"));
		s=br.readLine();
		br.close();
		Scanner scn=new Scanner(System.in);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String time=dateFormat.format(date);
		System.out.println("enter your name");
		String name=scn.nextLine();
		System.out.println("enter your no.");
		String no=scn.next();
		scn.close();
		String[] s1=name.split(" ");
		String regx=s1[0];
		Matcher m;
		Pattern p;
		p=Pattern.compile(ptrn1);
		m=p.matcher(s);
		s=m.replaceAll(regx);
		
		p=Pattern.compile(ptrn2);
		m=p.matcher(s);
		s=m.replaceAll(name);
		
		p=Pattern.compile(ptrn3);
		m=p.matcher(s);
		s=m.replaceAll(no);
		
		p=Pattern.compile(ptrn4);
		m=p.matcher(s);
		s=m.replaceAll(time);
		System.out.println(s);
	}
}
