import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = s.nextInt();
		primeprint(n);
		s.close();
	}

	private static void primeprint(int n) {
		int m = 2;
		while (m <= n) {
			int i, count = 0;
			for (i = 2; i <= m / 2; i++) {
				if (m % i == 0) {
					count++;
				}
			}
			if (count == 0)
				System.out.println(m);
			m++;
		}

	}
}
