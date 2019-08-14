import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 Double cod_peca1 = sc.nextDouble(), num_peca1 = sc.nextDouble(), val_peca1 = sc.nextDouble();
	 Double cod_peca2 = sc.nextDouble(), num_peca2 = sc.nextDouble(), val_peca2 = sc.nextDouble();
	 
	 Double valor_1 = (num_peca1 * val_peca1);
	 Double valor_2 = (num_peca2 * val_peca2);
	 Double valor_total = (valor_1 + valor_2);
	 
	 System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor_total);
	 
	 sc.close();

	}

}
