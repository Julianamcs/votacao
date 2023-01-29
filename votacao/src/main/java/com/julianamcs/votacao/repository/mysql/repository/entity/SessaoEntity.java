package com.julianamcs.votacao.repository.mysql.repository.entity;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "sessao")
public class SessaoEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	public LocalTime tempo;
	
	@OneToMany(
	        mappedBy = "sessao",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	    private List<PautaEntity> pautas = new ArrayList<>();
}
