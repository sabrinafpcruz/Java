package Metodos;

public class Carro {
private String cor;
private String modelo;
private double preco;

public Carro() {
	
}

public Carro(String modelo, double preco) {
	this.cor="Preta";
	this.modelo=modelo;
	this.preco=preco;
	
}
public Carro(String cor, String modelo, double preco) {
	this.cor=cor;
	this.modelo=modelo;
	this.preco=preco;
	
}
}
