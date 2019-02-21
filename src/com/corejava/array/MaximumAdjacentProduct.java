package com.corejava.array;

/**Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
 * Example:
 * For inputArray = [3, 6, -2, -5, 7, 3], the output should be adjacentElementsProduct(inputArray) = 21.
 * 7 and 3 produce the largest product.*/
public class MaximumAdjacentProduct {
	public static void main(String[] args) {

		int[] inputArray = {-23, 4, -3, 8, -12};
		System.out.println(adjacentElementsProduct(inputArray));
	}

	static int adjacentElementsProduct(int[] inputArray) {
		int i = 0;
		int maxProduct = inputArray[i] * inputArray[i+1];
		while(i < inputArray.length-1) {
			if(maxProduct < (inputArray[i] * inputArray[i+1]))
				maxProduct = inputArray[i] * inputArray[i+1];

			i++;
		}
		return maxProduct;  
	}
}
