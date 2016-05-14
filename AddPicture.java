public class AddPicture extends ShirtDecorator{

		//private static Shape decoratorShirt;
		public AddPicture(Shape decoratorShirt) {
			super(decoratorShirt);
			 System.out.println("Adding picture");
		}
		public String getShirt(){
			return decoratedShirt.getShirt() +"picture is added, ";
		}
		   public double getCost(){
			   System.out.println("Cost for printed Tshirt is"+ 100.0);
			   return decoratedShirt.getCost()+100.0;
		   }
		   
		
		/*private String addpic(){
			return " +picture is added";
		}*/
		
			
		

}

