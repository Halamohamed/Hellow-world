import java.util.Scanner;

public class Assignment1_1 {

	public static void main(String[] args) {
		int x, n;
		System.out.println("To calculate £i=1x¨n enter x and n");
		Scanner reader = new Scanner(System.in);
		x = reader.nextInt(); // Enter x.
		n = reader.nextInt(); // Enter n.
		System.out.println("The sum result is " + sum(x, n));

	}

	private static int sum(int x, int n) {
		int sum = 0, r = 1;
		for (int i = 1; i <= n; i++) {
			r = r * x;
			sum = sum + r;
		}
		return sum;

	}

}
