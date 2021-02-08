package br.com.alura.forum.config.validation;

public class ErrorFormDTO {
	
	private String campo;
	private String mensagem;
	
	public ErrorFormDTO() {
		
	}
	
		
	public ErrorFormDTO(String campo, String mensagem) {
		super();
		this.campo = campo;
		this.mensagem = mensagem;
	}


	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	

}
