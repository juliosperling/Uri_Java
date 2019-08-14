import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int NUMBER = sc.nextInt();
		int horas = sc.nextInt();
		double valor_hora = sc.nextDouble();
		double SALARY = horas * valor_hora;
		
		System.out.println("NUMBER = "+NUMBER);
		System.out.printf("SALARY = U$ %.2f%n", SALARY);
		
		sc.close();

	}

}
