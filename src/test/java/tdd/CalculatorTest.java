package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// ���i�ߕ�
//   1. ���b�h�i�e�X�g���s�j
//   2. �O���[���i�e�X�g�����j
//   3. ���t�@�N�^�����O
//
// �����[��
//   1.���s����e�X�g���ЂƂ����܂ł́A�V�����R�[�h����؏����Ȃ�
//   2.�u��Ȃ����������v�����ׂăe�X�g����
public class CalculatorTest {

	private Calculator calculator = new Calculator();

	@Test
	public void �ݏ悷��() {
		assertEquals(100, calculator.power(10, 2));
	}
}
