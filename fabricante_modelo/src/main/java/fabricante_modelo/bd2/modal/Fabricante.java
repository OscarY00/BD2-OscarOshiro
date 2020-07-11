package fabricante_modelo.bd2.modal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Fabricante")
public class Fabricante implements Serializable{

	@Id
	@GeneratedValue
	@Column(name="cod")
	private Integer cod;
	
	private String nome;
	private String cidade;
	private String pais;
	private String tipo;
	
	
	@Override
	public String toString() {
		return "Fabricante [cod="+cod+",nome="+nome+"]";
	}

	public Fabricante() {
		
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
