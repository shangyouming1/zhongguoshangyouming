package bao2;

public class Penguin {
	
	private String name;
	private int health;
	private int love;
	private String sex;
	
	public Penguin(){}
	public Penguin(String name,int health,int love){
		this.name=name;
		this.health=health;
		this.love=love;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	public void show(){
		System.out.println("。。。。");
	}
	
	
	

}
