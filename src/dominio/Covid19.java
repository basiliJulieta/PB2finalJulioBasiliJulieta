package dominio;

public class Covid19 extends Vacuna{
	
	public Integer codigo;
	public String primeraDosis;
	public String segundaDosis;
	public Boolean vacunaDada;
	
	public Covid19(Integer codigo, String primeraDosis, String segundaDosis){
		super(codigo);
		this.primeraDosis= primeraDosis;
		this.segundaDosis= segundaDosis;
	}

	@Override
	public Boolean vacunaDada() {
		// TODO Auto-generated method stub
		return this.vacunaDada;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getPrimeraDosis() {
		return primeraDosis;
	}

	public void setPrimeraDosis(String primeraDosis) {
		this.primeraDosis = primeraDosis;
	}

	public String getSegundaDosis() {
		return segundaDosis;
	}

	public void setSegundaDosis(String segundaDosis) {
		this.segundaDosis = segundaDosis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Covid19 other = (Covid19) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	

}
