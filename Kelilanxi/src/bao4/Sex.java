package bao4;

public class Sex {
	
	String sex;

	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		if("��".equals(sex)||"Ů".equals(sex)){
				this.sex = sex;
		}else{
			
			try{
			throw new MyException("�Ա�ֻ�����л���Ů");
			}catch(Exception e){
				e.printStackTrace();
			}
		}	
	}
		
public void show(){
	
	System.out.println("�Ա�"+sex);
}

}
