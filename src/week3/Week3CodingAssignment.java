package week3;


public class Week3CodingAssignment {

	public static void main(String[] args) {
		
		//1ab.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 31};
		
		System.out.println("1ab. " + ((ages[ages.length-1])-ages[0]));
	
		//1c.
		int ageSum = 0;
		for (int age: ages) {
			ageSum += age;
		}
		System.out.println("1c. " + ageSum/ages.length);
		//**************************************************************************************
		
		//2a.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		int letterSum = 0;
		for (String name : names) {
			letterSum += name.length();
		}
		System.out.println("2.a " + letterSum/names.length);
		
		//2b.
		String concatSum = "";
		for (int i=0; i<names.length; i++) {
			if (i==names.length-1) {
				concatSum += names[i];
			}
			else {
				concatSum += names[i] + " ";
			}
		}
		System.out.println("2b. " + concatSum);
		//*****************************************************************************************
		
		//3. arrayName[arrayName.length-1]
		//4. arrayName[0]
		
		//*****************************************************************************************
		
		//5. 
		int[] nameLengths = new int[names.length];
		for (int i=0; i<nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//******************************************************************************************
		
		//6.
		int lengthSums = 0;
		for (int nameLength : nameLengths) {
			lengthSums += nameLength;
		}
		System.out.println("5&6. " + lengthSums);

		//*****************************************************************************************
		
		//7.
		System.err.println("7. " +  concatTimes("Evoke", 5));
		
		//*****************************************************************************************

		//8.
		System.out.println("8. " +  fullName("Pierce", "Isaacson"));
	
		//*****************************************************************************************

		//9.
		int[] array0 = {5, 66, 7, 23,};
		System.out.println("9. " + isArrayBig(array0));
		int[] array1 = {5, 66, 6, 23,};
		System.out.println("   " + isArrayBig(array1));
		
		//*****************************************************************************************

		//10.
		double[] dblArray = {4.44, 26.05, 6.77, 21.51, 78.89};
		System.out.println("10. " + avgDouble(dblArray));
		
		//*****************************************************************************************

		//11.
		double[] avgDblA = {62.18, 40.54, 58.24, 36.12, 93.97, 51.91, 60.88};
		double[] avgDblB = {20.47, 30.87, 50.02, 42.69, 4.76, 81.66, 42.03};
		System.out.println("11. " + isAvg1Bigger(avgDblA, avgDblB));		
		System.out.println("    " + isAvg1Bigger(avgDblB, avgDblA));	
		
		//*****************************************************************************************

		//12.
		System.out.println("12. " + willBuyDrink(true, 37.11));
		System.out.println("    " + willBuyDrink(true, 5.00));
		System.out.println("    " + willBuyDrink(false, 13.25));

		//*****************************************************************************************

		//13. An event had a massive guest book of thousands of attendees, the list was entered improperly 
		// where names are properly capitalized but there is no space between the fore and surname.
		// The fixNames method will scan through and produce a more readable result.
		String[] guestBook = {"BraidenBarker", "SorchaFerry", "AlisterWeaver"};
		System.out.println("13.");
		fixNames(guestBook);
	}
	
	// AssignmentMethods
	//7. Method
	static String concatTimes(String word, int n) {
		String concatWord = "";
		for (int i = 0; i<n; i++) {
			concatWord += word;
		}
		return concatWord;
	}
	
	//*****************************************************************************************

	//8. Method
	static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//*****************************************************************************************

	//9. Method
	static boolean isArrayBig(int[] checkArray) {
		int sumArray = 0;
		for (int check : checkArray) {
			sumArray += check;
		}
		return (sumArray>100);
	}
	
	//*****************************************************************************************

	//10. Method
	static double avgDouble(double[] dblArray) {
		double dblSum= 0;
		for (double dbl : dblArray) {
			dblSum+=dbl;
		}
		return dblSum/dblArray.length;
	}

	//*****************************************************************************************

	//11. Method
	static boolean isAvg1Bigger(double[] array1, double[] array2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double array : array1) {
			sum1 += array;
		}
		for (double array : array2) {
			sum2 += array;
		}
		return sum1/array1.length>sum2/array2.length;
	}
	
	//*****************************************************************************************

	//12. Method
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && (moneyInPocket>10.5);
	}
	
	//*****************************************************************************************

	//13. Method Solution
	static void fixNames(String[] fixArr) {			//Takes input of an incorrectly formatted guest list
		String fixedName = "";						
		for (int i=0; i<fixArr.length; i++) {		//Loops through every Array location needing correction
			fixedName = "";
			fixedName += fixArr[i].charAt(0);		//The character at index 0 is manually entered as it is always treated as correct
													//but will trigger a later if-function being a capital letter
			for (int j=1; j<fixArr[i].length(); j++) {				//Each Array location's characters are sifted through
				if (Character.isUpperCase(fixArr[i].charAt(j))) {	//to find the beginning of the last name(a capital letter)
					fixedName += " " + fixArr[i].charAt(j);			//and then is concatenated with a space before the last name.
				}
				else {
					fixedName += fixArr[i].charAt(j);
				}
			}
			System.out.println(fixedName);			//The corrected entry is output to console.
		}
		
	}
	
}
