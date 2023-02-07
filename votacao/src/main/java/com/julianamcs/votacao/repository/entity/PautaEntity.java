package com.julianamcs.votacao.repository.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "pauta")
@Entity
public class PautaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tema", unique = true)
    private String tema;
    
    @Column(name = "descricao", unique = true)
	private String descricao;
    
    @Column(name = "data", unique = true)
	private LocalDateTime data;
    
    @ManyToOne(fetch = FetchType.EAGER)
	private SessaoEntity sessao;

}
