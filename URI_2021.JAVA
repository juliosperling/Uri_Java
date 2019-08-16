import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double N = sc.nextDouble();
		
		int CN, LN, XXN, XN, VN, IIN, resto; //NOTAS
		int CM, LM, XVM, XM, VM, IM; //MOEDAS
		
		
		/*Multiplicar N por 100 para forçar a conversão para inteiro(int)
		  desse modo um numero como 576.73, torna-se 57673, facilitando a divisão sem o uso de numeros decimais
		  adiciona-se 0,5 para fins de arredondamento 
		*/

		resto = (int) (N * 100.0 + 0.5);
		
		//a lógica segue como no exercicio 1018, entretanto, nas notas, multiplica-se seu valor por 100 para manter o padrão, afim de
		//evitar numeros decimais.
	    
		
		//notas
		CN = resto / (100*100); 
		resto = resto % (100*100);
		LN = resto / (50*100); 
		resto = resto % (50*100); 
		XXN = resto / (20*100); 
		resto = resto % (20*100); 
		XN = resto / (10*100); 
		resto = resto % (10*100); 
		VN = resto / (5*100); 
		resto = resto % (5*100); 
		IIN = resto / (2*100); 
		
		resto = resto % (2*100); 

		//moedas
		CM = resto / 100; 
		resto = resto % 100;
		LM = resto / 50; 
		resto = resto % 50; 
		XVM = resto / 25; 
		resto = resto % 25; 
		XM = resto / 10; 
		resto = resto % 10; 
		VM = resto / 5; 
		resto = resto % 5; 
		IM = resto / 1; 
		
		System.out.println("NOTAS:");
		System.out.println(CN + " nota(s) de R$ 100.00");
		System.out.println(LN + " nota(s) de R$ 50.00");
		System.out.println(XXN + " nota(s) de R$ 20.00");
		System.out.println(XN + " nota(s) de R$ 10.00");
		System.out.println(VN + " nota(s) de R$ 5.00");
		System.out.println(IIN + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(CM + " moeda(s) de R$ 1.00");
		System.out.println(LM + " moeda(s) de R$ 0.50");
		System.out.println(XVM + " moeda(s) de R$ 0.25");
		System.out.println(XM + " moeda(s) de R$ 0.10");
		System.out.println(VM + " moeda(s) de R$ 0.05");
		System.out.println(IM + " moeda(s) de R$ 0.01");
		
		sc.close();
		
		
		
	}

}
