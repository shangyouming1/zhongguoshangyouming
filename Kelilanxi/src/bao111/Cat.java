package bao111;

public class Cat extends Pet {

	private String sort;
	public  Cat(){
		
		super();
		
		}	
		
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
		 System.out.println("Ʒ��"+sort);
	 }
	 
	
	 public void catchingFlyDisc(){
		this.setHealth(getHealth()-10);
		this.setLove(getLove()+5);
		System.out.println("�������");
		System.out.println("����");
	}

	 public void play(){
		 
	 }
	 
}
