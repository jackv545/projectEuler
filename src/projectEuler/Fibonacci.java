package projectEuler;

public class Fibonacci {

	public static void main(String[] args) {
		double a = 1000; 
		
		double n[] = new double[(int) a];
		n[0] = 1;
		n[1] = 2;
		
		System.out.println("n[" + 0 + "] = " + n[0]);
		System.out.println("n[" + 1 + "] = " + n[1]);
		
		for(int i = 2; ; i++) {
			if( n[i] >= a) {
				break;
			}
			n[i] = n[i - 1] + n[i - 2];
			System.out.println("n[" + i + "] = " + n[i]);
			
		}
	}
}
