package bao;

import java.util.Scanner;

public class Dog {
	
	
 String name;
 int health;
 int love;
 String sort;
 
 public void show(){
	 System.out.println("我的名字叫"+name+"健康值"+health+"情亲密度是"+love+"我是一只没有感情的"+sort);
 }
 
 
 public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
	 System.out.println("欢迎来到宠物店");
	 System.out.println("请输入需要领养的名字：");
	 String name=sc.next();
	 System.out.println("请选择宠物的类型:(1:狗狗    2：企鹅)");
	 int num=sc.nextInt();
	 Dog d=new Dog();
	switch(num){
	
	case 1:
		System.out.println("请选择品种:(1:霸王龙   2:鲨鱼)");
		int b =sc.nextInt();
		if(b==1){
			d.name=name;
			d.sort="霸王龙";
			d.show();
		}else if(b==2){
			d.name=name;
			d.sort="鲨鱼";
			d.show();
			
		}
		
		
		break;
	case 2:	
	
	break;
	} 
 }
	 
 }


