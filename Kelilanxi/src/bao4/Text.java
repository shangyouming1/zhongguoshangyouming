package bao4;

import java.util.Date;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

public class Text {
	
	@Test
	public void test01(){
		//ClassCastException   ����ת���쳣
		String s=new String("sss");		
		Object obj=s;
		Date date=(Date)obj;
		System.out.println(date);
		
		
		
		
		
	 //ArrayIndexOutOfBoundsException  С��Խ���쳣		
		
		int arr[]=new int[1];		
		arr[0]=10;
		arr[1]=23;
	System.out.println(arr[1]);
	
	
	 //NullPointerException  ��ָ���쳣
    //int[]arr=null;
	//System.out.println(arr1);
	
	}


    




}
