package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;

public class TopicoDTO {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	
	
	public TopicoDTO(Topico entity) {
		this.id = entity.getId();
		this.titulo = entity.getTitulo();
		this.mensagem = entity.getMensagem();
		this.dataCriacao = entity.getDataCriacao();
	}
	
	public static List<TopicoDTO> converter(List<Topico> topicos){
		return topicos.stream().map(TopicoDTO::new).collect(Collectors.toList());
	}


	public Long getId() {
		return id;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getMensagem() {
		return mensagem;
	}


	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

}
