package bao2;

public class Pet {

	
	String name;
	private int health;
	private int love;
	
	public Pet(){
		System.out.println("�����޲ҹ���");
	}
	
	public Pet(String name){
		
		this.name=name;
		System.out.println("�����вι���");
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
		System.out.println("����"+name+"����ֵ"+health+"���ܶ�"+love);
	}
}
