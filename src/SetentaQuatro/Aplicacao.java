package SetentaQuatro;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com dados do produto: ");
		System.out.println("Name: ");
		String nome = sc.nextLine();
		System.out.println("Preço: "); 
		double valor = sc.nextDouble();
		System.out.println("Quantidade: ");
		int quantidade = sc.nextInt();
		
		Produto pd = new Produto(nome, valor, quantidade);
		
		System.out.println();
		System.out.println("Dados do Produto: " + pd);
		
		System.out.println("Entre com o numero de produtos para adicionar no estoque: ");
		quantidade = sc.nextInt();
		pd.adicionaProduto(quantidade);
	
		
		System.out.println();
		System.out.println("Atualização dos dados:  " + pd);
		
		
		System.out.println();
		System.out.print("Entre com o numero de produtos que deseja remover no estoque: ");
		quantidade = sc.nextInt();
		pd.deletaProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualizaçao dados: " + pd);
		
		
		sc.close();
		
	}

}
