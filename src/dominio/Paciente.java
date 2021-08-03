package dominio;

public class Paciente {
	
	
	private Integer vacunasDadas;
	
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
		result = prime * result
				+ ((vacunasDadas == null) ? 0 : vacunasDadas.hashCode());
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
		if (vacunasDadas == null) {
			if (other.vacunasDadas != null)
				return false;
		} else if (!vacunasDadas.equals(other.vacunasDadas))
			return false;
		return true;
	}
	
	
	
	
	

}
