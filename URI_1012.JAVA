import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble();
		
		double triangulo = (A*C)/2.0;
		double circulo = Math.pow(C, 2) * 3.14159;
		double trapezio = (A + B)/2 * C;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",
				triangulo, circulo, trapezio, quadrado, retangulo);
		
		sc.close();

	}

}
