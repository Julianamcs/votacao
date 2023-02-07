package com.julianamcs.votacao.model;

import java.time.LocalTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Sessao {
	
	public LocalTime tempo = LocalTime.of(0, 1);

}
