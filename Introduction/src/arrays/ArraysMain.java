package arrays;

public class ArraysMain {
	
	public static void main(String[]args){
		//This is how you time how quickly a computer processor 
		long startTime=System.currentTimeMillis();
		arrayIntroMethod();
		
		String[] someStrings = new String[100];	
		populateArray(someStrings);
		
		changeString(someStrings[99]);
		
		printArray(someStrings);
		long endTime=System.currentTimeMillis();
		System.out.println("Completed method in "+(endTime-startTime)+" milliseconds");
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

public static void arrayIntroMethod(){
	//construct 2 integer arrays
			//these two methods do the same thing
			//primitive type arrays fill with ZEROES 0, 0.0, false
			int[] zeros1= {0,0,0};
			int[] zeros2= new int[3];
			//example
			boolean[] booleans=new boolean[3];
			//iterate (2 ways)
			//FIRST METHOD: "FOR LOOP"
			//WHEN TO USE THIS FOR LOOP
			//the index of the data is important to reference
			//you need to customize how you iterate(e.g. increase by 2, backwards, etc)
			for (int index=0; index<booleans.length; index++){
				System.out.println(index+")"+booleans[index]);
			}
			//SECOND METHOD:
			//always goes in order, doesn't keep track of index
			//easier to type
			for (boolean b: booleans){
				System.out.println(b +"");
			}
			//these two constructors are different
			String[] strings1={"","",""};
			String[] strings2= new String[3];
			//strings2[]="value 1";
				
			//this loop is for instantiating the strings
			for (int index=0;index<strings2.length; index++){
				strings2[index]="value"+(index+1);
			}
			
			//this loop for printing the strings.
			for (String s: strings2){
				System.out.println(s);
			}
			
}
}
