import java.util.Scanner;
import java.util.Random;

public class TP1_Exercicio6 {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
//		N�MERO 1
			//Input de Dados 
//			System.out.print("Informe o valor: ");
//			double num = scanner.nextDouble();
			
			//M�todo para o C�lculo da Raiz Quadrada
//			raizQuadrada(num);
			
			
//		N�MERO 2
			//Input de Dados 
//			System.out.print("Informe a base: ");
//			double num1 = scanner.nextDouble();
//			System.out.print("Informe o expoente: ");
//			double expoente = scanner.nextDouble();
			
			//M�todo para o C�lculo da Pot�ncia
//			potencia(num1, expoente);
			
			
//		N�MERO 3
			//Input de Dados 
//			System.out.print("Informe a base: ");
//			double num2 = scanner.nextDouble();
//			System.out.print("Informe o expoente: ");
//			double expoente1 = scanner.nextDouble();
				
			//M�todo para o C�lculo da Pot�ncia
//			arredondarPotencia(num2, expoente1);
			

//		N�MERO 4
			//M�todo para n�meros aleat�rios
//			numsAleatorios();
		
			
			
//		Os exerc�cios que se seguem est�o no m�todo MAIN pois os mesmos n�o exigiam que estivessem em subprogramas
//		N�MERO 5
			//Apresenta no ecr� o n�mero de caracteres da frase
//			System.out.print("Digite a frase: ");
//			String frase = scanner.nextLine();
//			System.out.println("N�mero de caracteres da frase: " + frase.length());
			
//		N�MERO 6
			//Apresenta no ecr� a posi��o do caractere
//			System.out.print("Digite a frase: ");
//			String frase_1 = scanner.nextLine();
//			System.out.println("Caractere no �ndice 0: " + frase_1.charAt(0));
//			System.out.println("Caractere no �ndice 1: " + frase_1.charAt(1));
			
//			N�MERO 6
			//Compara��o de duas frases(sem ter em conta se s�o mai�sculas ou min�sculas)
//			System.out.print("Digite a primeira frase: ");
//			String frase_1 = scanner.nextLine();
//			System.out.print("Digite a segunda frase: ");
//			String frase_2 = scanner.nextLine();
//			Boolean isEqual = frase_1.equalsIgnoreCase(frase_2);
			
//			if(isEqual) {
//				System.out.println(" ");
//				System.out.print("As frases �s�o iguais�.");
//			}else {
//				System.out.println(" ");
//				System.out.print("As frases �s�o diferentes�.");
//			}
			
			
		}
	}
	
	
//	===================================================================================================	
//	Subprogramas ou M�todos Secund�rios
//	N�MERO 1
	//Raiz Quadrada de Um N�mero
	public static double raizQuadrada(double num_1) {
		double result = Math.sqrt(num_1);
		System.out.print("Resultado: " + result);
		return result;
	}
	
//	N�MERO 2
	//Pot�ncia de Um N�mero
	public static double potencia(double num_1, double exp) {
		double result = Math.pow(num_1, exp);
		System.out.print("Resultado: " + result);
		return result;
	}
	
//	N�MERO 3
	//Pot�ncia de Um N�mero e Arredontamento
	public static double arredondarPotencia(double num_1, double num_exp) {
		double result = Math.pow(num_1, num_exp); 
		double result2 = Math.round(result);
		System.out.print("Resultado: " + result2);
		return result2;
	}
	
//	N�MERO 4
	//Gera N�meros Aleat�rios
	public static int numsAleatorios() {
		Random gerar = new Random();
		
		for(int i = 1; i < 11; i++) {
			int number = gerar.nextInt(60);
			System.out.println(i + ". Numero Aleat�rio: " + number);
		}
		return 0;
	}

}
