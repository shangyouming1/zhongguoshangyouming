package bao4;

public class Sex {
	
	String sex;

	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		if("男".equals(sex)||"女".equals(sex)){
				this.sex = sex;
		}else{
			
			try{
			throw new MyException("性别只能是男或者女");
			}catch(Exception e){
				e.printStackTrace();
			}
		}	
	}
		
public void show(){
	
	System.out.println("性别："+sex);
}

}
