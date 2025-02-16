package day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CityStateMap {
	Map<String,String> mp=new HashMap<>();
	public void addPair(String city,String state) {
		mp.put(city, state);
	}
	public String getCity(String city) {
		return mp.get(city);
	}
	public Set<String> getAllCities() {
        return mp.keySet(); 
    }
    public Set<String> getAllStates() {
        return new HashSet<>(mp.values()); 
    }
    public void delCity(String state) {
    	mp.remove(state);
    }
    public void reader() throws IOException {
    	FileReader f1=new FileReader("C:\\Users\\KrishnakaushalDodda\\Downloads\\citystate.txt");
    	try (BufferedReader b = new BufferedReader(f1)) {
			String line=null;
			while((line=b.readLine())!=null) {
				String[] cityMap = line.split(",");
			    if (cityMap.length == 2) {
			        String city = cityMap[0].trim();
			        String state = cityMap[1].trim();
			        addPair(city, state);
			    }
			}
		}
    }
}
