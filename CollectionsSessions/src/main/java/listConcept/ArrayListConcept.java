package listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//static array ---size is fixed 
		int a[] = new int[3];
		
		//Dynamic Array ---No limitation on size 
		//1. Can contain duplicate values/elements
		//2. maintain insertion order
		//3. Synchronized
		//4. allows random access to fetch the element because it stores the values on the basis of index
		
		//Non-generic ArrayList - here we didn't mention data type hence it will store all type of data types values
		ArrayList obj = new ArrayList();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		
		System.out.println("Size of array"+" "+obj.size());//Size of array list
		System.out.println("*************");
		
		obj.add(10);
		obj.add(90);
		//This ArrayList will store all data types value
		obj.add("Suraj");
		obj.add("Shinde");
		obj.add('M');
		obj.add(12.44);
		
		
		
		System.out.println("Value stored at index 3 is"+" "+obj.get(3));//random access to fetch a value 
		System.out.println("*************");
		
		for(int i=0; i<obj.size();i++) {//printing all values of array list
			System.out.println(obj.get(i));
		}
		
		System.out.println("Generic ArrayList");
		//generic ArrayList - Here we have mentioned Integer hence this ArrayList will store only Integer values
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(500);
		//ar.add("Suraj");-"The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)"
		
		for(int j=0; j<ar.size();j++) {
			System.out.println(ar.get(j));
		}
		
		//Employee class objects
		Employee e1 = new Employee("Suraj",30,"QA");
		Employee e2 = new Employee("Peter",38,"IT");
		Employee e3 = new Employee("Tom",35,"Comp");
		
		//Creating ArrayList to store object of Employee type
		ArrayList<Employee> ar1 = new ArrayList<Employee>();
		ar1.add(e1);
		ar1.add(e2);
		ar1.add(e3);
		
		//Iterator to traverse values
		
		Iterator<Employee> it = ar1.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		//addAll();
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("java");
		ar3.add(".net");
		ar3.add("python");
		
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Physics");
		ar4.add("chemistry");
		ar4.add("Maths");
		System.out.println(ar3.size());
		
		//this will add ar4 ArrayList into ar3
		ar3.addAll(ar4);
		System.out.println(ar3.size());
		
		System.out.println(ar3);
		for(int i=ar3.size()-1;i>=0;i--) {
			System.out.println(ar3.get(i));
		}
		
		//removeAll();
		ar3.removeAll(ar4); //this will remove all ar4 values from ar3
		System.out.println(ar3.size());
		
		//retainAll(); -- this will fetch only common values from two ArrayList
		
		//Removing duplicate values using Set collection
		
		
	}

}
