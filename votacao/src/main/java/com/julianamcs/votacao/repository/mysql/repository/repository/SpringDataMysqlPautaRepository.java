package com.julianamcs.votacao.repository.mysql.repository.repository;

import com.julianamcs.votacao.repository.mysql.repository.entity.PautaEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataMysqlPautaRepository extends JpaRepository<PautaEntity, Long> {

}
