package bao111;

import bao11.Cat;

public class must  {
	
	public void play(Pet pet){
		if(pet.getHealth()<80){
			pet.play();			
		}else if(pet.getLove()<56){
			pet.play();
		
		}else{System.out.println("²»Íæ");}
	}
	
	
	
	
	/*public void eatFood(Pet pet){
		if(pet instanceof Cat){
			Cat cat=(Cat) pet;
			Cat eatFood();
			
			
		}
		
	}*/

}


