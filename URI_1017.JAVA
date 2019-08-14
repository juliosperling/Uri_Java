import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tempo = sc.nextInt();
		int vel_media = sc.nextInt();
		
		double comb = (double) tempo*vel_media/12;
		
		System.out.printf("%.3f%n", comb);
		
		sc.close();

	}

}
