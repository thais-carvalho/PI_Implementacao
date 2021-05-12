package implementacao;
import java.util.*;
public class Menu {

	static int operacao = 1, tamanho_orig, tamanho_res, m, n;
	static int matriz_orig[][], matriz_res[][];
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		while (operacao != 0)
		{
			System.out.println("\n\nSelecione uma operação:\n1 - Redução por vizinho mais próximo\n2 - Ampliação por vizinho mais próximo\n3 - Redução por interpolação bilinear\n4 - Ampliação por interpolação bilinear\n0 - Sair\n\n");
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
				case 1: System.out.println("\n\nRedução Vizinho\n\n");
				tamanho_res = (tamanho_orig/2) + (tamanho_orig%2);
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
				
				
				case 2: System.out.println("\n\nAmpliação Vizinho\n\n");
				tamanho_res = tamanho_orig * 2;
				matriz_res = new int[tamanho_res][tamanho_res];
				
				m = -1;
				n = 0;
				for (int i = 0; i < tamanho_res; i++)
				{
					if (i%2 == 0)
						m++;
					n = 0;
					for (int j = 0; j < tamanho_res; j++)
					{
						
						if (i % 2 == 0 && j % 2 == 0)
						{
							matriz_res[i][j] = matriz_orig[m][n];
						}
						else if (i % 2 == 0 && j % 2 != 0)
						{
							matriz_res[i][j] = matriz_orig[m][n];
							n++;
						}
						else
						{
							matriz_res[i][j] = matriz_res[i-1][j];
						}
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
				
				case 3: System.out.println("\n\nRedução Interpolação\n\n");
				tamanho_res = (tamanho_orig / 2);
				matriz_res = new int [tamanho_res][tamanho_res];
				m = 0;
				for (int i = 0; i < tamanho_res; i++, m+=2)
				{
					n = 0;
					for (int j = 0; j < tamanho_res; j++, n+=2)
					{
						matriz_res[i][j] = (matriz_orig[m][n] + matriz_orig[m][n + 1] + matriz_orig[m + 1][n] + matriz_orig[m + 1][n + 1])/4;
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
				
				case 4: System.out.println("\n\nAmpliação Interpolação\n\n");
				break;
				
				case 0: System.out.println("\n\nPrograma encerrado\n\n");
				break;
				
				default: System.out.println("Opção Inválida\n\n");
			}
			
		}
	}
	
}
