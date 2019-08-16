import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, ano, mes, dia, resto;
		
		N = sc.nextInt(); //EX 400
		 
		ano = N/365; //ano = 400/365 = 1
 		
		resto = N % 365; //resto = 400/365 = 35
		
		mes = resto/30; //mes = 35/30 = 1
		
		resto = resto % 30; //resto = 35/30 = 5
	
		dia = resto; //dia = 5
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		
		sc.close();

	}

}
