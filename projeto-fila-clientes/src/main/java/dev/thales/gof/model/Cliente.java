package dev.thales.gof.model;


@jakarta.persistence.Entity
public class Cliente {

	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
	private Long id;
	private String nome;
	private int posFila;

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

	public int getPosFila() {
		return posFila;
	}

	public void setPosFila(int posFila) {
		this.posFila = posFila;
	}



}
