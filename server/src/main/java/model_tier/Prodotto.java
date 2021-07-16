package model_tier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prodotto {

	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String nome;


	public Prodotto() {

	}

	public Prodotto(Long id, String nome) {
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
