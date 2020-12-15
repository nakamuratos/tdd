package tdd;

public class Memo {

	// 1回目
	public int pow1(int a, int b) {
		int c = a;
		for (int i = 0; i < b - 1; i++) {
			c = c * a;
		}
		return c;
	}

	// 2回目
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

}
