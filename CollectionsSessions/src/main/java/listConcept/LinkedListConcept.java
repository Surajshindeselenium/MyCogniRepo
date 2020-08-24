package listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Suraj");
		ll.add("Tom");
		ll.add("Peter");
		ll.add("Jonh");
		ll.add("Chis");
		System.out.println(ll.contains("Suraj"));
		//printing all values of linked list
		System.out.println(ll);
		
		//addFirst();----to add value to first position
		ll.addFirst("Martine");
		
		//addLast();----to add value to last position
		ll.addLast("Mathew");
		System.out.println(ll);
		
		//get();
		System.out.println(ll.get(1));
		
		//set();---we can add value on particular index
		ll.set(1, "Rahul");
		
		System.out.println(ll);
		
		//removeFirst(); and removeLast();
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
		
		//remove(); ---to remove from specific index 
		
		ll.remove(1);
		
		System.out.println(ll);
		
		//how to print all values from linked list 
		//1. for loop
		System.out.println("Printing all values using for loop");
		for(int i=0; i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("Printing all values using advanced for loop");
		//advanced for loop
		for(String str:ll) {
			System.out.println(str);
		}
		
		System.out.println("Printing all values using iterator");
		
		Iterator<String> it =ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Printing all values using while loop");
		int i =0;
		while(ll.size()>i) {
			
			System.out.println(ll.get(i));
			i++;
		}
		
	}

}
