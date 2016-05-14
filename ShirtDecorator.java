
public  class ShirtDecorator implements Shape {
	protected Shape decoratedShirt;
	
	public ShirtDecorator(Shape decoratorShirt){
		this.decoratedShirt=decoratorShirt;
	}
	  @Override
	  public String getShirt(){
		  return decoratedShirt.getShirt();
	}
	  @Override
	   public double getCost(){
		   return decoratedShirt.getCost();
	   }
	   

}
