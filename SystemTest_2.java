public class SystemTest_2 {
	public static void main(String args[]) {
		int n = 9; // Number of rows.

		for (int i = 0; i < n * 2; i++)
			System.out.print("*");
		System.out.println("");
		// Outer Loop for number of Rows
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int k = i; k < n; k++)
					System.out.print(" ");

				// printing '*' in each column.

				for (int j = 0; j <= i; j++) {
					if (n - 1 == i) {
						System.out.print("* ");
					} else {
						if (i == j || j == 0 || Math.round(i / 2) == j)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				}
			} else {
				System.out.println();
			}
		}

		for (int i = n - 1; i > 0; i--) {
			if (i % 2 != 0) {
				for (int k = i - 1; k < n; k++)
					System.out.print(" ");

				// printing '*' in each column.

				for (int j = 0; j <= i - 1; j++) {
					if (n - 1 == i - 1) {
						System.out.print("* ");
					} else {
						if (i == j || j == 0 || j == i - 1 || Math.round(i / 2) == j)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				}
			} else {
				System.out.println();
			}
		}
		System.out.println();
		for (int i = 0; i < n * 2; i++) {
			System.out.print("*");
		}

	}

}