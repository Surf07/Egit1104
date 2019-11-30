package Lesson696;//Derek Banas Java12


import java.util.Arrays;
import java.util.LinkedList;


public class LessonTwelve {
	public static void main(String[] args){

		LinkedList linkedListOne = new LinkedList();

		LinkedList<String> names = new LinkedList<String>();


		names.add("Ahmed Bennani");
		names.add("Ali Syed");
		names.addLast("Nathan Martin");
		names.addFirst("Joshua Smith");
		names.add(0,"Noah Peeters");
		names.add(2,"Paul Newman");

		names.remove(4);
		names.remove("Joshua Smith");


		for(String name:names)
		{
			System.out.println(name);
		}

        System.out.println("\nFirst Index:" + names.get(0));

        System.out.println("\nFirst Index:" + names.getFirst());

        System.out.println("\nLast Index:" + names.getLast());

        LinkedList<String> nameCopy = new LinkedList<String>(names);

        System.out.println("\nnameCopy:" + nameCopy);

        if(names.contains("Noah Peeters"))
        {
        	System.out.println("\nNoahs Here");
        }

        if(names.containsAll(nameCopy))
        {
        	System.out.println("\nCollections are the same");

        	System.out.println("\nindex of Ali is:" + names.indexOf("Ali Syed"));

        	System.out.println("List Empty:" +names.isEmpty());

        	System.out.println("How many values:"  + names.size());

        	System.out.println("Look without error:" + names.peek());

        	System.out.println("Remove first element:" + nameCopy.poll());

        	System.out.println("Remove last element:" + nameCopy.pollLast());

        	nameCopy.push("Nooh Peeters");

        	nameCopy.pop();

        	System.out.println("\nameCopy:" + nameCopy);

        	Object[] nameArray = new Object[4];

        	nameArray = names.toArray();

        	System.out.println(Arrays.deepToString(nameArray));

        	names.clear();

        }
	}
}
