package bao2;

public class equals {
	
	int age;
	String name;
	int id;
	
public equals(String name, int age, int id) {
		
	}




public boolean equals(Object obj){
	if(this==obj){
		return true;	
	}

if(obj instanceof equals){
	equals e=(equals)obj;
	if(this.id==e.id && this.name==e.name && this.age==e.age){
		return true;
	}
}return false;


}

}
