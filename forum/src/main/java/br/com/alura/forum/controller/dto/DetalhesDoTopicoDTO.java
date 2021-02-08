package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.StatusTopico;
import br.com.alura.forum.modelo.Topico;

public class DetalhesDoTopicoDTO {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	private StatusTopico statusTopico;
	private List<RespostaDTO> respostas;
	
	public DetalhesDoTopicoDTO(Topico entity) {
		this.id = entity.getId();
		this.titulo = entity.getTitulo();
		this.mensagem = entity.getMensagem();
		this.dataCriacao = entity.getDataCriacao();
		this.nomeAutor = entity.getAutor().getNome();
		this.statusTopico = entity.getStatus();
		this.respostas = new ArrayList<>();
		this.respostas.addAll(entity.getRespostas().stream().map(RespostaDTO:: new).collect(Collectors.toList()));
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

	public String getNomeAutor() {
		return nomeAutor;
	}

	public StatusTopico getStatusTopico() {
		return statusTopico;
	}

	public List<RespostaDTO> getRespostas() {
		return respostas;
	}
	

}
