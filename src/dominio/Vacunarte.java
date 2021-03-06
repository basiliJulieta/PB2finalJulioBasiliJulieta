package dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Vacunarte {
	 
	private String nombre;
	private Set <Paciente> pacientes;
	private Map <Integer, Paciente> pacientesVacunados;
	private List <Paciente> pacientesVacunadosPorCovid;
	private PorDni ordenador = new PorDni();
	
	
	
	public Vacunarte (String nombre){
		this.nombre = nombre;
		this.pacientes = new HashSet<Paciente>();
		this.pacientesVacunados= new HashMap<Integer, Paciente>();
		this.pacientesVacunadosPorCovid = new ArrayList<Paciente>();
		
		
	}
	
	
	public Boolean aplicarPrimeraDosisDeCovid(Paciente paciente){
		return this.pacientesVacunadosPorCovid.add(paciente);
	}
	
	public void aplicarSegundaDosisDeCovid(Paciente paciente)throws NoCovidVaccineException{
		aplicarPrimeraDosisDeCovid(paciente);
		if(getPacientes(paciente)==null)
			
			throw new NoCovidVaccineException();
			
		
	}
	
	public Boolean vacunarAlPaciente(Integer codigoDeVacuna, Paciente paciente) throws NoMoreVaccineException{
		if(!pacientesVacunados.containsKey(codigoDeVacuna)|| !pacientesVacunados.containsValue(paciente)){
			pacientesVacunados.put(codigoDeVacuna, paciente);
			return true;
		}
		if(paciente.getVacunasDadas().equals(3))
			throw new NoMoreVaccineException();
		return false;
		
	}
	
	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Set<Paciente> getPacientes(Paciente paciente) {
		for (Paciente paciente1 : pacientes) {
			if(paciente1.getVacunasDadas()== 0);
			
		}
		return pacientes;
	}


	public void setPacientes(Set<Paciente> pacientes) {
		this.pacientes = pacientes;
	}


	public Map<Integer, Paciente> getPacientesVacunados() {
		return pacientesVacunados;
	}


	public void setPacientesVacunados(Map<Integer, Paciente> pacientesVacunados) {
		this.pacientesVacunados = pacientesVacunados;
	}


	public List<Paciente> getPacientesVacunadosPorCovid() {
		return pacientesVacunadosPorCovid;
	}


	public void setPacientesVacunadosPorCovid(
			List<Paciente> pacientesVacunadosPorCovid) {
		this.pacientesVacunadosPorCovid = pacientesVacunadosPorCovid;
	}
	
	
	

}
