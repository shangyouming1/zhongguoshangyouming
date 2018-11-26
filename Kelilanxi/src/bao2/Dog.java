package bao2;

public class Dog extends Pet{
	
	
	private String sort;

public Dog(){
	
	super.name=" ";//super调用父类里的属性
	System.out.println("子类无惨构造方法");
	}	;
	
public Dog(String name,String sort){
	super(name);//super调用父亲类里的构造方法
	this.sort=sort;	
	System.out.println("子类有参构造");
}
 

 public String getSort(){
	 return sort;
 }
 
 
 public void setSort(String sort){
	 this.sort=sort;
 }
 
 
 public void show(){
	 super.show();//super调用show方法
	 System.out.println("品种"+sort);
 }
 
}
