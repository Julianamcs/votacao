package com.julianamcs.votacao.model;

import java.time.LocalDateTime;

public class Pauta {

	private String tema;
	private String descricao;
	private LocalDateTime data;
	private Sessao sessao;
	
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getData() {
		return data;
		
	}
	public void setData(LocalDateTime data) {
		this.data = data;
		
	}
	public Sessao getSessao() {
		return sessao;
	}
	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}
}
