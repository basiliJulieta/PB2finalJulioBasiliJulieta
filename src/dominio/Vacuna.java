package dominio;

public abstract class Vacuna {
	
	public Integer codigo;
	
	public Vacuna (Integer codigo){
		this.codigo = codigo;
	}
	
	public abstract Boolean vacunaDada();
	
	

}
