import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

			int N = sc.nextInt();
			
			for (int i= 1; i <=N; i++) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				double resultado = (double) x/y;
				
				if (y == 0 ) {
					System.out.println("divisao impossivel");
				}
				else {
				System.out.printf("%.1f%n", resultado);
				}
				
				
			}	
			sc.close();
	}

}
