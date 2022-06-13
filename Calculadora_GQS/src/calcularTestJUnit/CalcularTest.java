package calcularTestJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calcular;

class CalcularTest extends Calcular{

	@Test
	public void testarCalculo() {
		Calcular calc = new Calcular();
		assertEquals(15, calc.calcular("3 * 5"));
		assertEquals(8, calc.calcular("3 + 5"));
		assertEquals(2, calc.calcular("10 / 5"));
		assertEquals(1, calc.calcular("5 % 4"));
		assertEquals(2, calc.calcular("5 - 3"));
	}

}
