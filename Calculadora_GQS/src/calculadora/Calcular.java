package calculadora;

public class Calcular extends Calculadora{
	public double calcular(String op1) {
		String[] partes = op1.split(" ");

		double numero1 = Double.valueOf(partes[0]);
		double numero2 = Double.valueOf(partes[2]);

		if ("+".equals(partes[1])) {
			return somar(numero1, numero2);
		} else if ("-".equals(partes[1])) {
			return subtrair(numero1, numero2);
		} else if ("/".equals(partes[1])) {
			return dividir(numero1, numero2);
		} else if ("*".equals(partes[1])) {
			return multiplicar(numero1, numero2);
		} else if ("%".equals(partes[1])) {
			return restoDivisao(numero1, numero2);
		}

		return 0;
	}
}
