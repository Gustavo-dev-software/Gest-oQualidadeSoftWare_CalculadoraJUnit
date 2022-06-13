package calculadora;

import java.util.Scanner;

import media.Media;

public class ClienteCalculadora {
	public static void main(String[] args) {

		// calculando a soma  ->CLASS CALCULADORA
		Calculadora calcSoma = new Calculadora();
		double resultSoma = calcSoma.somar(3, 4);
		System.out.println("Soma: " + resultSoma);

		// calculando a Subtra��o: ->CLASS CALCULADORA
		Calculadora calcSubtrair = new Calculadora();
		double resultSubtrair = calcSubtrair.subtrair(5, 4);
		System.out.println("Subtra��o: " + resultSubtrair);

		// calculando a Divis�o: ->CLASS CALCULADORA
		Calculadora calcDividir = new Calculadora();
		double resultDividir = calcDividir.dividir(3, 3);
		System.out.println("Divis�o: " + resultDividir);

		// calculando a Multiplica��o: ->CLASS CALCULADORA
		Calculadora calcMultiplicar = new Calculadora();
		double resultMultiplicar = calcMultiplicar.multiplicar(2, 8);
		System.out.println("Multiplica��o: " + resultMultiplicar);

		// calculando a Resto da Divis�o: ->CLASS CALCULADORA
		Calculadora restoDivisao = new Calculadora();
		double resultRestoDivisao = restoDivisao.restoDivisao(5, 2);
		System.out.println("Resto da Divis�o: " + resultRestoDivisao);

		// calculando a Media de 3 N�meros: ->CLASS M�DIA
		Media med3 = new Media();
		double resultMed3 = med3.media3(4, 3, 2);
		System.out.println("Media de 3 N�meros: " + resultMed3);

		// calculando a Media de 2 N�meros: ->CLASS M�DIA
		Media med2 = new Media();
		double resultMed2 = med2.media2(4, 2);
		System.out.println("Media de 2 N�meros: " + resultMed2);

		// calculando a Media de 4 N�meros: ->CLASS M�DIA
		Media med4 = new Media();
		double resultMed4 = med4.media4(4, 4, 4, 4);
		System.out.println("Media de 4 N�meros: " + resultMed4 + "\n\n");

		// Calculadora USU�RIO 1 ->CLASS CALCULADORA
		Scanner in = new Scanner(System.in);
		System.out.println("##### -->Calculadora 1<-- #####");
		System.out.println("Voce deseja: ");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Dividir");
		System.out.println("4 - Multiplicar");
		System.out.println("5 - Resto");
		System.out.print("Opcao: ");
		int op = in.nextInt();
		System.out.print("Legal, digite o primeiro numero: ");
		int numero1 = in.nextInt();
		System.out.print("E agora digite o segundo numero: ");
		int numero2 = in.nextInt();

		Calculadora calc = new Calculadora();

		if (op == 1) {
			System.out.println("A soma eh " + calc.somar(numero1, numero2));
		} else if (op == 2) {
			System.out.println("A subtracao eh " + calc.subtrair(numero1, numero2));
		} else if (op == 3) {
			System.out.println("A divisao eh " + calc.dividir(numero1, numero2));
		} else if (op == 4) {
			System.out.println("A multiplicacao eh " + calc.multiplicar(numero1, numero2));
		} else if (op == 4) {
			System.out.println("O resto eh " + calc.restoDivisao(numero1, numero2));
		}
		System.out.println("##### Fim #####\n\n");

		// Calculadora USU�RIO 2 ->CLASS CALCULAR
		Scanner input = new Scanner(System.in);
		System.out.println("##### -->Calculadora 2<-- #####");
		System.out.print("Digite sua operacao: ");
		String op1 = input.nextLine();
		Calcular calc1 = new Calcular();
		System.out.println("O resultado eh " + calc1.calcular(op1));
		System.out.println("##### Fim #####\n\n");

		in.close();
		input.close();
	}
}
