package tdd;

// 計算機
public class Calculator {
	// 累乗する
	public int power(int a, int b) {
		if (b == 0) {
			return 1;
		}

		int result = a;
		for (int i = 0; i < b - 1; i++) {
			result = result * a;
		}
		return result;
	}
}
