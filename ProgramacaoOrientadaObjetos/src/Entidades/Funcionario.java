package Entidades;

public class Funcionario {
	// atributos
	private Integer id;
	private String nome;
	private Double salario;

	// construtor padrão
	public Funcionario() {

	}

	// construtor com argumentos
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	// get e set

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

// método para aumento de salário
	public void aumentoSalarial(double percentual) {
		salario+= salario * percentual /100.0;

	}



// método toString
	
	public String toString() {
		return "ID:      " + String.format("%d\n", id)+
			   "Nome:    " + String.format("%s\n", nome)+
			   "Salário: " + String.format("%.2f%n", salario);
	}



}
