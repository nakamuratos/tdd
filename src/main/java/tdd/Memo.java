package tdd;

public class Memo {

	// 1���
	public int pow1(int a, int b) {
		int c = a;
		for (int i = 0; i < b - 1; i++) {
			c = c * a;
		}
		return c;
	}

	// 2���
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

	// 3���
	public int pow3(int a, int b) {
		// ���O�ύX
		return 0;
	}

}
