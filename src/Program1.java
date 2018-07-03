
public class Program1 {

	public static void main(String[] args) {
		int counter, inches, feet;
		double meters;
		
		counter = 0;
		feet = 12; // Amount of feet should be covered
		
		for (inches = 1; inches <= feet * 12; inches++) {
			
			meters = inches * 0.0254;
			System.out.println(inches + " Inches are equal to " + meters + " meters");
			counter++;
		
		  if (counter == 12) {
			  System.out.println();
			  System.out.println("   # of inches = " + inches);
			  System.out.println();
			  counter=0;
			  
		  }
		}
	}
}