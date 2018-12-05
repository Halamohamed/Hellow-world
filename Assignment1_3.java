import java.util.Scanner;

public class Assignment1_3 {

	public static void main(String[] args) {
		double n, a, b; // a and b is integral interval.

		double x, y = 0, sum = 0;
		Scanner reader = new Scanner(System.in);

		System.out.println("to calculate f(1/(x+1))dx using simpsons rule ");
		System.out.println(" Enter a and b, as integeral interval ");
		a = reader.nextDouble();
		b = reader.nextDouble();
		System.out.println(" Enter n where n is even number");
		n = reader.nextInt(); // where n is even.

		double deltax = (b - a) / n;
		double del = deltax / 3;
		if (n % 2 == 0) {
			sum = sumfunction(n, a, sum, deltax);

			System.out.println(" f(1/x+1)dx =" + sum * del);
		} else
			System.out.println(" n must be even number");

	}

	private static double sumfunction(double n, double a, double sum, double deltax) {
		double x;
		double y;

		for (int k = 0; k <= n; k++) {
			x = a + k * deltax;
			y = 1 / (x + 1);
			if (k == 0 || k == n)
				sum = sum + y;
			else if (k % 2 == 0)
				sum = sum + y * 2;
			else
				sum = sum + y * 4;

		}
		return sum;
	}

}
