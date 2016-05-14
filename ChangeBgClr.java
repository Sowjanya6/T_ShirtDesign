 public class ChangeBgClr extends ShirtDecorator{
	    //private static Shape decoratorShirt;
		public ChangeBgClr(Shape decoratorShirt) {
			super(decoratorShirt);
	        //System.out.println("Adding color");
		}
		
		public String getShirt(){

			return decoratedShirt.getShirt() +"clr changed to pink,  ";
		}
	
   	   public double getCost(){
   		    System.out.println("Cost for colored Tshirt is"+ 100.0);
			 return decoratedShirt.getCost()+100.0;
		   }
		   
		
		
			
		

}
