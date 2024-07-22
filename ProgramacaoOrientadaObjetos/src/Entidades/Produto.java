package Entidades;

public class Produto {
	// atributos
	private String nome;
	private double preco;
	private int quantidade;
	private int codigo;

	// construtor
	public Produto(String nome, double preco, int codigo) {
		this.nome = nome;
		this.preco = preco;
		this.codigo=codigo;
	}

	
	// get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		
		this.codigo = codigo;
	}

  // método para inserir produto no estoque
	
	public void entradaProduto(int quantidade) {
		
		this.quantidade+=quantidade;
	}

	// método para sair com produto do estoque
	
		public void saidaProduto(int quantidade) {
			
			this.quantidade-=quantidade;
		}

  // método para calcular o valor total em estoque
		public double valorTotal() {
			return quantidade*preco;
			
		}
		
		
   public String toString() {
	   
	   return "\n\nCódigo:                 "+String.format("%d\n", codigo)
	   		+ "Descrição:              "+String.format("%s\n", nome)+
			  "Quantidade:             "+String.format("%d\n", quantidade)+
			  "Preço Unitário:         R$ "+String.format("%.2f\n", preco)+
			  "Valor total em Estoque: R$ "+String.format("%.2f\n\n", valorTotal());
   }

}
