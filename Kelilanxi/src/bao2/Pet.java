package bao2;

public class Pet {

	
	String name;
	private int health;
	private int love;
	
	public Pet(){
		System.out.println("父类无惨构造");
	}
	
	public Pet(String name){
		
		this.name=name;
		System.out.println("父类有参构造");
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getHealth(){
		return health;
	}
	
	public void setHealth(int health){
		this.health=health;
	}
	
	
	public int getLove(){
		return love;
	}
	
	public void setLove(int love){
		this.love=love;
	}
	
	public void show(){
		System.out.println("姓名"+name+"健康值"+health+"亲密度"+love);
	}
}
