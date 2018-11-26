package bao8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.StandardSocketOptions;

import org.junit.Test;

public class Io {
	
	/*
	 * ����ڡ�TXT����ʹ���ַ���
	 * 
	 * �����ڡ�DOC���ֽ�����avi
	 * 
	 * 
	 * */
	
	@Test
	public void test24(){
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		
		try {
			fis=new FileInputStream("obj.txt");
			
			 ois=new ObjectInputStream(fis);
			 
			 String utf=ois.readUTF();
			 System.out.println(utf);
			 
			 
			 Person pen=(Person)ois.readObject();
			 System.out.println(pen);			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	@Test
	public void test25(){
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
		fos=new FileOutputStream(new File("Obj"));
			oos=new ObjectOutputStream(fos);
			oos.writeUTF("hehe");
			oos.flush();
			
			oos.writeObject(new Person("����",18));
						oos.flush();
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			
			try {
				fos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			try {
				oos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	
	
	}
	
	
	
	
	
	@Test
	public void test84(){
		
		File file=new File("aaa.txt");
		File file2=new File("bbb.txt");
		
		FileReader sr=null;
		FileWriter  sc=null;
		
		try {
					
			sr=new FileReader(file);
			sc=new FileWriter(file2);
			
			char cbu[]=new char[23];
			int len;
			while((len=sr.read(cbu))!=-1){
				sc.write(cbu,0,len);			
			}	
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}finally{
			
			try {
				sr.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
			try {
				sc.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}	
		
		
	}
	
	
	
	
	
	@Test
	public void test98(){
		
	 public void copyFile2(String src,String desc){
		
		 File file=new File("aaa.txt");
		File file2=new File("bbb.txt");
		
		FileInputStream fis=new FileInputStream(file);
		FileOutputStream fos=new FileOutputStream(file2);
		
	    BufferedInputStream bis=new BufferedInputStream(fis);	
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		
		byte[]buffer=new byte[23333];
		int len;
		while((len=bis.read())!=-1){
			
			bos.write(buffer, 0, len);
		}
		
		bos.close();
		bis.close(); 
		fos.close();
		fis.close();
	}
	
	}
	
	
	
	
	
	
	
	
@Test
public void test6(){
	
	File file=new File("aaa.txt");
	File file2=new File("bbb.txt");
	
	FileReader sr=null;
	FileWriter  sc=null;
	
	try {
				
		sr=new FileReader(file);
		sc=new FileWriter(file2);
		
		char cbu[]=new char[23];
		int len;
		while((len=sr.read(cbu))!=-1){
			sc.write(cbu,0,len);			
		}	
		
	} catch (Exception e) {
	
		e.printStackTrace();
	}finally{
		
		try {
			sr.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		try {
			sc.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
		
}
	
	
	
	
	
	@Test
	public void test07(){
		File file=new File("aaa.txt");
		FileReader sr=null;
		
		try {
		 sr=new FileReader(file);
			
		char cbuf[]=new char[23];	
			
		int len;
		while((len=sr.read(cbuf))!=-1){
			String str=new String(cbuf,0,len);
			System.out.println(str);
			
		}
					
		} catch (Exception e) {


			e.printStackTrace();
		}finally{try {
			sr.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		}
				
	}
	
	
	
	
	
	
	
	@Test
	public void test05(){
		
		FileInputStream fis =null;
		FileOutputStream fos=null;
		
		File file=new File("aaa.txt");
		File file2=new File("bbb.txt");
	
		
		try {
			
			fis= new FileInputStream(file);								
		    fos= new FileOutputStream(file2);			     
		    
		    byte buffer[]=new byte[23];
		     
		     int len;
			while((len=fis.read())!=-1){
				fos.write(buffer, 0, len);
			
				}
							    	 		
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			
			try {
				fis.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			try {
				fos.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	
	
	
	
	@Test
	public void test4(){
		FileOutputStream fos=null;
		
		//������
		
		File file=new File("bbb.txt");
		
	//������Ӧ����
		try {
			fos=new FileOutputStream(file);
			
			fos.write("qewqeqwrqw".getBytes());//�����������ַ�ת�����ֽ�
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}finally{try {
			
			fos.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}}
			
		
	}
	
	

	

	@Test
	public void test03(){
		
		
		File file=new File("aaa.txt");
				
		FileInputStream fis=null;
		try {
		
			 fis=new FileInputStream(file);
			
			byte buffer[]=new byte[34];
			
			/*int len=fis.read(buffer);
			while(len!=-1){
				for(int i=0;i<buffer.length;i++){
				  System.out.print((char)buffer[i]);
					len=fis.read(buffer);					
				}
			}/*/
			
			int len;
			while((len=fis.read(buffer))!=-1){
				//���ֽ�����ת�����ַ���
				String str= new String(buffer,0,len);
			System.out.println(str);
			}
			
			
					
		} catch (Exception e) {
		
			e.printStackTrace();
		}	finally{try {
			fis.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}	
		
		
	}
	
	
	
	
	
	
	
	
	
	/*
	 *���ķ���
	 *   ��������ݣ��������������
	 *   ��λ�֣��ַ������ֽ���
	 *   ��ɫ�֣��������ͻ�����
	 *   
	 * ���Ļ����ṹ��
	 *     �������                                             ������                                                       ������  
	 *     InputStream         FileInputStream         BufferedInput
	 *     OutputSteam          
	 * 
	 * */
	
	
	@Test
	public void test02(){
				
		FileInputStream fis=null;
		
		
		File file=new File("aaa.txt");
		//����File��
		
		try {			
			//�������ʵ���
			fis= new FileInputStream(file);
		//���Ĳ���
		int len=fis.read();
		
		while(len!=-1){
			System.out.print((char)len);
			len =fis.read();
			}
		
		} catch (Exception e) {
	
			e.printStackTrace();
		
		}finally{
			
			try {			
				fis.close();
				
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		};
		
			
		//�ر���
		

		
	}
	
	
	
	
	
	@Test
	public void test01(){
		
		File f1=new File("aaa");
		
		System.out.println(f1.isFile());
		System.out.println(f1.getName());
		System.out.println(f1.getPath());
		System.out.println(f1.getAbsoluteFile());
		System.out.println(f1.length());
		System.out.println(f1.exists());
		System.out.println(f1.isDirectory());
		System.out.println(f1.delete());
		
		
		
	}

}
