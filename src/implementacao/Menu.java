package implementacao;
import java.util.*;
public class Menu {

	static int operacao = 1, tamanho_orig, tamanho_res, num;
	static int matriz_orig[][], matriz_res[][];
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		while (operacao != 0)
		{
			System.out.println("Selecione uma opera��o:\n1 - Redu��o por vizinho mais pr�ximo\n2 - Amplia��o por vizinho mais pr�ximo\n3 - Redu��o por interpola��o bilinear\n4 - Amplia��o por interpola��o bilinear\n0 - Sair\n\n");
			operacao = scan.nextInt();
			
			if (operacao > 0 && operacao < 5)
			{
				System.out.println("Insira o n�mero de linhas e colunas da matriz quadrada:\n");
				tamanho_orig = scan.nextInt();
				matriz_orig = new int[tamanho_orig][tamanho_orig];
				
				System.out.println("Insira os valores da sua matriz:\n\n");
				for (int i = 0; i < tamanho_orig; i++)
				{
					for (int j = 0; j < tamanho_orig; j++)
					{
						matriz_orig[i][j] = scan.nextInt();
					}
				}
				
				for (int i = 0; i < tamanho_orig; i++)
				{
					for (int j = 0; j < tamanho_orig; j++)
					{
						System.out.print(matriz_orig[i][j] + " ");
					}
					System.out.println();
				}
			}
			switch (operacao)
			{
				case 1: System.out.println("Redu��o Vizinho\n\n");
				tamanho_res = tamanho_orig/2;
				matriz_res = new int[tamanho_res][tamanho_res];
				for(int i = 0, m = 0; i < tamanho_res; i++, m+=2)
				{
					
				}
				
				break;
				
				case 2: System.out.println("Amplia��o Vizinho\n\n");
				break;
				
				case 3: System.out.println("Redu��o Interpola��o\n\n");
				break;
				
				case 4: System.out.println("Amplia��o Interpola��o\n\n");
				break;
				
				case 0: System.out.println("Programa encerrado\n\n");
				break;
				
				default: System.out.println("Op��o Inv�lida\n\n");
			}
			
		}
	}
	
}
