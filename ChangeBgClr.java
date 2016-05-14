 public class ChangeBgClr extends ShirtDecorator{
	    //private static Shape decoratorShirt;
		public ChangeBgClr(Shape decoratorShirt) {
			super(decoratorShirt);
			Scanner in = new Scanner(System.in);
		       System.out.println("Enter the background color to be printed on ur shirt");
                        String clr = in.nextLine();
			System.out.println("the text on the tshirt is "+clr);		
	        //System.out.println("Adding color");
		}
		
		public String getShirt(){

			return decoratedShirt.getShirt();
		}
	
   	   public double getCost(){
   		    System.out.println("Cost for colored Tshirt is"+ 100.0);
			 return decoratedShirt.getCost()+100.0;
		   }
		   
		
		
			
		

}
