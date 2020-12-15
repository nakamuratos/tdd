package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// ■進め方
//   1. レッド（テスト失敗）
//   2. グリーン（テスト成功）
//   3. リファクタリング
//
// ■ルール
//   1.失敗するテストをひとつ書くまでは、新しいコードを一切書かない
//   2.「危なっかしい所」をすべてテストする
public class CalculatorTest {

	private Calculator calculator = new Calculator();

	@Test
	public void 累乗する() {
		assertEquals(100, calculator.power(10, 2));
	}
}
