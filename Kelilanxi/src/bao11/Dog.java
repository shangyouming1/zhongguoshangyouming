package bao11;

public class Dog extends Pet{
	
	
	private String sort;

public Dog(){
	
	super.name=" ";
	
	}	;
	
public Dog(String name,String sort){
	super(name);
	this.sort=sort;	

}
 

 public String getSort(){
	 return sort;
 }
 
 
 public void setSort(String sort){
	 this.sort=sort;
 }
 
 
 public abstract void show(){
	 super.show();
	 System.out.println("Æ·ÖÖ"+sort);
 }
 
}
