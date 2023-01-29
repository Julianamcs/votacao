package com.julianamcs.votacao.model;

public class Assembleia {
	
	private String nome;
	private Pauta pauta;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pauta getPauta() {
		return pauta;
	}
	public void setPauta(Pauta pauta) {
		this.pauta = pauta;
	}
	public int getQuantidade_votos() {
		return quantidade_votos;
	}
	public void setQuantidade_votos(int quantidade_votos) {
		this.quantidade_votos = quantidade_votos;
	}
	private int quantidade_votos;
	

}
