package bao4;

import java.util.Scanner;

import org.apache.log4j.Logger;

import org.junit.Test;

public class ZiDingYi {
	
	
	Scanner sc=new Scanner(System.in);

	
	private static Logger logger=Logger.getLogger(ZiDingYi.class.getName());
	
     @Test 
	public void test01(){
			
		 System.out.println("请输入一个除数");
		  int num1=sc.nextInt();
		   logger.debug("除数"+num1);
		  System.out.println("输入一个被除数");
		  int num2=sc.nextInt();
		  logger.debug("被除数"+num2);
		  System.out.println("商："+(num1/num2));
		  logger.debug("商："+(num1/num2));
	
	}
	
}
