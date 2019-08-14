import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 int dist = sc.nextInt();
	 Double comb = sc.nextDouble();
	 
	 Double consumo = dist/comb;
	 
	 System.out.printf("%.3f km/l%n", consumo);
	 
	 sc.close();
	 

	}

}
