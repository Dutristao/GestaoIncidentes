package incidentes.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="db_atendente")
public class Atendente implements Serializable {
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="atendente")
	private String nome;
	
	@Column(name="grupo")
	private int grupo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getGrupo() {
		return grupo;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}
}
