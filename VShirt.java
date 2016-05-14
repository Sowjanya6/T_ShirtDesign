public class VShirt implements Shape {

		   @Override
		 /* public void draw() {
		      System.out.println("Shape: VShirt");
		   }*/
		   public String getShirt(){
			   return "Vshirt:";
		   }
		   @Override
		   public double getCost(){
			   System.out.println("Cost of vShirt is "+ 50);
			   return 50;
		   }
		   
}

