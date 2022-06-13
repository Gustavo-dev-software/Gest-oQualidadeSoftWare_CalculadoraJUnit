package calculadoraTestJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTest {

	@Test
	public void somarTest() {
		Calculadora calc = new Calculadora();
		assertEquals(calc.somar(1, 1), 2);
		assertEquals(calc.somar(3, 1), 4);
		assertEquals(calc.somar(6, 2), 8);
	}

	@Test
	public void subtrairTest() {
		Calculadora calc = new Calculadora();
		assertEquals(calc.subtrair(1, 1), 0);
		assertEquals(calc.subtrair(3, 1), 2);
		assertEquals(calc.subtrair(6, 2), 4);
	}

	@Test
	public void dividirTest() {
		Calculadora calc = new Calculadora();
		assertEquals(calc.dividir(1, 1), 1);
		assertEquals(calc.dividir(3, 1), 3);
		assertEquals(calc.dividir(6, 2), 3);
	}

	@Test
	public void multiplicarTest() {
		Calculadora calc = new Calculadora();
		assertEquals(calc.multiplicar(1, 1), 1);
		assertEquals(calc.multiplicar(3, 1), 3);
		assertEquals(calc.multiplicar(6, 2), 12);
	}

	@Test
	public void restoDivisaoTest() {
		Calculadora calc = new Calculadora();
		assertEquals(calc.restoDivisao(5, 2), 1);
		assertEquals(calc.restoDivisao(3, 2), 1);
		assertEquals(calc.restoDivisao(5, 5), 0);
	}
}
