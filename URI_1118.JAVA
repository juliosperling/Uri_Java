import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int novo = 1;

		while (novo == 1) {
			double n1 = sc.nextDouble();
			
			while (n1 < 0.0 || n1 > 10.0) {
				System.out.println("nota invalida");
				n1 = sc.nextDouble();
			}
			double n2 = sc.nextDouble();
			
			while (n2 < 0.0 || n2 > 10) {				
				System.out.println("nota invalida");
				n2 = sc.nextDouble();
			}

			double media = (n1 + n2) / 2;

			System.out.printf("media = %.2f%n", media);
			System.out.println("novo calculo (1-sim 2-nao)");

			novo = sc.nextInt();

			while (novo != 1 && novo != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				novo = sc.nextInt();
			}
		}
		sc.close();
	}

}
