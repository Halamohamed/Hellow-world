import java.util.Scanner;

public class Assignment1_2 {

	public static void main(String[] args) {
		int x, y;
		int n;
		double result;
		System.out.println(" Calculate the result of binomial expansion (x+y)^n ");

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter x and y");
		x = reader.nextInt(); // Enter x.
		y = reader.nextInt(); // Enter y.
		System.out.println("Enter n");
		n = reader.nextInt(); // Enter n and n is a positive number.
		if (n < 0) {
			System.out.println("error because n is lessthan 0 ");
		} else {
			result = summation(x, y, n);
			System.out.println("The sum is " + result);
		}
	}

// a function summation is to count the sum of (x+y)^n
	private static double summation(int x, int y, int n) {
		double sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + (fac(n) / (fac(i) * fac(n - i))) * Math.pow(x, n - i) * Math.pow(y, i);
		}

		return sum;
	}

	// a function fac is to count the factorial of n
	public static int fac(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;

	}

}
