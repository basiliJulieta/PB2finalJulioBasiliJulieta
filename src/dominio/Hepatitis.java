package dominio;

public class Hepatitis extends Vacuna {
	
	public Boolean vacunaDada;

	public Hepatitis(Integer codigo) {
		super(codigo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean vacunaDada() {
		// TODO Auto-generated method stub
		return this.vacunaDada;
	}

}
