package br.com.alura.forum.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Perfil implements GrantedAuthority{
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	public Perfil() {
		
	}
		

	public Perfil(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomePerfil() {
		return nome;
	}

	public void setNomePerfil(String nome) {
		this.nome = nome;
	}

	@Override
	public String getAuthority() {		
		return nome;
	}
}
