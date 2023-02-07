package com.julianamcs.votacao.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Assembleia {
	
	@NotBlank(message = "Campo 'nome' não pode ser branco ou nulo")
	private String nome;
	
	@NotBlank(message = "Campo 'pauta' não pode ser branco ou nulo")
	private Pauta pauta;
	
}
