package Lesson649;//427

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapSample {
	public static void main(String args[]) {

		TreeMap<String,String> tm = new TreeMap<String,String>();

        tm.put("D","DDD");
        tm.put("A","AAA");
        tm.put("C","CCC");
        tm.put("E","EEE");
        tm.put("D","ddd");

        Iterator<String> it = tm.descendingKeySet().iterator();
        while(it.hasNext()) {
        	String key = it.next();
        	System.out.println(key + "/" + tm.get(key));
        }

	}

}
