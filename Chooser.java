package Cricket;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser<T> {
	private final List<T> choiceList;
	
	public Chooser(List<String> list) {
		
	choiceList = (List<T>) new ArrayList<String>(list);
	
	}
	public T choose() {
		
	Random rnd = ThreadLocalRandom.current();
	
	return choiceList.get(rnd.nextInt(choiceList.size()));
	
	}

}
