// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double pi4 = 0.0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				pi4 = pi4 + 1.0 / (2 * i + 1);

			} else {
				pi4 = pi4 - 1.0 / (2 * i + 1);
			}

		}
		double pi = pi4 * 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pi);
	}
}
