import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int i = 1;

		for (i = 1; i <= n; i++) {

			double quadrado = Math.pow(i, 2);
			double cubo = Math.pow(i, 3);

			System.out.print(i +" ");
			System.out.print(quadrado + " ");
			System.out.println(cubo);

		}

		sc.close();
	}
}