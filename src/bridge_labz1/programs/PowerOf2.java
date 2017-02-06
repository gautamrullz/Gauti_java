package bridge_labz1.programs;

public class PowerOf2 {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int turn =1;
	
		for(int i=1;i<=num;i++){
			turn = turn*2;
			
			System.out.println(2+"^"+i+" = "+ turn );
			
			}
	}
	
}
