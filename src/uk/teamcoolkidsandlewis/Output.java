package uk.teamcoolkidsandlewis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Output {

	public Output(HashMap<Cache, Video> results){
		System.out.println(results.size());
		Iterator<Entry<Cache, Video>> it = results.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Cache, Video> pair = (Map.Entry<Cache, Video>) it.next();
			System.out.println(pair.getKey().getId() + " " + pair.getValue().getId());
			it.remove(); // avoids a ConcurrentModificationException
		}
	}

}
