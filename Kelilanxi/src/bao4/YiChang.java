package bao4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class YiChang {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
try{
	
	  System.out.println("������һ������");
	  int num1=sc.nextInt();
	
	  System.out.println("����һ��������");
	  int num2=sc.nextInt();
	
	
	  System.out.println("���ǣ�"+(num1/num2));
	}catch(ArithmeticException e){
		e.printStackTrace();
		System.out.println("1111");		
	}
     catch(InputMismatchException e){
    	 e.printStackTrace();
    	 System.out.println("2222");
     }catch(Exception e){
    	 
    	 e.printStackTrace();
    	 System.out.println("33333");
     }
}	




/*
 * 
 * */






















}
