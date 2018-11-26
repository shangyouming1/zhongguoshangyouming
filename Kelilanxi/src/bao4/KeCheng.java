package bao4;

import java.util.Scanner;

public class KeCheng {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	try{	
		System.out.println("请输入课程数字：");
		int num=sc.nextInt();
		
		switch(num){
		case 1:
			System.out.println("c++");
			break;
		case 2:
			System.out.println("语文");
			break;			
		}
	}	catch(Exception e){
			e.printStackTrace();
			System.out.println("输入错误");
		}
	
	    finally{
	    	System.out.println("欢迎提出建议");
	    	
	    	}
	
	}

}
