package arrays;

public class DemonstrationArrays {
	
	public static void main(String[]args){
		
		passByValueDemonstration();
		
	}
	
	private static void passByValueDemonstration(){
		String[] someStrings = new String[50];	
		populateArray(someStrings);
		
		int ten=10;
		increase(ten);
		System.out.println("Ten increased is "+ten);
		
		//in this method, we pas the ELEMENT 
		//(a variable) not the array, so
		//no change will be made
		System.out.println("Before "+someStrings[49]);
		changeString(someStrings[49]);
		System.out.print("After \"changeString\" method "+someStrings[49]);
		changeArray(someStrings);
		System.out.print("After \"changeArray\" method "+someStrings[49]);
		changeArrayElement(someStrings,49);
		System.out.print("After \"changeArrayElement\" method "+someStrings[49]);
		printArray(someStrings);
	}
	
	private static void changeArrayElement(String[]someStrings,int i){
		someStrings[i]= "new item "+(i+1);
	}
	
	private static void changeArray(String[] someStrings) {
		someStrings= new String[100];
		for (int i=0; i<someStrings.length; i++){
			someStrings[i]="new item "+(i+1);
		}
		
	}

	private static void increase(int x){
		x=x+1;
	}
	
	private static void changeString(String s){
		s="This string has been changed.";
	}
	
private static void printArray(String[] a) {
	
	for (String s: a){
		System.out.println(s);
	}
	}

private static void populateArray(String[] a) {
	for (int index=0;index<a.length; index++){
		a[index]="value"+(index+1);
	}
	}

			

}
