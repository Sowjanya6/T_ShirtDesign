
public class PlanShirt implements Shape{
	@Override
	public String getShirt(){
		return "Plan shirt";
		
	}
	@Override
	public double getCost(){
		System.out.println("cost of shirt:"+40.0);
		return 40.0;
	}
	

}
