import java.util.Scanner;
public class TP1_Exercicio2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
//	N�MERO 1
//	Al�nea a
			//Input dos dados
//			System.out.println("==========SOMA========");
//			System.out.print("Informe o primeiro valor: ");
//			double Soma_num1 = scanner.nextDouble();
//			System.out.print("Informe o segundo valor: ");
//			double Soma_num2 = scanner.nextDouble();
//			System.out.print("Informe o terceiro valor: ");
//			double Soma_num3 = scanner.nextDouble();
			
//			double resultSoma = soma(Soma_num1, Soma_num2, Soma_num3);
//			System.out.println("O resultado da soma �: " + resultSoma);
			
			
//	Al�nea b
			//Input de dados
//			System.out.println("==========SUBTRA��O========");
//			System.out.print("Informe o primeiro valor: ");
//			int Sub_num1 = scanner.nextInt();
//			System.out.print("Informe o segundo valor: ");
//			int Sub_num2 = scanner.nextInt();
//			System.out.print("Informe o terceiro valor: ");
//			int Sub_num3 = scanner.nextInt();
			
//			int resultSub = subtrai(Sub_num1, Sub_num2, Sub_num3);
//			System.out.println("O resultado da subtra��o �: " + resultSub);
			

//	Al�nea c
			//Input de dados
//			System.out.println("==========MULTIPLICA��O========");
//			System.out.print("Informe o primeiro valor: ");
//			double Multi_num1 = scanner.nextDouble();
//			System.out.print("Informe o segundo valor: ");
//			double Multi_num2 = scanner.nextDouble();
//			System.out.print("Informe o terceiro valor: ");
//			double Multi_num3 = scanner.nextDouble();
			
//			double resultMulti = multiplica(Multi_num1, Multi_num2, Multi_num3);
//			System.out.println("O resultado da multiplica��o �: " + resultMulti);
		

//	Al�nea d
			//Input dos dados
//			System.out.println("==========DIVIS�O========");
//			System.out.print("Informe o primeiro valor: ");
//			double Div_num1 = scanner.nextDouble();
//			System.out.print("Informe o segundo valor: ");
//			double Div_num2 = scanner.nextDouble();
//			System.out.print("Informe o terceiro valor: ");
//			double Div_num3 = scanner.nextDouble();
					
//			double resultDiv = divide(Div_num1, Div_num2, Div_num3);
//			System.out.println("O resultado da divis�o �: " + resultDiv);
			
			
//	Al�nea e
			//Input dos dados
//			System.out.println("==========RESTO DA DIVIS�O========");
//			System.out.print("Informe o primeiro valor: ");
//			int resDiv_num1 = scanner.nextInt();
//			System.out.print("Informe o segundo valor: ");
//			int resDiv_num2 = scanner.nextInt();
//			System.out.print("Informe o terceiro valor: ");
//			int resDiv_num3 = scanner.nextInt();
							
//			int resDivResult = restoDivisao(resDiv_num1, resDiv_num2, resDiv_num3);
//			System.out.println("O resto da divis�o dos dois primeiros n�meros �: " + resDivResult);
			
			
//	==================================================================================================		
//	N�MERO 2
//	Al�nea a
			//Input dos dados
//			System.out.println("==========C�LCULO DA PER�METRO DO RECT�NGULO========");
//			System.out.print("Informe a base do rect�ngulo: ");
//			double base = scanner.nextDouble();
//			System.out.print("Informe a altura rect�ngulo: ");
//			double altura = scanner.nextDouble();
			
//			//C�lculo e impress�o do resultado no ecr�
//			double perimetro = perimetroRectangulo(base, altura);
//			System.out.println("O per�metro do rect�ngulo �: " + perimetro);
			
			
//	Al�nea b
			//Input dos dados
//			System.out.println("==========C�LCULO DA �REA DO RECT�NGULO========");
//			System.out.print("Informe a base do rect�ngulo: ");
//			double base_1 = scanner.nextDouble();
//			System.out.print("Informe a altura rect�ngulo: ");
//			double altura_1 = scanner.nextDouble();
			
			//C�lculo e impress�o do resultado no ecr�
//			double area = areaRectangulo(base_1, altura_1);
//			System.out.println("A �rea do rect�ngulo �: " + area);
			
			
//	Al�nea c
			//Input dos dados
//			System.out.println("==========C�LCULO DO VOLUME DO CILINDRO========");
//			System.out.print("Informe a base do rect�ngulo: ");
//			double raio = scanner.nextDouble();
//			System.out.print("Informe a altura rect�ngulo: ");
//			double altura_2 = scanner.nextDouble();
			
//			//C�lculo e impress�o do resultado no ecr�
//			double volume = volumeCilindro(raio, altura_2);
//			System.out.println("O volume do cilindro � de: " + volume);
		
	
//	==================================================================================================
//		N�MERO 3
			System.out.println("N�MERO 3");
		//Al�nea a
			Boolean isEqual = booleanOr();
			System.out.println("Al�nea a: " + isEqual);
//			Valor L�gico Boolean "OU Inclusivo":	
//			=> Retorna True se A ou B forem True. Sen�o retorna False;
//			=> Ambas express�es A e B s�o sempre avaliadas	
			
			
		//Al�nea b
			Boolean isEqual1 = booleanAnd();
			System.out.println("Al�nea b: " +isEqual1);
//			Valor L�gico Boolean "E":	
//			=> Retorna True se A e B forem True. Sen�o retorna False;
//			=> Ambas express�es A e B s�o sempre avaliadas.
			
			
		//Al�nea c
			Boolean isEqual2 = booleanOr1();
			System.out.println("Al�nea c: " +isEqual2);
//			Valor L�gico Boolean "OU Exclusivo":	
//			=> Retorna True se A for True e B for False ou vice-versa. Sen�o retorna False.
			
		//Al�nea d
			Boolean isEqual3 = booleanNot();
			System.out.println("Al�nea d: " +isEqual3);
//			Valor L�gico "N�o":
//			=> Retorna True se A for False. Sen�o retorna False.
			
		//Al�nea e
			Boolean isEqual4 = booleanOr2();
			System.out.println("Al�nea e: " +isEqual4);
//			Valor L�gico "OU":	
//			=> Retorna True se A ou B for True. Sen�o retorna False;
//			=> Se A for True, B n�o � avaliada.

			
		//Al�nea f
			Boolean isEqual5 = booleanAnd1();
			System.out.println("Al�nea f: " +isEqual5);
//			Valor L�gico "E":	
//			=> Retorna True se A e B forem True. Sen�o retorna False;
//			=> Se A for False, B n�o � avaliada.
			
			
//	==================================================================================================
//	N�MERO 4
		System.out.println("");
		System.out.println("N�MERO 4");
		//Al�nea a
			Boolean isGreater = booleanMaior();
			System.out.println("Al�nea a: " + isGreater);
//			Maior:	
//			=> Utilizado quando desejamos verificar se uma vari�vel � maior que a outra.	
			
			
		//Al�nea b
			Boolean isGreater1 = booleanMenor();
			System.out.println("Al�nea b: " +isGreater1);
//			Menor:	
//			=> Utilizado quando desejamos verificar se uma vari�vel � menor que a outra.
			
			
		//Al�nea c
			Boolean isGreater2 = booleanMaiorIgual();
			System.out.println("Al�nea c: " +isGreater2);
//			Maior ou Igual:	
//			=> Utilizado quando desejamos verificar se uma vari�vel � maior ou igual a outra.
			
		//Al�nea d
			Boolean isGreater3 = booleanMenorIgual();
			System.out.println("Al�nea d: " +isGreater3);
//			Menor ou Igual:
//			=> Utilizado quando desejamos verificar se uma vari�vel � menor ou igual a outra.
			
		//Al�nea e
			Boolean isGreater4 = booleanNaoIgual();
			System.out.println("Al�nea e: " +isGreater4);
//			N�o Igual:	
//			=> Utilizado quando desejamos verificar se uma vari�vel � diferente da outra.

			
		//Al�nea f
			Boolean isGreater5 = booleanIgual();
			System.out.println("Al�nea f: " +isGreater5);
//			Igualdade:	
//			=> Utilizado quando desejamos verificar se uma vari�vel � igual a outra.
			
			
//	N�MERO 5
			//Vari�veis
//			char caracter1 = 'c';
//			char caracter2 = 'j';
			
			//Verifica��o das Condi��es
//			if (caracter1 == caracter2) {
//				System.out.println("Os caracteres �caracter1� e �caracter2� s�o iguais.");
//			}else {
//				System.out.println("Os caracteres �caracter1� e �caracter2� s�o diferentes.");
//			}
			
			
//	N�MERO 6
			//Input de dados
//			System.out.print("Informe a primeira frase: ");
//			String frase = scanner.nextLine();
//			System.out.print("Informe a segunda frase: ");
//			String frase1 = scanner.nextLine();
//			Boolean isEqual = frase.equals(frase1);
			
//			if(isEqual) {
//				System.out.println(" ");
//				System.out.print("As strings �" + frase + "� e �" + frase1 + "� s�o iguais.");
//			}else {
//				System.out.println(" ");
//				System.out.print("As strings �" + frase + "� e �" + frase1 + "� s�o diferentes.");
//			}
			
					
			
		}
	}

//	SUBPROGRAMAS ou M�TODOS
//	N�MERO 1
	//Soma
	public static double soma(double num1, double num2, double num3){
		double resultado = num1 + num2 + num3;
		return resultado;
	}
			
	//Subtra��o
	public static int subtrai(int num1, int num2, int num3){
		int resultado = num1 - num2 - num3;
		return resultado;
	}
			
	//Multiplica��o
	public static double multiplica(double num1, double num2, double num3){
		double resultado = num1 * num2 * num3;
		return resultado;
	}
			
	//Divis�o
	public static double divide(double num1, double num2, double num3){
		double resultado = num1 / num2 / num3;
		return resultado;
	}
			
	//Resto da divis�o
	public static int restoDivisao(int num1, int num2, int num3){
		int resultado = num1 % num2;
		return resultado;
	}
	
//	==================================================================================================	
//	N�MERO 2
	
	//Per�metro
	public static double perimetroRectangulo(double num1, double num2){
		double perimetro = (2*num1) / (2*num2);
		return perimetro;
	}
	
	//�rea
	public static double areaRectangulo(double num1, double num2){
		double area = num1 * num2;
		return area;
	}
	
	//�rea
	public static double volumeCilindro(double num1, double num2){
		double volume = 3.14 * Math.sqrt(num1) * num2;
		return volume;
	}
	
//	==================================================================================================	
//	N�MERO 3
	
	//Al�nea a
	public static boolean booleanOr(){
		var result = (5 >= 3 | 4 < 6);
		return result;
	}
	
	//Al�nea b
	public static boolean booleanAnd(){
		var result = (3 >= 3 & 2 > 3);
		return result;
	}
	
	//Al�nea c
	public static boolean booleanOr1(){
		var result = (3 == 3 ^ 5 == 2);
		return result;
	}
		
	//Al�nea d
	public static boolean booleanNot(){
		var result = (4 != 3);
		return result;
	}
	
	//Al�nea e
	public static boolean booleanOr2(){
		var result = (6 != 6 || 2 > 5);
		return result;
	}
	
	//Al�nea f
	public static boolean booleanAnd1(){
		var result = (6 != 6 && 2 > 5);
		return result;
	}
	
	
//	==================================================================================================	
//	N�MERO 4
	
	//Al�nea a
	public static boolean booleanMaior(){
		var result = (6 > 6);
		return result;
	}
	
	//Al�nea b
	public static boolean booleanMenor(){
		var result = (20 < 2);
		return result;
	}
	
	//Al�nea c
	public static boolean booleanMaiorIgual(){
		var result = (30 >= 25.6);
		return result;
	}
		
	//Al�nea d
	public static boolean booleanMenorIgual(){
		var result = (100 <= 100);
		return result;
	}
	
	//Al�nea e
	public static boolean booleanNaoIgual(){
		var result = (2 != 1);
		return result;
	}
	
	//Al�nea f
	public static boolean booleanIgual(){
		var result = (0 == 0);
		return result;
	}
	
}
