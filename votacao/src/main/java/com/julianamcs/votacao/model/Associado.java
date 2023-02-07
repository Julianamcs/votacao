package com.julianamcs.votacao.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Associado {

	@NotBlank(message = "Campo 'nome' não pode ser branco ou nulo")
	private String nome;
	
	@NotBlank(message = "Campo 'cpf' não pode ser branco ou nulo")
	private String cpf;
	
	private Assembleia assembleia;
	
	@NotBlank(message = "Campo 'voto' não pode ser branco ou nulo")
	private Voto voto;
	
}
