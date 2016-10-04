package Aerei;

import java.util.Map;
import java.util.TreeMap;

public class AeroportiMondo {
	
	private Map<String, Aeroporto> aeroporti = new TreeMap<String, Aeroporto>();

	
	public void addAeroporto(Aeroporto arpt) throws InvalidCode{
		
		if (!aeroporti.containsKey(arpt.getCode())){
			aeroporti.put(arpt.getCode(), arpt);
			return;
		}
	
		throw new InvalidCode();
	}
	
	public  void removeAeroporto(String cod) {
		
		aeroporti.remove(cod);
	}
	
	public  Aeroporto getAeroporto(String cod) {
		
		return aeroporti.get(cod);
	}
}
