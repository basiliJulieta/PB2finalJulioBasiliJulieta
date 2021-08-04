package dominio;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
	
	
	private Integer vacunasDadas;
	private Integer dni;
	
	public Paciente(Integer vacunasDadas){
		this.vacunasDadas= vacunasDadas;
	}
	
	

	public Integer getVacunasDadas() {
		return vacunasDadas;
	}

	public void setVacunasDadas(Integer vacunasDadas) {
		this.vacunasDadas = vacunasDadas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		Paciente other = (Paciente) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}



	public Integer getDni() {
		// TODO Auto-generated method stub
		return this.dni;
	}



	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	
	
	
	
	
	

}
