package bao2;

public class Dog extends Pet{
	
	
	private String sort;

public Dog(){
	
	super.name=" ";//super���ø����������
	System.out.println("�����޲ҹ��췽��");
	}	;
	
public Dog(String name,String sort){
	super(name);//super���ø�������Ĺ��췽��
	this.sort=sort;	
	System.out.println("�����вι���");
}
 

 public String getSort(){
	 return sort;
 }
 
 
 public void setSort(String sort){
	 this.sort=sort;
 }
 
 
 public void show(){
	 super.show();//super����show����
	 System.out.println("Ʒ��"+sort);
 }
 
}
