package tes;

import java.lang.reflect.Field;

public class StringManipulator {

	public static void setCharAt(String s, int index, char c) {
		if (index < 0 || index >= s.length())
			throw new StringIndexOutOfBoundsException();
		
		try {
			/*
			 * TODO 1. Get class object for the String type.
			 * A class object has the type Class<String>.
			 * Any object has the getClass() method which returns a Class<YourObjectType>.
			 */
			
			/*
			 * TODO 2. Get the Field you want to modify (Field, not field).
			 * The method to use is getDeclaredField from your Class<YourType> object.
			 * Important: the internal field you want to modify here is called "value".
			 */
			
			/*
			 * TODO 3. The field is probably private.
			 * (the internal char[] in the String class surely is).
			 * You must make it accessible.
			 * Otherwise setting it to a different value will throw IllegalAccessExceptions.
			 */
			
			/*
			 * TODO 4. Get the actual value inside your String object.
			 * The Field object you obtained previously is just an accessor object.
			 * Call the get() method to obtain the actual char[] inside your String.
			 */
			
			/*
			 * TODO 5. Now that you have access to the internal char[] inside your String,
			 * insert the character at the corresponding index.
			 * This should be easy.
			 */
		} catch (Exception e) {
			// We don't care about exceptions right now.
			// Just for fun, look at the methods we use and see what exceptions they throw and why.
			e.printStackTrace();
		}
	}
	
	
	public static void appendChar(String s, char c) {
		try {
			/*
			 * TODO 1-4 should be the same as in setCharAt. 
			 */
			
			/*
			 * TODO 5. You have to _append_ now.
			 * Which means you have to allocate a new char array.
			 * Allocate a new char array, copy the characters from the old char array
			 * and add the new char.
			 */
			
			/*
			 * TODO 6. Final move.
			 * Set the new value of the field inside your String.
			 * As before, the Field you obtained is just an accessor object.
			 * Call the set() method. 
			 * Notice it takes 2 parameters: 
			 * 		- one is the object you want to modify
			 * 		- another is the new value you want to set to the field
			 */
		} catch (Exception e) {
			// We don't care about exceptions right now.
			// Just for fun, look at the methods we use and see what exceptions they throw and why.
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String greet = "hello";
		setCharAt(greet, 0, 'b');
		System.out.println(greet);
		appendChar(greet, 'm');
		System.out.println(greet);
	}
}
