package ecommerce;

import java.util.Scanner;

import ecommerce.acesso.Materiais;
import ecommerce.controller.CompraMateriais;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int opcao, opcaoCliente, opcaoAdm, codigoProd, qtd;
		CompraMateriais listaProdutos = new CompraMateriais();
		CompraMateriais carrinho = new CompraMateriais();
		Materiais mat1 = new Materiais("Cenoura", listaProdutos.gerarCodigo(), 20.00f);
		listaProdutos.cadastrar(mat1);
		Materiais mat2 = new Materiais("Beterraba", listaProdutos.gerarCodigo(), 40.00f);
		listaProdutos.cadastrar(mat2);
		Materiais mat3 = new Materiais("Tomate", listaProdutos.gerarCodigo(), 13.00f);
		listaProdutos.cadastrar(mat3);
		Materiais mat4 = new Materiais("Abobrinha", listaProdutos.gerarCodigo(), 6.00f);
		listaProdutos.cadastrar(mat4);


		

		while (true) {

			System.out.println("\n*****************************************************");
			System.out.println("\n\t\tBem vindo a Loja de Testes");
			System.out.println("\n*****************************************************");
			System.out.println("\n\t\tPor gentileza, entre com o tipo de acesso que deseja");
			System.out.println("\t1 - Cliente");
			System.out.println("\t2 - Administrador");
			System.out.println("\t9 - Sair");
			System.out.println("\n*****************************************************");
			System.out.println("\nEntre com a opção desejada: \n");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nObrigado por comparecer!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				while (true) {

					System.out.println("\n*****************************************************");
					System.out.println("\n\t\tBem vindo prezado Cliente!");
					System.out.println("\n*****************************************************");
					System.out.println("\n\t\tPor gentileza, entre com a ação que deseja realizar");
					System.out.println("\t1 - Criar Conta");
					System.out.println("\t2 - Listar materiais disponíveis");
					System.out.println("\t3 - Adicionar Material ao Carrinho");
					System.out.println("\t4 - Retirar Material do Carrinho");
					System.out.println("\t5 - Visualizar o Carrinho");
					System.out.println("\t6 - Fechar o Carrinho e finalizar compras");
					System.out.println("\n*****************************************************");
					System.out.println("\nEntre com a opção desejada: \n");

					opcaoCliente = leia.nextInt();

					if (opcaoCliente == 6) {
						System.out.println("\nObrigado por comprar conosco!");
						sobre();
						leia.close();
						System.exit(0);
					}
					switch (opcaoCliente) {
					case 1:
						System.out.println("Criar Conta\n\n");

						break;
					case 2:
						System.out.println("Listar materiais disponíveis\n\n");
						listaProdutos.listarTodas();

						break;
					case 3:
						System.out.println("Adicionar Material ao Carrinho\n\n");
						System.out.println("\nPor favor informe o código de qual material deseja adicionar: ");
						listaProdutos.visualizacaosimples();
						codigoProd = leia.nextInt();
						
						System.out.println("Agora informe a quantidade que deseja");
						qtd = leia.nextInt();
						
						carrinho.cadastrar(listaProdutos.buscarNaCollection(codigoProd));
						carrinho.setQuantidade(qtd);;
						
						carrinho.visualizacaosimples();								

						break;
					case 4:
						System.out.println("Retirar Material do Carrinho\n\n");

						break;
					case 5:
						System.out.println("Visualizar o Carrinho\n\n");

						break;
					default:
						System.out.println("\nOpção Inválida!\n");
						break;
					}
				}
			case 2:
				System.out.println("entre com os dados da conta adminstradora: ");
				if (leia.nextInt() == 1) {

					while (true) {

						System.out.println("\n*****************************************************");
						System.out.println("\n\t\tBem vindo prezado Administrador!");
						System.out.println("\n*****************************************************");
						System.out.println("\n\t\tPor gentileza, entre com a ação que deseja realizar");
						System.out.println("\t1 - Listar Contas de clientes cadastradas");
						System.out.println("\t2 - Listar materiais disponíveis");
						System.out.println("\t3 - Cadastrar novo material para venda");
						System.out.println("\t4 - Atualizar Material para venda");
						System.out.println("\t5 - Retirar Material para venda");
						System.out.println("\t6 - Sair");
						System.out.println("\n*****************************************************");
						System.out.println("\nEntre com a opção desejada: \n");

						opcaoAdm = leia.nextInt();

						if (opcaoAdm == 6) {
							System.out.println(
									"\nSistema atualizado com sucesso! -  Seus clientes estão  com uma experiência de compra online conveniente e segura");
							sobre();
							leia.close();
							System.exit(0);
						}
						switch (opcaoAdm) {
						case 1:
							System.out.println("Criar Conta\n\n");

							break;
						case 2:
							System.out.println("Listar materiais disponíveis\n\n");

							break;
						case 3:
							System.out.println("Cadastrar novo material para venda\n\n");

							break;
						case 4:
							System.out.println("Atualizar Material para venda\n\n");

							break;
						case 5:
							System.out.println("VRetirar Material para venda\n\n");

							break;
						default:
							System.out.println("\nOpção Inválida!\n");
							break;
						}
					}
				}
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Matheus H. Alexandre Libanio");
		System.out.println("Matheus Henrique Alexandre Libanio - mlibanio97@gmail.com");
		System.out.println("Github - https://github.com/MatheusLib");
		System.out.println("*********************************************************");
	}
}
