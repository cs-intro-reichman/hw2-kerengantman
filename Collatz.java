
public class Collatz {
	public static void main(String args[]) {
		Integer n = Integer.parseInt(args[0]);
		String mode = args[1];
		int counter = 0;
		int j = 0;
		if (mode.equals("c") || mode.equals("concise")) {
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		} else {
			for (int i = 1; i <= n; i++) {
				j = i;
				System.out.print(j + " ");
				// count the numbers printed in this sequence (start with the initial number)
				counter = 1;
				// perform at least one Collatz step and continue until we reach 1
				do {
					if (j % 2 == 0) {
						j = j / 2;
					} else {
						j = (3 * j) + 1;
					}
					System.out.print(j + " ");
					counter++;
				} while (j != 1);
				System.out.println("(" + counter + ")");
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
	}
}
