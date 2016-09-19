/**
 * 
 */
package introUnit;

/**
 * @author Student6
 * This class is designed to contrast with the ProceduralExample.
 * It embodies an Object-Oriented approach.
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student jillian = new Senior("Jillian", "programmer");
		Student jordan = new Student("Jordan");
		Student joseph = new Student("Joseph");
		jillian.talk();
//		jillian.name = "BoogerNose";
//		jillian.talk();
		
		jordan.talk();
		joseph.talk();

	}

}
