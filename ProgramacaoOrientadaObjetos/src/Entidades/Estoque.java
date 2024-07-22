package Entidades;

public class Estoque {
   
	// atributos
   private String referencia;
   private String lote;
   private int quantidade;
   private char zona;
   private int alveolo;
   // construtor
public Estoque(String referencia, String lote, char zona, int alveolo) {
	this.referencia = referencia;
	this.lote = lote;
	this.zona = zona;
	this.alveolo = alveolo;
}

// métodos get e set
public String getReferencia() {
	return referencia;
}
public void setReferencia(String referencia) {
	this.referencia = referencia;
}
public String getLote() {
	return lote;
}
public void setLote(String lote) {
	this.lote = lote;
}
public char getZona() {
	return zona;
}
public void setZona(char zona) {
	this.zona = zona;
}
public int getAlveolo() {
	return alveolo;
}
public void setAlveolo(int alveolo) {
	this.alveolo = alveolo;
}
public int getQuantidade() {
	return quantidade;
}
   
// método de entrada de estoque

public void entredaEstoque(int quantidade) {
	this.quantidade+= quantidade;
	
}

// método de saída de estoque

public void saidaEstoque(int quantidade) {
	this.quantidade-= quantidade;
}


// método toString
public String toString() {
	return "Referência: "+String.format("%s\n", referencia)+
		   "Lote: "+String.format("%s\n", lote)+
		   "Zona: "+String.format("%c\n", zona)+
		   "Alvéolo: "+String.format("%d\n", alveolo)+
		   "Quantidade: "+String.format("%d\n", quantidade);
		   
}

}
