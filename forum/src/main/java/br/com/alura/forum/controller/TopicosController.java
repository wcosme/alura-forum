package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDTO;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository repository;
	
	@RequestMapping("/topicos")
	public List<TopicoDTO> lista(String nomeCurso){
		
		List<Topico> topicos = null;
		
		if(nomeCurso == null) {
			topicos = repository.findAll();
		}else {
			topicos = repository.findByCursoNome(nomeCurso);
		}		
		
		return TopicoDTO.converter(topicos);
	}

}
