package dominio;

import java.util.Comparator;

public class PorDni implements Comparator<Paciente>{
	
	public int compare(Paciente paciente1, Paciente paciente2) {
		// TODO Auto-generated method stub
		return paciente1.getDni().compareTo(paciente2.getDni());
	}

}
