package sort;

public class MainBattle {
	
		public static void main(String[] args){
			 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
			 Pokemon raticate = new Pokemon("Raticate",26);
			 raticate.iChooseYou();
			 bulbasaur.iChooseYou();
			 System.out.println("Raticate is preparing"+"to attack with super fang");
			 raticate.attack(bulbasaur, new Attack(){
				 
				 public void attack(Pokemon target){
					 System.out.println("Super fang is used!");
					 int newHP=target.getHP()/2;
					 target.setHP(newHP);
					 
				 }
			 });
			 bulbasaur.attack(raticate, new Attack(){
				 public void attack(Pokemon target){
				 System.out.println("Poison powder is used!");
				 target.setPoisoned(true);
				 }
			 });
			 //create a way for raticate and bulbasaur to attack
			 raticate.lapse();
			 bulbasaur.lapse();
			 printScore(raticate,bulbasaur);
			 
		}
		public static void printScore(Pokemon p1, Pokemon p2){
			System.out.println(p1.getName()+", HP= "+p1.getHP());
			System.out.println(p2.getName()+", HP= "+p2.getHP());
		}
	

}
//