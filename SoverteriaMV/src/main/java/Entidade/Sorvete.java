package Entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "SORVETE")
public class Sorvete {

	@Id
	@Column(name="NOME", nullable = false)
	private String nome;

	@Column(name="FABRICANTE", nullable = false)
	private String fabricante;

	@Column(name="INGREDIENTE", nullable = false)
	private String ingrediente;

	@Column(name="STATUS", nullable = false)
	private String status;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
		
}
