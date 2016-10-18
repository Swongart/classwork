package arrays;

public class DemonstrationArrays {
	
	public static void main(String[]args){
		printFiftyArray();
	}

	private static void printFiftyArray() {
		// 1)Populate and print an array with the numbers 1 - 50.
		
		// Create an array with room for 50 integers
		int[] nums = new int[50];

		// Fill it with numbers using a for-loop
		for (int i = 0; i < nums.length; i++)
		{
		nums[i] = i + 1;  // +1 since we want 1-50 and not 0-49
		System.out.println(nums[i]);
		}
		
	}
	
}
