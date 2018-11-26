package bao5;

import java.util.Scanner;

public class Demo {
	
public static void main(String[] args) {
	

Scanner sc=new Scanner(System.in);

   int [] arr=new int[3];
int max=0;
System.out.println("输入第一个数：");
 arr[0]=sc.nextInt();

System.out.println("输入第二个数");
 arr[1]=sc.nextInt();

System.out.println("输入第三个数：");
 arr[2] =sc.nextInt();

for(int i=0;i<arr.length;i++){
	if(max<arr[i]){
		max=arr[i];		
	}
	
}System.out.println("最大是是"+max);



}
}