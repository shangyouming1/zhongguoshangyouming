package bao;

import java.util.Scanner;

public class Dog {
	
	
 String name;
 int health;
 int love;
 String sort;
 
 public void show(){
	 System.out.println("�ҵ����ֽ�"+name+"����ֵ"+health+"�����ܶ���"+love+"����һֻû�и����"+sort);
 }
 
 
 public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
	 System.out.println("��ӭ���������");
	 System.out.println("��������Ҫ���������֣�");
	 String name=sc.next();
	 System.out.println("��ѡ����������:(1:����    2�����)");
	 int num=sc.nextInt();
	 Dog d=new Dog();
	switch(num){
	
	case 1:
		System.out.println("��ѡ��Ʒ��:(1:������   2:����)");
		int b =sc.nextInt();
		if(b==1){
			d.name=name;
			d.sort="������";
			d.show();
		}else if(b==2){
			d.name=name;
			d.sort="����";
			d.show();
			
		}
		
		
		break;
	case 2:	
	
	break;
	} 
 }
	 
 }


