
public class Collatz {
	public static void main(String args[]) {
		if (args.length < 2) {
			System.err.println("Usage: java Collatz <n> <mode>");
			return;
		}

		int n = Integer.parseInt(args[0]);
		String mode = args[1];

		if (mode.equals("c") || mode.equals("concise")) {
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
			return;
		}

		for (int i = 1; i <= n; i++) {
			int j = i;
			System.out.print(j + " ");

			// count printed numbers in this sequence (start with the initial number)
			int counter = 1;

			// perform Collatz steps until we reach 1
			while (j != 1) {
				if (j % 2 == 0) {
					j = j / 2;
				} else {
					j = 3 * j + 1;
				}
				System.out.print(j + " ");
				counter++;
			}

			System.out.println("(" + counter + ")");
		}

		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	}
}
