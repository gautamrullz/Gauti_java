package balance;

import java.util.Scanner;

public class BalancedParentheses {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		scn.close();
		s=s.replace(" ", "");
		char[] cArr=s.toCharArray();
		System.out.println(check(cArr));
		
		}
	
	static boolean check(char[] cArr){
		Stack st=new Stack(cArr.length);
		for(int i=0;i<cArr.length;i++){
			switch(cArr[i]){
				case '[':
				case '{':
				case '(':
					st.push(cArr[i]);
					break;
				case '}':
				case ']':
				case ')':
					//System.out.println(st.isEmpty());
					if(!st.isEmpty()){
						char c=st.pop();
						if(c=='('&&cArr[i]==')'||
								c=='{'&&cArr[i]=='}'||
									c=='['&&cArr[i]==']'){
						}
						else
							return false;
					}
					else
						return false;
					break;
				}	
			}
			return true;
		}
		
	}
