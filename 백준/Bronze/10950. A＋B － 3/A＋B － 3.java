import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			for(int j=1; j<2; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				System.out.println(x+y);
			}
		}
	}

}