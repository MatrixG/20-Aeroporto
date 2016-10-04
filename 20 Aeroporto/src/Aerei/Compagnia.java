package Aerei;

import java.util.List;


public class Compagnia {

	public Compagnia(String nome, AeroportiMondo am){
	}
	
	public void addAereo(String cod, int pass) throws InvalidCode {
	}
	
	public List<String> getAerei(){
		return null;
	}
	
	public void addVolo(String cod, String aer, String part, String arr, String giorno) throws InvalidCode {
	}
	
	public void cancelVolo(String cod) throws InvalidCode {
	}
	
	public List<Volo> getVoli(){
		return null;
	}
	
	public boolean prenota(int num, String cod) throws InvalidCode {
		return true;
	}
	
	public int postiLiberi(String cod) throws InvalidCode {
		return 0;
	}
	
	public void partitoVolo(String cod, int ritardo) throws InvalidCode {
	}
	
	public void arrivatoVolo(String cod, int ritardo) throws InvalidCode {
	}
		
	public List<String> ritardiPartenza() {
		return null;
	}
	
	public List<String> ritardiArrivo() {
		return null;
	}
	
	public List<String> voliCritici() {
		return null;
	}
}
