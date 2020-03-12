package Modulo_OO;

public class Produto {
	
    public String nome;
    public double valor;
    public int qauntidade;
    
    
    public double totalValorEstoque() {
    	
    	return valor * qauntidade;
    	
    }
    
    
     public void adicionaProduto(int qtdd ) {
    	 
    	 this.qauntidade += qtdd;
    	 
     }
     public void deletaProduto(int qtdd ) {
    	 
    	 this.qauntidade -= qtdd;
    	 
     }
     
     public String toString() {
    	 return nome
    			+", $ "
    			+ String.format("%.2f", valor)
    			+", "
    			+qauntidade
    			+"Quantidade, Total: $ "
    			+String.format("%.2f", totalValorEstoque());
    	 
    	 
     }

}
