import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double n = 3.14159;
		double raio = sc.nextDouble();
		double raio_quadrado = Math.pow(raio, 2);
		
		double area = n * raio_quadrado;
		
		System.out.printf("A=%.4f%n", area);
			
		sc.close();
	}

}
