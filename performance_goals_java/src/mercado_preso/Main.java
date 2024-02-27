package mercado_preso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcaoMenu;
		boolean validador = true;

		while (validador) {
           
			System.out.println("\n------------------------------------------------------------------");
			System.out.println("                                                                  ");
			System.out.println("        MERCADO PRESO     -    CONTROLE DE PRODUTOS               ");
			System.out.println("                                                                  ");
			System.out.println("------------------------------------------------------------------");
			System.out.println("                                                                  ");
			System.out.println("        1 - Cadastrar Produto                                     ");
			System.out.println("        2 - Busca por ID                                          ");
			System.out.println("        3 - Deletar Produto                                       ");
			System.out.println("        4 - Listar Produtos                                       ");
			System.out.println("        5 - Atualizar Repositório                                 ");
			System.out.println("        6 - Sair                                                  ");
			System.out.println("                                                                  ");
			System.out.println("------------------------------------------------------------------");
			System.out.println("                                                                  ");
			System.out.println("       Selecione a oção desejada:                                 ");
			System.out.println("                                                                  ");
			System.out.println("------------------------------------------------------------------");

			opcaoMenu = sc.nextInt();

			switch (opcaoMenu) {
			case 1:
				System.out.println(" CADASTRAR PRODUTOS ");

				break;
			case 2:
				System.out.println(" BUSCAR POR ID ");

				break;
			case 3:
				System.out.println(" DELETAR PRODUTO ");

				break;
			case 4:
				System.out.println(" LISTAR PRODUTO ");

				break;
			case 5:
				System.out.println(" ATUALIZAR REPOSITÓRIO ");

				break;
			case 6:
				System.out.println(" ATIVIDADE FINALIZADA!");
				sc.close();
				validador = false;
				break;
			default:
				System.out.println("        \nOpção Inválida!\n                                       ");
				break;
			}
		}

	}

} // TASK 1
