package javaProgrammes;

import java.util.HashMap;

public class CountWordsUsingHashmap {

	// Write a Java Program to count the number of words in a string using HashMap.
	public static void main(String[] args) {
		/*
		 * This is a collection class program where we have used HashMap for storing the
		 * string.
		 * 
		 * First of all, we have declared our string variable called str. Then we have
		 * used split() function delimited by single space so that we can split multiple
		 * words in a string.
		 * 
		 * Thereafter, we have declared HashMap and iterated using for loop. Inside for
		 * loop, we have an if-else statement in which wherever at a particular
		 * position, the map contains a key, we set the counter at that position and add
		 * the object to the map.
		 * 
		 * Each time, the counter is incremented by 1. Else, the counter is set to 1.
		 * 
		 * Finally, we are printing the HashMap.
		 * 
		 * Note: The same program can be used to count the number of characters in a
		 * string. All you need to do is to remove one space (remove space delimited in
		 * split method) in String[] split = str.split(“”);
		 */
		String str = "This this is is is done by Suraj Shinde";
		
        String[] split = str.split(" ");
        System.out.println(split.length);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }
            else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
        
      
		
	}

}
