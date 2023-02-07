package com.julianamcs.votacao.repository.entity;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
