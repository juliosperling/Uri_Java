import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double x = sc.nextDouble();
		
		double novosalario;
		double  reajuste;
		int porcentual;
		
		if (x <= 400.0) {
		reajuste = x * 0.15;	
		novosalario = x + reajuste;
		porcentual = 15;
		}
		else if (x >= 400.01 && x <= 800.0) {
			reajuste = x * 0.12;	
			novosalario = x + reajuste;
			porcentual = 12; 	
		}
		else if (x >= 800.01 && x <= 1200.0) {
			reajuste = x * 0.10;	
			novosalario = x + reajuste;
			porcentual = 10;
		}
		else if ( x >= 1200.01 && x <= 2000.0) {
			reajuste = x * 0.07;	
			novosalario = x + reajuste;
			porcentual = 7;
		}
		else {
			reajuste = x * 0.04;	
			novosalario = x + reajuste;
			porcentual = 4;
		}

		
		System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %d %%%n", novosalario, reajuste, porcentual);
		
		sc.close();
	}

}
