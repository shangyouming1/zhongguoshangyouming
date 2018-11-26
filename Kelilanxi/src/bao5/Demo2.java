package bao5;

import java.util.Scanner;

import org.junit.Test;

public class Demo2 {
	Scanner sc=new Scanner(System.in);
@Test
public void test01(){
		
		
		System.out.println("输第一个入数字");
		int a=sc.nextInt();
		System.out.println("输入第二个数字");
		int b=sc.nextInt();
		
		System.out.println("请选测");
		int c=sc.nextInt();
			
		switch(c){		
		case 1:
			
			System.out.println(a+b);
			
			break;
		case 2:
			
			System.out.println(a-b);
			break;
		}		
		
	}




@Test
public void test02(){
	
	 System.out.println("输入一个三位数字");
	 int a=sc.nextInt();
	
	 
	 
	 int b =a/100;
     int c =a%10%10;	 
	 int d =a%10;
	
	 
	 System.out.println("和是"+(b+c+d));
}





@Test
public void test03(){
	
	
	 int [] arr=new int[3];
	System.out.println("第一个数字");
	int a=sc.nextInt();
	System.out.println("第二个数日子");
	int b=sc.nextInt();
	System.out.println("第三个");
	int c=sc.nextInt();
	
	
	/*for (int i = 0; i < arr.length-1; i++) {
		for (int j = 0; j < arr.length-i-1; j++) {
			if(arr[j]<arr[j+1]){
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
				
			}
			
		}
				
	}for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
		
	}*/
	
	if(a<b){
		int t=a;a=c;c=t;
	}
	
	if(b<c){
		int t=a;a=c;c=t;
	}
	
	
}



@Test
public void test4(){
		
/*int sum=0;
for (int i = 0; i < 100; i++) {
	if(i%2!=0){		
		sum=i+sum;
	}
		
}	System.out.println("和是"+sum);

}*/


  /*int sum=0;
  int i=1;

  while(i<=100){
  sum+=i;
  i+=2;
    }System.out.println(sum);
  }  */
	
	
 int sum=0;
 int i=1;
 do{   
	

 }while();
 }



@Test
public void test05(){
	
	for (int i = 1000; i <=9999; i++) {
		int ab=i/100;
		int cd=i%100;
		if((ab+cd)*(ab+cd)==i){
			System.out.println(i);
		}
	}
	
	
	
}







}
