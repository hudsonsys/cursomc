package com.ideiasystem.cursomc.domain;

import java.io.Serializable;

public class Categoria implements Serializable{ //Obrigatorio da linguagem JAVA para poder trafegar os dados na rede
	
	
	private static final long serialVersionUID = 1L; //Controle de Versao
	
	private Integer id;
	private String nome;
	
	public Categoria() {
		
	}

	public Categoria(Integer id, String nome) { //gerado pelo contrutor do eclipse
		super();
		this.id = id;
		this.nome = nome;
	}
	
	//Gerado os Get e Set pelo Eclipse automatico

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//HasCode e usado para comparar os objetos

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	

}
