package com.corejava.array;

/*import java.util.HashSet;
import java.util.Set;*/

public class DuplicateElementWithSmallestIndex {
	public static void main(String[] args) {

		int[] array = {2, 3, 2};

		System.out.println(firstDuplicate(array));
	}

	/**
	 * First duplicate.
	 *
	 * @param array the array
	 * @return the int
	 */
	private static int firstDuplicate(int[] array) {
		/*Set<Integer> duplicateSet = new HashSet<>();
		for(int i = 0; i < array.length; i++) {
			if(!duplicateSet.add(array[i])) {
				return array[i];
			}
		}
		return -1;*/

		for(int i = 0; i < array.length; i++) {
			int temp = array[Math.abs(array[i]) - 1];
			System.out.println("Temp : " + temp);
			
			if(temp < 0) 
				return Math.abs(array[i]);
			else 
				array[Math.abs(array[i]) - 1] = -array[Math.abs(array[i]) - 1];

			System.out.print("Iteration" + (i+1) + " : ");
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[j] + ",");
			}
			System.out.println();
		}
		return -1;
	}
}
