package com.julianamcs.votacao.service;

import java.time.LocalDateTime;

import com.julianamcs.votacao.model.Pauta;
import com.julianamcs.votacao.model.Sessao;
import com.julianamcs.votacao.repository.PautaRepository;

public class PautaService {

	private final PautaRepository pautaRepository;


    public PautaService(PautaRepository pautaRepository) {
    	
        this.pautaRepository = pautaRepository;
    }
    
	public void cadastrarPauta() {
		Sessao sessao = new Sessao();
    	sessao.setTempo(LocalDateTime.now().toLocalTime());
    	
    	Pauta pauta = new Pauta();
    	pauta.setData(LocalDateTime.now());
    	pauta.setDescricao("teste teste");
    	pauta.setSessao( sessao);
    	pauta.setTema("teste");
    	
		pautaRepository.save(pauta);
	}
	
	public void abrirSessao() {
		
	}
	
	public void receberVotos() {
		
	}
	
	public void contabilizarVotos() {
		
	}
}
