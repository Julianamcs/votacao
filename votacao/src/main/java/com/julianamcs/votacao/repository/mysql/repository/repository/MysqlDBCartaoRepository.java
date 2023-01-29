package com.julianamcs.votacao.repository.mysql.repository.repository;

import com.julianamcs.votacao.model.Pauta;
import com.julianamcs.votacao.repository.PautaRepository;
import com.julianamcs.votacao.repository.mysql.repository.entity.PautaEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MysqlDBCartaoRepository implements PautaRepository {

    private final ModelMapper modelMapper;
    
    private final SpringDataMysqlPautaRepository pautaRepository;


    public MysqlDBCartaoRepository(SpringDataMysqlPautaRepository pautaRepository, ModelMapper modelMapper) {
    	this.pautaRepository = pautaRepository;
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
