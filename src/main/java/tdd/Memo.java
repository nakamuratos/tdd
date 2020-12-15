package tdd;

public class Memo {

	// 1‰ñ–Ú
	public int pow1(int a, int b) {
		int c = a;
		for (int i = 0; i < b - 1; i++) {
			c = c * a;
		}
		return c;
	}

	// 2‰ñ–Ú
	public int pow2(int a, int b) {
		if (b == 0) {
			return 1;
		}

		int c = a;
		for (int i = 0; i < b - 1; i++) {
			c = c * a;
		}
		return c;
	}

	// 3‰ñ–Ú
	public int pow3(int a, int b) {
		// –¼‘O•ÏX
		return 0;
	}

}
