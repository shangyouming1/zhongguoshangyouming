package bao4;

import java.util.Date;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

public class Text {
	
	@Test
	public void test01(){
		//ClassCastException   类型转换异常
		String s=new String("sss");		
		Object obj=s;
		Date date=(Date)obj;
		System.out.println(date);
		
		
		
		
		
	 //ArrayIndexOutOfBoundsException  小标越界异常		
		
		int arr[]=new int[1];		
		arr[0]=10;
		arr[1]=23;
	System.out.println(arr[1]);
	
	
	 //NullPointerException  控指针异常
    //int[]arr=null;
	//System.out.println(arr1);
	
	}


    




}
