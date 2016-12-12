package arrays;
import java.util.Random;
public class DemonstrationArrays {
	
	static int[] results= new int[11];
	
	public static void main(String[]args){
		printFiftyArray();
		
	}

	private static void printFiftyArray() {
		// 1)Populate and print an array with the numbers 1 - 50.
		
		// Create an array with room for 50 integers
		

		// Fill it with numbers using a for-loop
		int[] nums = new int[50];
		for (int i = 0; i < nums.length; i++)
		{
		nums[i] = i + 1;  // +1 since we want 1-50 and not 0-49
		System.out.println(nums[i]);
		}
		
	}
	public static int randInt(int min, int max) {
		 Random rand = new Random();

		    // nextInt excludes the top value so we have to add 1 to include the top value
		    int randomNum = rand.nextInt((max - min) + 1) + min;

		    return randomNum;
	}
	private static void populateDieArray(int[] array){
		for (int i=0; i<array.length;i++){
			int firstRoll= randInt(1,6);
			int secondRoll= randInt(1,6);
			array[i]=firstRoll+secondRoll;
			//System.out.println(x);
		}
		
	}
	private static void populateResultsArray(int[] numsRolled){
		for (int d=0; d<numsRolled.length;d++){
			results[numsRolled[d]-2]++;
		}
	}
	private static void printResults(int[]arr){
		for (int i=0; i<arr.length;i++){
			//System.out.println((i+2)+"is rolled"+((double)arr[i]/dieArray.length));
		}
	}
	
}
