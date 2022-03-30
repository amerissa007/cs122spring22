package classlab.week10;

public class Fibonacci {
	
	public static int sequence (int num) {
		int result;
		
		if(num==0 || num==1) {
			System.out.print(0 + "\t");
			return num;
		}
		
		else {
			result= sequence(num-1) + sequence(num-2);
			System.out.print(result + "\t");
			return result;
		}
		
	}
	public static void main(String[] args) {
		for(int i=0; i<=11;i++) {
			System.out.print(sequence(i) + "\t");
		}
		

}
}
