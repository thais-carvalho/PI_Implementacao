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
			System.out.println("Selecione uma operação:\n1 - Redução por vizinho mais próximo\n2 - Ampliação por vizinho mais próximo\n3 - Redução por interpolação bilinear\n4 - Ampliação por interpolação bilinear\n0 - Sair\n\n");
			operacao = scan.nextInt();
			
			if (operacao > 0 && operacao < 5)
			{
				System.out.println("Insira o número de linhas e colunas da matriz quadrada:\n");
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
				case 1: System.out.println("Redução Vizinho\n\n");
				tamanho_res = tamanho_orig/2;
				matriz_res = new int[tamanho_res][tamanho_res];
				for(int i = 0, m = 0; i < tamanho_res; i++, m+=2)
				{
					for (int j = 0, n = 0; j < tamanho_res; j++, n+=2)
					{
						matriz_res[i][j] = matriz_orig[m][n];
					}
				}
				
				for (int i = 0; i < tamanho_res; i++)
				{
					for (int j = 0; j < tamanho_res; j++)
					{
						System.out.print(matriz_res[i][j] + " ");
					}
					System.out.println();
				}
				
				break;
				
				case 2: System.out.println("Ampliação Vizinho\n\n");
				tamanho_res = tamanho_orig * 2;
				matriz_res = new int[tamanho_res][tamanho_res];
				break;
				
				case 3: System.out.println("Redução Interpolação\n\n");
				break;
				
				case 4: System.out.println("Ampliação Interpolação\n\n");
				break;
				
				case 0: System.out.println("Programa encerrado\n\n");
				break;
				
				default: System.out.println("Opção Inválida\n\n");
			}
			
		}
	}
	
}
