package bao4;

import java.util.Scanner;

import org.apache.log4j.Logger;

import org.junit.Test;

public class ZiDingYi {
	
	
	Scanner sc=new Scanner(System.in);

	
	private static Logger logger=Logger.getLogger(ZiDingYi.class.getName());
	
     @Test 
	public void test01(){
			
		 System.out.println("������һ������");
		  int num1=sc.nextInt();
		   logger.debug("����"+num1);
		  System.out.println("����һ��������");
		  int num2=sc.nextInt();
		  logger.debug("������"+num2);
		  System.out.println("�̣�"+(num1/num2));
		  logger.debug("�̣�"+(num1/num2));
	
	}
	
}
