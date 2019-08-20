import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int resultado;
		
		if (inicio >= fim) {
			resultado = 24 - inicio + fim;
			
		}
		else {
			resultado = fim - inicio;
			
		}
		System.out.println("O JOGO DUROU " + resultado + " HORA(S)");
		sc.close();
				
	}

}
