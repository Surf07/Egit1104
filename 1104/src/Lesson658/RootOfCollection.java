package Lesson658;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class RootOfCollection {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<String>();
		List<String> arrayList = new ArrayList<String>();
		Queue<String> priorityQueue = new PriorityQueue<String>();
		Deque<String> arrayDeque = new ArrayDeque<String>();

		add(hashSet);
		add(arrayList);
		add(priorityQueue);
		add(arrayDeque);

		for(String string : hashSet) {
			System.out.println("[10]" + (String)string);
		}
		for(String string : arrayList) {
			System.out.println("[12]" + (String)string);
		}
		for(String string : priorityQueue) {
			System.out.println("[12]" + (String)string);
	    }
		for(String string : arrayDeque) {
			System.out.println("[12]" + (String)string);
		}
}
	private static void add(Collection collection) {
		collection.add("Kazu");
	}
}