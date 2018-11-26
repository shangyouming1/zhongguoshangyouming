package bao11;

public class muast extends Pet {
	
	public void goHospital(Cat cat){
		if(cat.getHealth()<80){
			cat.toHospital();
		}else{System.out.println("Ã»ÊÂ");};
	}

}
