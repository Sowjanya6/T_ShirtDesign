public class AddPicture extends ShirtDecorator{

		//private static Shape decoratorShirt;
		public AddPicture(Shape decoratorShirt) {
			super(decoratorShirt);
			Scanner in = new Scanner(System.in);
		        System.out.println("Enter the picture to be printed on ur shirt");
                        String pic = in.nextLine();
			System.out.println("the text on the tshirt is"+pic);		
			// System.out.println("Adding picture");
		}
		public String getShirt(){
			return decoratedShirt.getShirt();
		}
		   public double getCost(){
			   System.out.println("Cost for printed Tshirt is"+ 100.0);
			   return decoratedShirt.getCost()+100.0;
		   }
		   
		
		/*private String addpic(){
			return " +picture is added";
		}*/
		
			
		

}

