package br.edu.utfpr.dv.sireata.model;

public class Comentario {
	private int idComentario;
	private Pauta pauta;
	private Usuario usuario;
	private SituacaoComentario situacao;
	private SituacaoComentario situacaoComentarios;
	private String comentarios;
	private String motivo;
	
	public Comentario(){
		this.setIdComentario(0);
		this.setPauta(new Pauta());
		this.setUsuario(new Usuario());
		this.setSituacao(ComentarioNaoAnalisado.getInstance());
		this.setSituacaoComentarios(ComentarioNaoAnalisado.getInstance());
		this.setComentarios("");
		this.setMotivo("");
	}
	
	public int getIdComentario() {
		return idComentario;
	}
	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}
	public Pauta getPauta() {
		return pauta;
	}
	public void setPauta(Pauta pauta) {
		this.pauta = pauta;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public SituacaoComentario getSituacao() {
		return situacao;
	}
	public void setSituacao(SituacaoComentario situacao) {
		this.situacao = situacao;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public SituacaoComentario getSituacaoComentarios() {
		return situacaoComentarios;
	}
	public void setSituacaoComentarios(SituacaoComentario situacaoComentarios) {
		this.situacaoComentarios = situacaoComentarios;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

}
