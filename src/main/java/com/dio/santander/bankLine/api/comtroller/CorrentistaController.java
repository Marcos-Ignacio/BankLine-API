package com.dio.santander.bankLine.api.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankLine.api.dto.NovoCorrentista;
import com.dio.santander.bankLine.api.model.Correntista;
import com.dio.santander.bankLine.api.repository.CorrentistaRepository;
import com.dio.santander.bankLine.api.service.CorrentistaService;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository repository;
	
	@Autowired
	private CorrentistaService service;
	
	@GetMapping
	public List<Correntista> FindAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void Save (@RequestBody NovoCorrentista correntista) {
		service.save(correntista);
	}
}
