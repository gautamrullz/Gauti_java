package search_No_In_Slot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class SearchNoInSlot {
	public static void main(String[] args) throws IOException {
		FileReader fs=new FileReader("/home/bridgeit/Desktop/"
				+ "Gauti_java/Start/txt/intList.txt");
		int keyArr[] =new int[11];
		
		BufferedReader br =new BufferedReader(fs);
		LinkedHash l=null;
		HashMap<Integer,LinkedHash> m=new HashMap<>();
		String s="",s1="";
		
		while((s=br.readLine())!=null){
			s1=s1+s;
		}
		
		br.close();
		String[] str=s1.split(" ");
		int[] arr=new int[str.length];
		int key;
		for (int i = 0; i < keyArr.length; i++) {
			keyArr[i]=11;
		}
		for (int i = 0; i < str.length; i++) {
			arr[i]=Integer.parseInt(str[i]);
			key=(arr[i]%11);
			
			int count=11;
			
			for(int j=0;j<keyArr.length;j++){
				if(key==keyArr[j]){
					count++;
				}
			}
			if(count==11){
				keyArr[key]=key;
				m.put(key,new LinkedHash());
				l=(LinkedHash) m.get(key);
				l.add(arr[i]);
			}	
			else{
				l=(LinkedHash) m.get(key);
				l.add(arr[i]);
			}
				
			}
		
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter a no.");
		int check=scn.nextInt();
		scn.close();
		key=(check%11);
		l=(LinkedHash)m.get(key);
		System.out.println(l.search(check));
		if(l.search(check)){
			
			l.remove(check);
			System.err.println("string present.....!!!!!!! removed");
		}
		else{
			l.add(check);
			System.err.println("no match found........!!!!!!!! new string added");
		}
			
		System.out.println(l);
		}
		
}

