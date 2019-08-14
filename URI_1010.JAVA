import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 int cod_peca1 = sc.nextInt(), num_peca1 = sc.nextInt();
	 Double val_peca1 = sc.nextDouble();
	 
	 int cod_peca2 = sc.nextInt(), num_peca2 = sc.nextInt();
	 Double val_peca2 = sc.nextDouble();
	 
	 Double valor_1 = (num_peca1 * val_peca1);
	 Double valor_2 = (num_peca2 * val_peca2);
	 Double valor_total = (valor_1 + valor_2);
	 
	 System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor_total);
	 
	 sc.close();

	}

}
