package SetentaQuatro;

public class Produto {

	private String nome;
	private double valor;
	private int quantidade;

	public Produto(String nome, double valor, int quantidade) {

		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;

	}

	public int getQuantidade() {
		return quantidade;

	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double totalValorEstoque() {

		return valor * quantidade;

	}

	public void adicionaProduto(int qtdd) {

		this.quantidade += qtdd;

	}

	public void deletaProduto(int qtdd) {

		this.quantidade -= qtdd;

	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", valor) + ", " + quantidade + "Quantidade, Total: $ "
				+ String.format("%.2f", totalValorEstoque());

	}

}
