public class Shirt {
	public static void main(String args[]){
		Shape shirt=new AddPicture(new ChangeBgClr(new Addtext( new VShirt() )));
		//Shape shirt=new AddPicture();
		System.out.println(shirt.getShirt());
		System.out.println("Price:" +shirt.getCost());
		
		Shape shirt1=new AddPicture(new ChangeBgClr(new Addtext( new CollaredShirt() )));
		//Shape shirt=new AddPicture();
		System.out.println(shirt1.getShirt());
		System.out.println("Price:" +shirt1.getCost());
		
		Shape shirt2=new ChangeBgClr(new Addtext( new VShirt() ));
		//Shape shirt=new AddPicture();
		System.out.println(shirt2.getShirt());
		System.out.println("Price:" +shirt2.getCost());
		
		Shape shirt3=new PlanShirt();
		//Shape shirt=new AddPicture();
		System.out.println(shirt3.getShirt());
		System.out.println("Price:" +shirt3.getCost());
		

		
		
	}

}
