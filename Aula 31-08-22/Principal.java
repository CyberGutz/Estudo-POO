import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			//EXERC�CIO 1
			Matematica teste = new Matematica();
			int num = 4;
			
			teste.isPositive(num);
			teste.isZero(num);
			
			//EXERC�CIO 2
			Aluno a1 = new Aluno();
			a1.matricula = 1000;
			a1.nome = "Jos�";
			a1.notaP1 = 15;
			a1.notaP2 = 10.5f;
			a1.notaT = 10;
			
			a1.calculaMedia();
			a1.notaFinal();
			
			System.out.println("A Media atual do aluno �: "+a1.media+" e ele precisa de "+a1.nFinal+" na prova final");
			
			//EXERC�CIO 3
			Calculadora res = new Calculadora();
			int op;
			float a,b;
			
			do {
				System.out.println("Digite dois numeros");
				a = entrada.nextFloat();
				b = entrada.nextFloat();
				
				System.out.println("Escolha qual opera��o voc� gostaria de fazer: \n1-Somar \n2-Subitrair\n3-Dividir\n4-Multiplicar\n0-Sair");
				op = entrada.nextInt();
				
				switch(op) {
				case 0:
					System.out.println("Terminando a calculadora....");
				break;
				case 1:
					System.out.println("O resultado da soma �: "+res.somar(a, b));
				break;
				case 2:
					System.out.println("O resultado da subtrair �: "+res.subtrair(a, b));
				break;
				case 3:
					System.out.println("O resultado da divis�o �: "+res.dividir(a, b));
				break;
				case 4:
					System.out.println("O resultado da multiplicacao �: "+res.multiplicar(a, b));
				break;
				}
			}while (op!=0);
			
			
			//EXERC�CIO 4
			Equacao2grau eq = new Equacao2grau();
			eq.a = 1;
			eq.b = 2;
			eq.c = 3;
			String resultado;
			resultado = eq.calcula();

			System.out.println("A(s) raíz(es) da equação é(são): "+resultado);
			
			//EXERCICIO 6
			
			Termometro converte= new Termometro();
			float temperatura, conversao;
			int option;
			System.out.println("Digite o tipo de conversão que você quer realizar: \n1- Celsius para Fahrenheit\n2-Fahrenheit para Celsius");
			option = entrada.nextInt();
			System.out.println("Digite a temperatura para conversão: ");
			temperatura = entrada.nextFloat();
			
			switch (option) {
				case 1:
					conversao = converte.ctof(temperatura);
					System.out.println(""+temperatura+" em Fahrenheit é: "+conversao);
				break;
			
				case 2:
					conversao = converte.ftoc(temperatura);
					System.out.println(""+temperatura+" em Celsius é: "+conversao);
				break;
			}
		}

		//EXERCICIO 7


	}
}
