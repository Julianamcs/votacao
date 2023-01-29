package com.julianamcs.votacao.model;

import java.time.LocalTime;

public class Sessao {
	
	public LocalTime tempo = LocalTime.of(0, 1);

	public LocalTime getTempo() {
		return tempo;
	}

	public void setTempo(LocalTime tempo) {
		this.tempo = tempo;
	}

}
