// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		Integer n = Integer.parseInt(args[0]);
		String mode = args[1];
		int counter = 1;
		int j = 0;
		boolean first = true;
		if (mode.equals("c") || mode.equals("concise")) {
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		} else {
			for (int i = 1; i <= n; i++) {
				j = i;
				System.out.print(j + " ");
				while ((j != 1) || (first == true)) {
					first = false;
					if (j % 2 == 0) {
						j = j / 2;
						System.out.print(j + " ");
					} else {
						j = (3 * j) + 1;
						System.out.print(j + " ");
					}
					counter++;
				}
				System.out.println("(" + counter + ")");
				counter = 0;
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
	}
}
