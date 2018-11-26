package bao7;

public class TestGender {
	
	private Gender sex;
	
	
public TestGender(){}

public TestGender(Gender sex){
	
	this.sex=sex;
}
		
	public Gender getSex() {
		return sex;
	}

	public void setSex(Gender sex) {
		this.sex = sex;
	}
	
public void show(){	
	System.out.println("ĞÔ±ğÊÇ"+sex);
}
}
