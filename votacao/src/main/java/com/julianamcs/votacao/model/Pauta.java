package com.julianamcs.votacao.model;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Pauta {

	@NotBlank(message = "Campo 'tema' não pode ser branco ou nulo")
	private String tema;
	
	@NotBlank(message = "Campo 'descricao' não pode ser branco ou nulo")
	private String descricao;
	
	@NotBlank(message = "Campo 'data' não pode ser branco ou nulo")
	private LocalDateTime data;
	
	@NotBlank(message = "Campo 'sessao' não pode ser branco ou nulo")
	private Sessao sessao;
	
}
