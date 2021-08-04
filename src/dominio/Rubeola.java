package dominio;

public class Rubeola extends Vacuna {
	
	private Integer codigo;
	private Boolean vacunaDada;

	public Rubeola(Integer codigo) {
		super(codigo);
		// TODO Auto-generated constructor stub
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
	
	
}
