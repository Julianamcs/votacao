package com.julianamcs.votacao.service;

import com.julianamcs.votacao.model.Pauta;
import com.julianamcs.votacao.repository.PautaRepository;

import org.springframework.stereotype.Service;

@Service
public class PautaService {

	private final PautaRepository pautaRepository;

    public PautaService(PautaRepository pautaRepository) {
    	
        this.pautaRepository = pautaRepository;
    }
    
	public Pauta cadastrarPauta(Pauta pauta) {
		return pautaRepository.save(pauta);
	}
	
	public void abrirSessao() {
		
	}
	
	public void receberVotos() {
		
	}
	
	public void contabilizarVotos() {
		
	}
}
