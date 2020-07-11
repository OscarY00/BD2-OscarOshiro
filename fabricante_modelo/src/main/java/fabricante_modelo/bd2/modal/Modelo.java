package fabricante_modelo.bd2.modal;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "MODELO")
public class Modelo implements Serializable{

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;
	
	private String name;
	private String tipo;
	private String cor;
	private Date ano;
	
	public Modelo() {
		
	}
	
	@Override
	public String toString() {
		return "Molelo [name="+name+"]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public void setAno(java.util.Date date) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
