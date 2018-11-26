package bao3;

/*public class Fan implements USB {
	
	public void service(){
		
		System.out.println("风扇转转了");
	}

}*/





public class Fan implements USB{//创建一个fan类去实现USB接口的方法
	
	public void service(){//重写接口里的抽象方法
		System.out.println("风扇转了");//输出
	}
	
}
                                                                                  