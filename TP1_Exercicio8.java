import java.util.StringTokenizer;
import java.util.Scanner;

public class TP1_Exercicio8 {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			//Declara��o das Vari�veis e input de valores
			System.out.print("Introduza 4 nomes de autom�veis, separados por ponto e v�rgula: ");
			String nomesAutomoveis = scanner.nextLine();
			
			//Separa os nomes (via m�todos da classe StringTokenizer)
			StringTokenizer divideAFrase = new StringTokenizer(nomesAutomoveis, ";");
			
			//Array unidimensional (que armazena dados tipo String)
			String recebeToken[] = new String[4];
			
			//Imprime no ecr� o conte�do do array unidimensional
			while(divideAFrase.hasMoreElements()) {
				for(int i = 0; i < recebeToken.length; i++) {
					recebeToken[i] = divideAFrase.nextToken();
					System.out.println(recebeToken[i]);
				}
				
			}
		}

	}
}
