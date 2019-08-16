import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
			int N = sc.nextInt();
			
			int C, L, XX, X, V, II, I, resto;
			
			//EX N = 576
			C = N / 100; //  C = 576 / 100 = 5
			resto = N % 100;//  resto de 576/100 = 76
			L = resto / 50; // L = 76/50= 1
			resto = resto % 50; //resto = 76/50 = 26
			XX = resto / 20; // XX = 26/20 = 1
			resto = resto % 20; // resto = 26/20 = 6
			X = resto / 10; // X = 6 / 10 = 0
			resto = resto % 10; //resto = 6 / 10 = 6
			V = resto / 5; // V = 6/5 = 1
			resto = resto % 5; // resto = 6/5 = 1
			II = resto / 2; // II = 1 / 2 = 0
			resto = resto % 2; //resto = 1 / 2 = 1
			I = resto/1; //I = 1 / 1 = 1
			
			System.out.println(N);
			System.out.println(C + " nota(s) de R$ 100,00");
			System.out.println(L + " nota(s) de R$ 50,00");
			System.out.println(XX + " nota(s) de R$ 20,00");
			System.out.println(X + " nota(s) de R$ 10,00");
			System.out.println(V + " nota(s) de R$ 5,00");
			System.out.println(II + " nota(s) de R$ 2,00");
			System.out.println(I + " nota(s) de R$ 1,00");
			
					sc.close();

	}

}
