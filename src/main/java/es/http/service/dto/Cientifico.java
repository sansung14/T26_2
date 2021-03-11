package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="cientifico")//en caso que la tabala sea diferente
public class Cientifico {

	//Atributos de entidad estudiante
	@Id
	@Column(name = "dni")//no hace falta si se llama igual
	private String dni;
	@Column(name = "nomapels")//no hace falta si se llama igual
	private String nomapels;

	
	@OneToMany
    @JoinColumn(name="id")
    private List<Asignado> asignado;
	
	//Constructores
	
	public Cientifico() {
	
	}

	public Cientifico(String dni, String nomapels, List<Asignado> asignado) {
		super();
		this.dni = dni;
		this.nomapels = nomapels;
		this.asignado = asignado;
	}


	/**
	 * @return the suministra
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado")
	public List<Asignado> getAsignado() {
		return asignado;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNomapels() {
		return nomapels;
	}



	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}



	public void setAsignado(List<Asignado> asignado) {
		this.asignado = asignado;
	}









	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
