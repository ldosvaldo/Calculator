import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		//Declaração das Variaveis
		
		Integer option = -1;
		Double num1 = 0.0;
		Double num2 = 0.0;
		Double result = 0.0;
		
		//Instancia das classes e objetos que vamos utilizar
		Scanner entrada = new Scanner(System.in);
		
		while(option != 0) {
			System.out.print(
					  "         CALCULADORA                  "
					+ "\n"
					+ "\n!     1 - S O M A R                !"
					+ "\n!									!"
					+ "\n!     2 - S U B T R A I R          !"
					+ "\n!									!"
					+ "\n!     3 - D I V I D I R            !"
					+ "\n!									!"
					+ "\n!     4 - M U L T I P L I C A R    !"
					+ "\n!									!"
					+ "\n!     5 - P O T E N C I A Ç Ã O    !"
					+ "\n!									!"
					+ "\n!     6 - R A I Z                  !"
					+ "\n!									!"
					+ "\n!     7 - P O R C E N T A G E M    !"
					+ "\n!     ----------------------       !"
					+ "\n!     0 -  S A I R                 !"
					+ "\n Informe a Opção Desejada \n\n");
			
			//Captura a opçao do menu digitada pelo usuario
			option = entrada.nextInt();
			
			switch(option) {
			case 1:{ 
				//Solicita a entrada de numeros ao usuario
				System.out.println("\n\n Informe um numero para sua soma >>>");
				num1 = entrada.nextDouble();
				System.out.println("\n\n Informe outro numero para sua soma >>>");
				num2 = entrada.nextDouble();
				
				//instancia a classe SUM, criando  o objeto sum
				Sum  sum = new Sum(num1, num2);
				
				//Atribui  o resultado do metodo calculateSum para a variavel result
				result = sum.calculateSum(num1, num2);
				
				//Exibe a saida do usuario (Resultado da soma)
				System.out.println("Resultado: "+num1+ " + " + num2 + " = " +result );
				break;
			}
			case 2:{
				//Solicita a entrada de numeros ao usuario
				System.out.println("\n\n Informe um numero para a sua subtração >>>");
				num1 = entrada.nextDouble();
				System.out.println("\n\n Informe outro numero para a sua subtração >>>");
				num2 = entrada.nextDouble();
				
				//Instrancia a classe Subtraction, criando o objeto subtraction
				Subtraction subtraction = new Subtraction(num1,num2);
				
				//Atribui o resultado do metodo calculateSubtraction para a variavel result
				result = subtraction.calculateSubtraction(num1, num2);
				
				//Exibe a saida do usuario(Resultado da subtraçao)
				System.out.println("Resultado: "+num1+ " - "+num2+ " - " +result);
				break;
			}
		case 3: {
			//Solicita a entrada de numeros ao usuario
			System.out.println("\n\n Informe o numero que sera dividido (dividendo) >>>");
			num1 = entrada.nextDouble();
			System.out.println("\n\n Informe o numero que sera o divisor");
			num2 = entrada.nextDouble();
			
			//Instancia a classe Division, criando o objeto division
			Division division = new Division(num1, num2);
			
			//atribui o resultado do metodo calculateDivision para a variavel result
			result = division.calculateDivision(num1, num2);
			
			//Exibe a saida do usuario(Resultado da divisao)
			System.out.println("Resultado: " +num1+ " / " +num2+ " = " + result);
			break;
		}
		case 4: {
			//Solicita a entrada de numeros ao usuario
			System.out.println("\n\n Informe o numero que sera multiplicado >>>");
			num1 = entrada.nextDouble();
			System.out.println("\n\n Informe outro numero que sera multiplicado >>>");
			num2 = entrada.nextDouble();
			
			//Instancia a classe Multiplication, criando o objeto
			Multiplication multiplication = new Multiplication(num1,num2);
			
			//atribui o resultado do metodo calculateMultiplication para a variavel result
			result = multiplication.calculateMultiplication(num1, num2);
			
			//Exibe a saida do usuario (resultado da multiplicação)
			System.out.println("Resultado: "+num1+ " * " +num2+ " = " +result);
			break;
		}
		case 5:{
			//Solicita a entrada de numeros ao usuario
			System.out.println("\n\n Informe o numero sera a base da potenciação >>>");
			num1 = entrada.nextDouble();
			System.out.println("\n\n Informe o numero que sera o exponente.");
			num2 = entrada.nextDouble();

			//Instancia a classe Multiplication, criando o objeto
			Potentiation potentiation = new Potentiation(num1, num2);
			
			//atribui o resultado do metodo calculePotentiation para a variavel result
			result = potentiation.calculatePotentiation(num1, num2);
			
			//Exibe a saida do usuario (resultado da potencia)
			System.out.println("Resultado: "+num1+ " ^ "+num2+ " = "+result);
			break;
		}
		case 6:{
			//Solicita a entrada de numeros ao usuario
			System.out.println("\n\n Informe o numero que sera calculado a raiz quadrada >>>");
			num1 = entrada.nextDouble();
			
			//Instancia a classe RaizQuadrada, criando o objeto
			Raiz raiz = new Raiz(num1);
			
			//atribui o resultado do metodo calculateRaiz para a variavel result
			result = raiz.calculateRaiz(num1);
			
			//Exibe a saida do usuario (resutado da raiz)
			System.out.println("Resultado: √"+num1+ " = "+result);
			break;
		}
		case 7:{
			//Solicita a entrada de numeros ao usuario
			System.out.println("\n\n Informe a porcentagem desejada >>>");
			num1 = entrada.nextDouble();
			System.out.println("\n\n Informe o numero");
			num2 = entrada.nextDouble();
			
			//Instancia a classe Multiplication, criando o objeto
			Percentage percentage = new Percentage(num1, num2);

			//atribui o resultado do metodo calculateRaiz para a variavel result
			result = percentage.calculatePercentage(num1, num2);
			
			//Exibe a saida do usuario (resutado da raiz)
			System.out.println("Resultado: "+num1+ "%" +num2+ " =  "+result);
			break;
		}
		case 0:{
			System.out.println("\n\n Obrigado por utilizar nosso sistema");
		}
		default:{
			if(option != 0) {
				System.out.println("\n\n Voce precisa digitar uma opção válida \n");
			}
		}
		}
	}
		entrada.close();
}
}
