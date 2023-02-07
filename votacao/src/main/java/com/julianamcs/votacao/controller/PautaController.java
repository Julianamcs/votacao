package com.julianamcs.votacao.controller;

import static com.julianamcs.votacao.controller.PautaController.PAUTA_URL;
import static org.springframework.http.HttpStatus.CREATED;

import com.julianamcs.votacao.model.Pauta;
import com.julianamcs.votacao.service.PautaService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@Tag(name = "Endpoint de pauta")
@RequestMapping(path = PAUTA_URL)
public class PautaController {
	
	public static final String PAUTA_URL = "/pauta";

   @Autowired
    private PautaService pautaService;


    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(CREATED)
    @Operation(summary = "Criar nova pauta", description = "Método responsável por criar nova pauta")
    @ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Created")})
    public ResponseEntity<Pauta> save(@RequestBody @Valid Pauta pautaRequest) {
    	Pauta pautaToSave = modelMapper.map(pautaRequest, Pauta.class);
    	Pauta pauta = pautaService.cadastrarPauta(pautaToSave);
        return new ResponseEntity<>(modelMapper.map(pauta, Pauta.class), CREATED);
    }


}
