package Modulo_OO;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto pd = new Produto();
		System.out.println("Entre com dados do produto: ");
		System.out.println("Name: ");
		pd.nome = sc.nextLine();
		System.out.println("Pre�o: "); 
		pd.valor = sc.nextDouble();
		System.out.println("Quantidade: ");
		pd.qauntidade = sc.nextInt();
		
		System.out.println("Produtos: " + pd);
		
		System.out.println("Entre com o numero de produtos para adicionar no estoque: ");
		int NovaQuantidade = sc.nextInt();
		pd.adicionaProduto(NovaQuantidade);
	
		
		System.out.println();
		System.out.println("Atualiza��o dos dados:  " + pd);
		
		
		System.out.println();
		System.out.println("Entre com o numero de produtos que deseja remover no estoque: ");
		NovaQuantidade = sc.nextInt();
		pd.deletaProduto(NovaQuantidade);
		
		
		
		sc.close();
		
	}

}
