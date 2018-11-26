package bao7;

import java.util.Random;
import java.util.Scanner;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

public class BaoZhuang {
	
	//当我们传入String类型的值作为参数的时候，引号里面的值需要包装类对应的基本数据类型 
	//当布尔类型的值传入包装类作为参数的时候，除了ture之外全是false
	
	
	   
	
	
	
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
		sb.append("王企鹅");
		System.out.println(sb);
		sb.insert(2, "啊给多少个");
		System.out.println(sb);
	}
	
	
	
	
	
	
	
	@Test
	public void test06(){
		
	String words="先而静 今天打  盛大积";
	String[]word=new String [23];
	System.out.println("拆分前"+words);
	word=words.split(" ");
	System.out.println("拆分狗");
	for(int i=0;i<word.length;i++){
		
		System.out.println(word[i]);
	}
		
		
		
	}
	
	@Test
	public void test05(){
		String a="Verify.java";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("进入交作业系统");
		System.out.println("输入文件名字");
		String name=sc.next();
		System.out.println("输入邮箱名");
		String email=sc.next();
		//判断java文件名
		boolean one=false;
		boolean two=false;
		
		
        int index=name.lastIndexOf(".");//包含点
        if(index!=-1&&index!=0&&name.substring(index+1, name.length()).equals("java")){
            one=true;
        	System.out.println("输入争正确");
            	
        }else{
        	System.out.println("输入错误");
        }
        if(email.indexOf("@")!=-1&&email.indexOf(".")!=-1&&email.indexOf("@")<email.indexOf(".")){}
        
		
		
		
	
	}
	
	
	
	
	
	@Test 
	public void test04(){	
		
		String a="qwertyuio";		
		//System.out.println(a.indexOf('q'));
		//System.out.println(a.lastIndexOf("e"));
	//indexOf如果包含我们写的类容则返回索引类容，不包含返回-1；
		
		
		System.out.println(a.substring(4));
		//打印从索引位置开始到结尾的类容包括索引位置类容
	
	
	
	
	}
	
	
	
	
	
	
	
	@Test
	public void test03(){
//length()获取字符串的长度
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
		Character c=Character.valueOf('好');
		System.out.println(i+""+a+b+c);*/
		
		
		
		Integer a=new Integer(12);
		int Value=a.intValue();
		
		
		
		Double i=new Double(12.4);
	     double doubleValue=i.doubleValue();
		System.out.println();
		
		
		//Integer i=5  装箱
		//int a=i  拆箱
		
		
	}
	
	@Test
	public void test01(){
		
		Integer a=new Integer("23");
		Double b=new Double("12.3");
		Boolean c=new  Boolean("true");
		Character d=new Character('好');
		
		String e =new String("我得体个数山豆根第三个是的");
		
		System.out.println(a+" "+b+""+c+""+d+""+e);
		
		
		
		
	}
	

}
