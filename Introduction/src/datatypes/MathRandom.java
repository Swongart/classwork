package datatypes;

import java.util.Random;

public class MathRandom {
	
		public static void main(String[] args) {
			int[] results = new int[6];
			
			int totalRolls = 1000;		
			for (int index=0; index <totalRolls; index++){
				int roll=rollUnFairDie();
				System.out.println("Roll#" +(index+1)+ 
						" Die is "+rollUnFairDie()); //runs rollUnFairDie()
			results[roll-1]++;
			} 
			
			
			
			for (int i=0; i<6; i++) {
				int percentage = (int) (100*((double) results[i]/totalRolls));
			System.out.println((i+1)+ " was rolled "+results[i]/totalRolls+ percentage+ "%.");
			}
		}
		
	

		public static int rollFairDie(){
//			Random gen = new Random();
//			return gen.nextInt(6)+1;
			double rand = Math.random(); //random double (0,1)
			int roll = (int) (6* rand);//[0,5] 
			return roll+1; //0 becomes 1,5 becomes 6.
			
		}
		
		public static int rollUnFairDie(){
			double rand = Math.random(); //random double (0,1)
			int roll = (int) (7* rand);
			if (roll ==6) return 3;
			else 
			return roll+1; 
			
			
		}
}



