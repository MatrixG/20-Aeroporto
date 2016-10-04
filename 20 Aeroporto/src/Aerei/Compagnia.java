package Aerei;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Compagnia {
	
	private String nome;
	private AeroportiMondo aeroportiCompagnia;
	private Map<String, Integer> aerei = new TreeMap<String, Integer>();

	public Compagnia(String nome, AeroportiMondo am){
	
		this.nome = nome;
		aeroportiCompagnia = am;
	}
	
	public void addAereo(String cod, int pass) throws InvalidCode {
		
		if (!aerei.containsKey(cod)){
			aerei.put(cod, pass);
			return;
		}
		throw new InvalidCode();
	}
	
	public List<String> getAerei(){
		
		return new ArrayList<String>(aerei.keySet());
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
