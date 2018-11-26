package bao;

public class Student {
	
	
	int id;
	String name;
	int age;
	
	public void show(){
		
		System.out.println("name"+name+"age"+age+"id"+id);
	}
	
	Student [] stus=new Student[30];
	
	public void addStu(Student stu){
		  
		for(int i=0; i<stus.length;i++){
			
			if(stus[i]==null){
				
				stus[i]=stu;
				break;
			}
		}
		
	}

public void showStu(){
	for(int i=0;i<stus.length;i++){
		if(stus[i]!=null){
			
	       stus[i].show();
		} 
		
	}
	
}

public static void main(String[] args) {
	
	Student s1=new Student();
	s1.name="ÕÅÈı";
	s1.age=34;
	s1.id=5;
	
	Student s2=new Student();
	s2.name="ÕÅsi";
	s2.age=24;
	s2.id=5;
	
Student c=new Student();	
   c.addStu(s1);
   c.addStu(s2);
   c.showStu();
   
}
}
