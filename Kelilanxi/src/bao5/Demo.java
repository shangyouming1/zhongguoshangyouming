package bao5;

import java.util.Scanner;

public class Demo {
	
public static void main(String[] args) {
	

Scanner sc=new Scanner(System.in);

   int [] arr=new int[3];
int max=0;
System.out.println("�����һ������");
 arr[0]=sc.nextInt();

System.out.println("����ڶ�����");
 arr[1]=sc.nextInt();

System.out.println("�������������");
 arr[2] =sc.nextInt();

for(int i=0;i<arr.length;i++){
	if(max<arr[i]){
		max=arr[i];		
	}
	
}System.out.println("�������"+max);



}
}