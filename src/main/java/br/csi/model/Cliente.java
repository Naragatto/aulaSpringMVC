package br.csi.model;

public class Cliente {

	private Long codigo;
	private String nome;
	private String ruaNumComp;
	private String bairro;
	private String cidade;
	
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRuaNumComp() {
		return ruaNumComp;
	}
	public void setRuaNumComp(String ruaNumComp) {
		this.ruaNumComp = ruaNumComp;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
}
