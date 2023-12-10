package week04Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class projectweek04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};		
		
//		a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		int newAges = ages[ages.length - 1] - ages[0];
		System.out.println("Result " + newAges);
					
//		b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 75};
		
//		i. Make sure that there are 9 elements of type int in this new array.  

//		ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		int newAges2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println("Result " + newAges2);
		
//		iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

//		c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		double sum = 0;
		for(int number : ages2) {
			sum += number;
		}
		double average = sum / ages2.length;
		System.out.println("The average age in newAges2[] " + average);
		
//		2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tim", "Sally", "Buck", "Bob"};
//		a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		average = sum / names.length;
		System.out.println("The average number of letters per name in names[] = " + average);
		

		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String allNames = "";
		for( int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
		System.out.println(allNames);

//		3. How do you access the last element of any array?
		
		System.out.println("Use array[arr.length] to access the last element of an array.");

//		4. How do you access the first element of any array?
		
		System.out.println("Use array[0] to access the first element.");

//		5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i <names.length; i++) {
			nameLengths[i] = names[i].length();
			}

//		6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.

		sum = 0;
				for(int i = 0; i < nameLengths.length; i++) {
					sum += nameLengths[i];
				}
		System.out.println("The sum of all lengths in nameLengths[] = " + sum);
		
//		7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

		System.out.println(duplicateWord("Hello", 5));
		
//		8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		
		System.out.println(fullName("John", "Smith"));

//		9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		System.out.println("checkIfSumGreaterThan100() returns => " + checkIfSumGreaterThan100(ages));

//		10. Write a method that takes an array of double and returns the average of all the elements in the array.

		double[] doubleArr = {0.1, 1.0, 236.4592, 1000.1};
			System.out.println("getAverageOfDoubleArr() returns => " + getAverageOfDoubleArr(doubleArr));
	
//		11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			
			double[] anotherDoubleArr = {2.2, 3.3, 4.4, 5.5};
			System.out.println("isFirstArrAvgGreater returns => " + isFirstArrAvgGreater(doubleArr, anotherDoubleArr));

//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
//			
//			boolean isHotOutside =true;
//			double moneyInPocket = 14;
//			System.out.println(willBuyDrink);
//			
//		13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

//			This method is to find the longest name thing on a List<Stirng>.
			
			List<String> shoppingList = new ArrayList<String>();
			shoppingList.add("Pizza");
			shoppingList.add("Bananas");
			shoppingList.add("Meat");
			shoppingList.add("Bread");
			shoppingList.add("Eggs");
			shoppingList.add("Milk");
			System.out.println(findLongestString(shoppingList));

		
		
		

	}
	public static String duplicateWord(String word, int n) {
		String duplicatedWord = "";
		for(int i = 0; i< n; i++) {
			duplicatedWord += word;
		}
		return "duplicatedWord() returns => " + duplicatedWord;
	}
	
	public static String fullName(String firstName, String lastName){
		return "fullName() return => " + firstName + " " + lastName;
}
	public static Boolean checkIfSumGreaterThan100(int[] arr) {
		return Arrays.stream(arr).sum() > 100;
	}
	public static double getAverageOfDoubleArr(double[] arr) {
		// We need to use .orElse() in case an empty array is passed in
		return Arrays.stream(arr).average().orElse(Double.NaN);
	}
	public static boolean isFirstArrAvgGreater(double[] firstArr, double[] secondArr) {
		return getAverageOfDoubleArr(firstArr) > getAverageOfDoubleArr(secondArr);
		
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.50);
			}

	public static String findLongestString (List<String> list) {
		String longest = list.get(0);
		for(String string : list) {
			if (string.length() > longest.length()) {
				longest = string;
			}
		}
		return longest;
	}


}



