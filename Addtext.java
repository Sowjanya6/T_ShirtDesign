public class Addtext extends ShirtDecorator{
	   //private static Shape decoratorShirt;
	
	   public Addtext(Shape decoratorShirt) {
			super(decoratorShirt);
			Scanner in = new Scanner(System.in);
		        System.out.println("Enter the text to be printed on ur shirt");
                        String text = in.nextLine();
			System.out.println("the text on the tshirt is "+text);		
			// System.out.println("Adding text");
		}
		
	   public String getShirt(){
			return decoratedShirt.getShirt() +" Hello is the text printed, ";
		}
	   public double getCost(){
		      System.out.println("Cost for printing text on Tshirt is"+ 100.0);
			  return decoratedShirt.getCost()+100.0;
		   }
		   
		/*private String addtext(){
			return " +HELLO";
		}*/
		
			
		

}
