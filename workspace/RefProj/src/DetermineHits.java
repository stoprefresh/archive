


import java.io.*;
import java.util.*;

public class DetermineHits {

	public static void main(String[] args) {
		String fileName = "access_log";
		DetermineHits dh = new DetermineHits();
		
		Map<String, Integer> hitMap = dh.whoHit( fileName );
		
		dh.printIt( hitMap );
		System.out.println();
		
		List<String> keys = dh.sortIt( hitMap );
		dh.printIt( keys, hitMap );
	}
	
	public Map<String, Integer> whoHit( String fn )
	{
		Map<String, Integer> hitMap = new HashMap<>();
		try(BufferedReader br = new BufferedReader(new FileReader(fn)))
		{
			String line;
			while ((line = br.readLine()) != null) {
				String[] token = line.split("\\s");
				
				// evaluate the map, and see if the IP already exists
				//    if exists, bump the count
				//    ow, create a new entry, with count of 1
				if (hitMap.containsKey(token[0])) {
					Integer count = hitMap.get(token[0]) + 1;
					hitMap.put(token[0], count);
				}
				else {
					hitMap.put(token[0], 1);
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return hitMap;
	}
	
	public void printIt(Map<String, Integer> hitMap) {
		Set<String> keys = hitMap.keySet();
		
		for (String key : keys) {
			System.out.println("IP: " + key + " hits: " + hitMap.get(key));
			
		}
	}
	// sorted map print
	public void printIt(List<String> keys, Map<String, Integer> hitMap) {		
		for (String key : keys) {
			System.out.println("IP: " + key + " hits: " + hitMap.get(key));
			
		}
	}

	// SD21:
	public List<String> sortIt(Map<String, Integer> hits){
		Set<String> keys = hits.keySet();
		List<String> keyList = new ArrayList<>(keys);
		
		keyList.sort(new CountComparator(hits));
		return keyList;
	}
}

class CountComparator implements Comparator<String> {
	private Map<String,Integer> ips;
	
	public CountComparator(Map<String, Integer> ip ) {
		this.ips = ip;
	}
	
	@Override
	public int compare(String o1, String o2) {
		String ip1 = o1;
		String ip2 = o2;
		
		return ips.get(ip1) > ips.get(ip2) ? 1 : ips.get(ip1) < ips.get(ip2) ? -1 : 0;
	}
}
