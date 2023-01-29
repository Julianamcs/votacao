package com.julianamcs.votacao.model;

public enum Voto {
	
	SIM("Sim"),
	NAO("Não");
	
	private String descricao;

	Voto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
