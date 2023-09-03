import java.util.Scanner;

public class TP1_Exercicio3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
//	N�MERO 1
			//Declara��o das Vari�veis
//			double Quadril = 0;
//			double altura = 0;
//			int Gender = 0;
					
			//Atribu���o de Valores �s Vari�veis
//			System.out.println("1. Masculino");
//			System.out.println("2. Femenino");
//			System.out.print("Seleccione o seu g�nero: ");
//			Gender = scanner.nextInt();
//			System.out.print("Digite o tamanho do quadril: ");
//			Quadril = scanner.nextDouble();
//			System.out.print("Digite a altura: ");
//			altura = scanner.nextDouble();
//			System.out.println("");
			
//			//M�todo para o C�lculo do �ndice de Adiposidade Corporal (IAC)
//			IAC(Quadril, altura, Gender);
			
			
//	N�MERO 2
			//Declara��o das Vari�veis
//			double Teste1;
//			double Teste2;
//			double TP1;
//			double TP2;
			
			//Atribu���o de Valores �s Vari�veis
//			System.out.print("Digite a nota do 1� Teste: ");
//			Teste1 = scanner.nextDouble();
//			System.out.print("Digite a nota do 2� Teste: ");
//			Teste2 = scanner.nextDouble();
//			System.out.print("Digite a nota do 1� Trabalho: ");
//			TP1 = scanner.nextDouble();
//			System.out.print("Digite a nota do 2� Trabalho: ");
//			TP2 = scanner.nextDouble();
//			System.out.println(" ");
			
			//M�todo para C�lculo da Frequ�ncia
//			N_Frequencia(Teste1, Teste2, TP1, TP2);
		}
	}
	
	
//	SUBPROGRAMAS ou M�TODOS
//	N�MERO 1
	public static double IAC(double quadril, double altura, double genero) {
		//C�lculo do �ndice de Adiposidade Corporal (IAC)
		double IAC = (quadril / (altura * Math.sqrt(altura) )) - 18;
	
		//Verifica��o das Condi��es
		if(genero == 1) {
			if(IAC >= 8 && IAC <= 20) {
				System.out.println("IAC: " + IAC);
				System.out.println("Adiposidade normal.");
			}else if(IAC >= 21 && IAC <= 25) {
				System.out.println("IAC: " + IAC);
				System.out.println("Sobrepeso.");
			}else if(IAC > 25) {
				System.out.println("IAC: " + IAC);
				System.out.println("Obesidade.");
			}
		}else if(genero == 2) {
			if(IAC >= 21 && IAC <= 31) {
				System.out.println("IAC: " + IAC);
				System.out.println("Adiposidade normal.");
			}else if(IAC >= 33 && IAC <= 38) {
				System.out.println("IAC: " + IAC);
				System.out.println("Sobrepeso.");
			}else if(IAC > 38) {
				System.out.println("IAC: " + IAC);
				System.out.println("Obesidade.");
			}	
		}else {
			System.out.print("A op��o de g�nero seleccionada n�o existe. Tente novamente!");
		}
		return genero;
	}
	
	
//	==================================================================================================
//	N�MERO 2
	public static double N_Frequencia(double Teste1, double Teste2, double TP1, double TP2) {		
	//C�lculo da M�dia
		double media = 0.5 * ((Teste1 + Teste2) /2) + 0.5 * ((TP1 + TP2) /2);
		
	//Verifica��o das Condi��es
		if(media >=10) {
			System.out.println("M�dia: " + media);
			System.out.println("Estudante admitido ao exame.");
		}else {
			System.out.println("M�dia: " + media);
			System.out.println("Estudante n�o admitido ao exame.");
		}
		return media;
	}
}
