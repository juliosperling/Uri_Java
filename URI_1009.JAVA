import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String vendedor = sc.next();
		double salario = sc.nextDouble(), vendas = sc.nextDouble();
		
		double remuneracao = salario + (vendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n", remuneracao);
		
		sc.close();
		
		

	}

}
