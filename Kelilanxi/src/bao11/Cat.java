package bao11;

public class Cat extends Pet {
	
	private String sort;
	public  Cat(){
		
		super.name=" ";
		
		}	;
		
	public Cat(String name,int health,int love){
		super(name,health,love);
		

	}
	 
	 public String getSort(){
		 return sort;
	 }
	 
	 
	 public void setSort(String sort){
		 this.sort=sort;
	 }
	 
	 
	 public void show(){
		 super.show();
		 System.out.println("品种"+sort);
	 }
	 
	
	 public void toHospital(){
		this.setHealth(getHealth()+10);
	   System.out.println("我很健康");
		
	}

}
