package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// ■進め方
//   1. レッド（失敗）
//   2. グリーン（成功）
//   3. リファクタリング（修正）
//
// ■ルール
//   1. 失敗するテストを1つ書くまでは、新しいコードを一切書かない
//   2. 「危なっかしい所」をすべてテストする
public class CalculatorTest {

	private Calculator calculator = new Calculator();

	@Test
	public void 累乗する() {
		// 10の2乗は100である
		assertEquals(100, calculator.power(10, 2));
	}
}
