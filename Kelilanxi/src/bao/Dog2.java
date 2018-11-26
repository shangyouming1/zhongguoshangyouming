package bao;

public class Dog2 {
	
	
	String name;
	 int health;
	 int love;
	 String sort;
	 
	 public void show(){
		 System.out.println("我的名字叫"+name+"健康值"+health+"情亲密度是"+love+"我是一只没有感情的"+sort);
	 }
	 
	
	public  Dog2(){
		System.out.println("我是构造方法");
	}

	
    public Dog2(String name,int health){
    	
    this.name=name;
    this.health=health;
    	  
   };













}
