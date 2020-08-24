package javaProgrammes;

public class SeperateDigitFromString {

	public static void main(String[] args) {

		String str = "Sur1a3j55Sh67in98de1234";
		String numbers = "";
		String charaters = "";

		for (int i = 0; i < str.length(); i++) {

			char chars = str.charAt(i);

			if (Character.isDigit(chars)) {

				numbers = numbers + chars;
				

			} else {

				charaters = charaters + chars;

			}

		}

		System.out.println("Numbers in String: " + numbers);
		System.out.println("Charachters in String: " + charaters);

	}

}
