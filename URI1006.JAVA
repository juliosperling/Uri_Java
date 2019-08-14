import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double A = sc.nextDouble();
		Double B = sc.nextDouble();
		Double C = sc.nextDouble();
		
		Double MEDIA = (A * 2.0 + B * 3.0 + C * 5.0)/10;
		
		System.out.printf("MEDIA = %.1f%n", MEDIA);
		
		sc.close();
				

	}

}
