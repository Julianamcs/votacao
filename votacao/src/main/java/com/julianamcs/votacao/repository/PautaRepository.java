package com.julianamcs.votacao.repository;

import com.julianamcs.votacao.model.Pauta;
import com.julianamcs.votacao.repository.entity.PautaEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PautaRepository extends JpaRepository<PautaEntity, Long>{

	Pauta save(Pauta pauta);
}
