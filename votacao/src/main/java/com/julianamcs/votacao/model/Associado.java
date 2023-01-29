package com.julianamcs.votacao.model;

public class Associado {

	private String nome;
	private String cpf;
	private Assembleia assembleia;
	private Voto voto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Assembleia getAssembleia() {
		return assembleia;
	}
	public void setAssembleia(Assembleia assembleia) {
		this.assembleia = assembleia;
	}
	public Voto getVoto() {
		return voto;
	}
	public void setVoto(Voto voto) {
		this.voto = voto;
	}
	
}
