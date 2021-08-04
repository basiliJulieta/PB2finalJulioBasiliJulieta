package prueba;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Covid19;
import dominio.Hepatitis;
import dominio.NoCovidVaccineException;
import dominio.NoMoreVaccineException;
import dominio.Paciente;
import dominio.Rubeola;
import dominio.Vacuna;
import dominio.Vacunarte;

public class testVacunacion {

	@Test
	public void queSePuedaVacunarAlPaciente() throws NoMoreVaccineException {
		Vacunarte centro = new Vacunarte ("VacunARTE");
		Paciente paciente = new Paciente(0);
		Vacuna covid19 = new Covid19(1, "primera", "segunda");
		
		assertTrue(centro.vacunarAlPaciente(1, paciente));	
		
	}
	
	@Test
	public void queSeApliqueLaPrimerDosis() throws NoMoreVaccineException{
		Vacunarte centro = new Vacunarte ("VacunARTE");
		Paciente paciente = new Paciente(0);
		Covid19 covid19 = new Covid19(1, "primera", "segunda");
		centro.vacunarAlPaciente(1, paciente);
		assertTrue(centro.aplicarPrimeraDosisDeCovid(paciente));
		
	}
	
	@Test (expected = NoCovidVaccineException.class)
	public void queSeApliqueLaSegunda() throws dominio.NoCovidVaccineException{
		Vacunarte centro = new Vacunarte ("VacunARTE");
		Paciente paciente = new Paciente(0);
		centro.aplicarPrimeraDosisDeCovid(paciente);
		centro.aplicarSegundaDosisDeCovid(paciente);
		
	}
	
	@Test (expected = NoCovidVaccineException.class)
	public void queSeApliqueLaSegundaSinHaberseDadoLaPrimera() throws dominio.NoCovidVaccineException{
		Vacunarte centro = new Vacunarte ("VacunARTE");
		Paciente paciente = new Paciente(0);
		
		centro.aplicarSegundaDosisDeCovid(paciente);
		
	}
	
	@Test (expected = NoMoreVaccineException.class)
	public void queNoSePuedanAplicarMasDeDosVacunas() throws NoMoreVaccineException{
		
		Vacunarte centro = new Vacunarte ("VacunARTE");
		Paciente paciente = new Paciente(0);
		Vacuna covid19 = new Covid19(1, "primera", "segunda");
		Vacuna rubeola= new Rubeola(2);
		Vacuna hepatitis = new Hepatitis(3);
		centro.vacunarAlPaciente(1, paciente);
		centro.vacunarAlPaciente(2, paciente);
		centro.vacunarAlPaciente(3, paciente);
		
		assertFalse(centro.vacunarAlPaciente(3, paciente));
		
	
	}
	
	
	
	
	
	//dos dosis de covid vacuna lista
	//una sola de hepatitis
	
}
