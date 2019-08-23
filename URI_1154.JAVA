import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x = sc.nextInt();
		int cont = 0;
		int soma = 0;
		
		double media;
		
		while (x >= 0) {
		
			cont = cont + 1;	
			soma = soma + x; 
			
			x = sc.nextInt();
		}
		media = (double) soma / cont;
		System.out.printf("%.2f%n", media);
		
		sc.close();
	}

}
