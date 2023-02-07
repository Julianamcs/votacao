package com.julianamcs.votacao.repository.impl;

import com.julianamcs.votacao.model.Pauta;
import com.julianamcs.votacao.repository.PautaRepository;
import com.julianamcs.votacao.repository.entity.PautaEntity;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public abstract class VotacaoRepositoryImpl implements PautaRepository {

    private final ModelMapper modelMapper;
    
    @Autowired
    private PautaRepository pautaRepository;


    public VotacaoRepositoryImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

	@Override
	@Transactional
	public Pauta save(Pauta pauta) {
		PautaEntity entity = modelMapper.map(pauta, PautaEntity.class);
		PautaEntity entitySaved = pautaRepository.save(entity);
        return modelMapper.map(entitySaved, Pauta.class);
	}

}
