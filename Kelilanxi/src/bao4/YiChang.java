package bao4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class YiChang {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
try{
	
	  System.out.println("请输入一个除数");
	  int num1=sc.nextInt();
	
	  System.out.println("输入一个被除数");
	  int num2=sc.nextInt();
	
	
	  System.out.println("商是："+(num1/num2));
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
