package prueba;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Covid19;
import dominio.NoCovidVaccineException;
import dominio.Paciente;
import dominio.Vacuna;
import dominio.Vacunarte;

public class testVacunacion {

	@Test
	public void queSePuedaVacunarAlPaciente() {
		Vacunarte centro = new Vacunarte ("VacunARTE");
		Paciente paciente = new Paciente(0);
		Vacuna covid19 = new Covid19(1, "primera", "segunda");
		
		assertTrue(centro.vacunarAlPaciente(1, paciente));	
		
	}
	
	@Test
	public void queSeApliqueLaPrimerDosis(){
		Vacunarte centro = new Vacunarte ("VacunARTE");
		Paciente paciente = new Paciente(0);
		Covid19 covid19 = new Covid19(1, "primera", "segunda");
		centro.vacunarAlPaciente(1, paciente);
		assertTrue(centro.aplicarPrimeraDosisDeCovid(paciente));
		
	}
	
	@Test (expected = NoCovidVaccineException.class)
	public void queSeApliqueLaSegunda() throws NoCovidVaccineException{
		Vacunarte centro = new Vacunarte ("VacunARTE");
		Paciente paciente = new Paciente(0);
		centro.aplicarPrimeraDosisDeCovid(paciente);
		centro.aplicarSegundaDosisDeCovid(paciente);
		
	}
	
	@Test (expected = NoCovidVaccineException.class)
	public void queSeApliqueLaSegundaSinHaberseDadoLaPrimera() throws NoCovidVaccineException{
		Vacunarte centro = new Vacunarte ("VacunARTE");
		Paciente paciente = new Paciente(0);
		
		centro.aplicarSegundaDosisDeCovid(paciente);
		
	}
	
	//dos dosis de covid vacuna lista
	//una sola de hepatitis
	
}
