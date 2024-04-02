package br.com.senaisp.bauru.richard.classes;

public class ProdutoSimples {
	private int id;
	private String descricao;
	private int saldo;
	private double custo;
	//Constructor
	public ProdutoSimples() {
		id = 0;
		saldo = 0;
		custo = 0;
	}
	//Gettes e setters
	public int getId() {
		return id;
	}
	public void setId(int id) throws Exception {
		if (id < 0) {
			throw new Exception("O id deve ser preenchido!");
		}
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
}
