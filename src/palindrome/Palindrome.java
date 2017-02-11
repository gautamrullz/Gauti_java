package palindrome;

public class Palindrome {
	public static void main(String[] args) {

	String s="madadam";
	char[] c=s.toCharArray();
	System.out.println(checkPalindrome(c));
	
	}
	static boolean checkPalindrome(char[] c){
	Deque d=new Deque(c.length);
		
		for (int i = 0; i < c.length; i++) {
			d.addRear(c[i]);
		}
		
		//if(d.size()1){
		while(d.size()>1){
			if(d.rear==d.front){
				break;
			}
			if(!((char)d.removeFront()==(char)d.removeRear())){
				return false; 
			}
		//}
		}
		
		/*while(d.isEmpty()){
			
			if(!((char)d.removeFront()==(char)d.removeRear())){
				return false; 
			}
		}
		*/
		return true;
	}
}
