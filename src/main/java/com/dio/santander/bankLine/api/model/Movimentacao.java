package com.dio.santander.bankLine.api.model;

import java.time.LocalDateTime;

public class Movimentacao {
	
	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	private LocalDateTime dataHora;
	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	
	private String descricao;
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	private Double valor;
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	private MovimentacaoTipo tipo;
	public MovimentacaoTipo getTipo() {
		return tipo;
	}

	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
}
