package bao3;

public class fangdaomen extends Door implements Lock,PaiZhao {
	
	public void closeDoor(){
		
		System.out.println("开门");
	}
	public  void openDoor(){
		System.out.println("关门");
		}
		
		public void closeLock(){
			System.out.println("开锁");
		}
		
		
		public void openLock(){
			System.out.println("关锁");
		}
		
		
		public void photo(){
			System.out.println("拍照了");
		}
		
	

}
