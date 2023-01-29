package com.julianamcs.votacao.repository.mysql.repository.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.julianamcs.votacao.model.Sessao;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "pauta")
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
