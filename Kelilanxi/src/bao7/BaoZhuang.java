package bao7;

import java.util.Random;
import java.util.Scanner;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

public class BaoZhuang {
	
	//�����Ǵ���String���͵�ֵ��Ϊ������ʱ�����������ֵ��Ҫ��װ���Ӧ�Ļ����������� 
	//���������͵�ֵ�����װ����Ϊ������ʱ�򣬳���ture֮��ȫ��false
	
	
	   
	
	
	
	@Test
	public void test08(){
		int rand=(int )(Math.random()*10);
		
		Random ran=new Random();
		for(int i=0;i<10;i++){
			
			int nextInt=ran.nextInt(100);
			System.out.println(nextInt);
		}
		
	}
	
	
	
	
	
	
	@Test
	public void test07(){
		String s=new String("java");
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		sb.append("�����");
		System.out.println(sb);
		sb.insert(2, "�������ٸ�");
		System.out.println(sb);
	}
	
	
	
	
	
	
	
	@Test
	public void test06(){
		
	String words="�ȶ��� �����  ʢ���";
	String[]word=new String [23];
	System.out.println("���ǰ"+words);
	word=words.split(" ");
	System.out.println("��ֹ�");
	for(int i=0;i<word.length;i++){
		
		System.out.println(word[i]);
	}
		
		
		
	}
	
	@Test
	public void test05(){
		String a="Verify.java";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("���뽻��ҵϵͳ");
		System.out.println("�����ļ�����");
		String name=sc.next();
		System.out.println("����������");
		String email=sc.next();
		//�ж�java�ļ���
		boolean one=false;
		boolean two=false;
		
		
        int index=name.lastIndexOf(".");//������
        if(index!=-1&&index!=0&&name.substring(index+1, name.length()).equals("java")){
            one=true;
        	System.out.println("��������ȷ");
            	
        }else{
        	System.out.println("�������");
        }
        if(email.indexOf("@")!=-1&&email.indexOf(".")!=-1&&email.indexOf("@")<email.indexOf(".")){}
        
		
		
		
	
	}
	
	
	
	
	
	@Test 
	public void test04(){	
		
		String a="qwertyuio";		
		//System.out.println(a.indexOf('q'));
		//System.out.println(a.lastIndexOf("e"));
	//indexOf�����������д�������򷵻��������ݣ�����������-1��
		
		
		System.out.println(a.substring(4));
		//��ӡ������λ�ÿ�ʼ����β�����ݰ�������λ������
	
	
	
	
	}
	
	
	
	
	
	
	
	@Test
	public void test03(){
//length()��ȡ�ַ����ĳ���
//String s="afasgas";
//System.out.println(s.length);
		
		String a="java";
		//String b="java";
		//System.out.println(a==b);
		
		String c=new String("java");
		System.out.println(a.equals(c));
		
		

		
		
	}
	
	
	
	@Test
	public void test02(){
		
		/*Integer i=Integer.valueOf(23);
		Double a=Double.valueOf(123.2);
		Boolean b=Boolean.valueOf(true);
		Character c=Character.valueOf('��');
		System.out.println(i+""+a+b+c);*/
		
		
		
		Integer a=new Integer(12);
		int Value=a.intValue();
		
		
		
		Double i=new Double(12.4);
	     double doubleValue=i.doubleValue();
		System.out.println();
		
		
		//Integer i=5  װ��
		//int a=i  ����
		
		
	}
	
	@Test
	public void test01(){
		
		Integer a=new Integer("23");
		Double b=new Double("12.3");
		Boolean c=new  Boolean("true");
		Character d=new Character('��');
		
		String e =new String("�ҵ������ɽ�����������ǵ�");
		
		System.out.println(a+" "+b+""+c+""+d+""+e);
		
		
		
		
	}
	

}
