package model_tier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prodotto {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private double prezzo;

	public Prodotto() {

	}

	public Prodotto(Long id, String nome, double prezzo) {
		super();
		this.id = id;
		this.nome = nome;
		this.prezzo = prezzo;
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

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

}
