package bao4;

import java.util.Scanner;

public class KeCheng {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	try{	
		System.out.println("������γ����֣�");
		int num=sc.nextInt();
		
		switch(num){
		case 1:
			System.out.println("c++");
			break;
		case 2:
			System.out.println("����");
			break;			
		}
	}	catch(Exception e){
			e.printStackTrace();
			System.out.println("�������");
		}
	
	    finally{
	    	System.out.println("��ӭ�������");
	    	
	    	}
	
	}

}
