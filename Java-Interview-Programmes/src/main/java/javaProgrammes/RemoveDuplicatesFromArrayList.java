package javaProgrammes;

import java.util.ArrayList;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(40);

		System.out.println("ArrayList wih Duplicates" + list);

		// remove duplicates
		ArrayList<Integer> afterDuplicatesRemoved = removeDuplicates(list);

		System.out.println("ArrayList after Duplicates removed" + afterDuplicatesRemoved);

		ArrayList<String> str = new ArrayList<String>();
		str.add("Selenium");
		str.add("Selenium");
		str.add("Appium");

		System.out.println("ArrayList with duplicates" + str);

		ArrayList<String> newstr = removeStrings(str);
		System.out.println("Afer duplicates removed" + newstr);

	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {

		ArrayList<Integer> newList = new ArrayList<Integer>();

		for (Integer element : list) {

			if (!newList.contains(element)) {
				newList.add(element);
			}

		}
		return newList;

	}

	public static ArrayList<String> removeStrings(ArrayList<String> str) {

		ArrayList<String> newstr = new ArrayList<String>();

		for (String element : str) {
			if (!newstr.contains(element)) {
				newstr.add(element);
			}
		}
		return newstr;

	}

}
