
public class Main {
	
	public static void main (String [] args) {
		tester(500);
		
	}
	
	public static void tester(int x) {
		if (x == 0) {
			System.out.println("done");
		}
		else {
			
			System.out.println(x);
			x--;
			tester(x);
		}
		
	}
	
	
}
