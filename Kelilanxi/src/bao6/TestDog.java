package bao6;




import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TestDog {
	
	
	
	
	@Test
	public void test05(){
		 Dog ouou=new Dog("żż","ѩ����");
			Dog feifei=new Dog("�Ʒ�","����");
			Dog yaya=new Dog("ѾѾ","��԰Ȯ");
			Dog meimei=new Dog("����","��ʿ��");
			
			Map map=new HashMap();
			
			map.put(ouou.getName(), ouou);
			map.put(feifei.getName(), feifei);
			map.put(yaya.getName(), yaya);
			map.put(meimei.getName(), meimei);
			
		  Set keyset=map.keySet();
		  
		  
		  for(Object key:keyset){//�������ͣ������������Ķ���
			  Dog dog=(Dog)map.get(key);
			  System.out.println(dog.getName()+" "+dog.getStrain()+" ");
			  
		  }
		  
		  
		  
		 /* Iterator it=keyset.iterator();//����������
		  while(it.hasNext()){
			  String key=(String)it.next();
			  Dog dog=(Dog)map.get(key);
					  System.out.println(dog.getName()+" "+dog.getStrain()+" ");
		  }		*/
		  
		  
	}
	
	
	
	
	
	@Test
	public void test03(){
		
		
		Map map=new HashMap();
		map.put("CN", "�й�");
		map.put("JP", "�ձ�");
		map.put("USA", "����");
		//��ȡ���е�key
		System.out.println(map.keySet());
		System.out.println();
		System.out.println(map.values());
		System.out.println();
		
	  int size=map.size();
		System.out.println(size);
		System.out.println();
		
		
	    map.remove("JP");
      boolean containsKey=map.containsKey("JP");	
		System.out.println(map.keySet());
	}
	
	
	
	
	@Test
	public void test02(){
		
		 Dog ouou=new Dog("żż","ѩ����");
			Dog feifei=new Dog("�Ʒ�","����");
			Dog yaya=new Dog("ѾѾ","��԰Ȯ");
			Dog meimei=new Dog("����","��ʿ��");
			
	LinkedList list= new LinkedList();
			
			
			list.add(ouou);
			list.add(feifei);
            list.addFirst(yaya);
	for(int i=0;i<list.size();i++){
		Dog dog=(Dog) list.get(i);
		System.out.println(dog.getName()+""+dog.getStrain()+" ");	
	}	
		
	System.out.println();
	System.out.println(list.getFirst());
	System.out.println();
	list.removeLast();
	
	for(int i=0;i<list.size();i++){
		Dog dog=(Dog) list.get(i);
		System.out.println(dog.getName()+""+dog.getStrain()+" ");	
	}	
		
	
	
	}
	
	
	
	
	@Test 
	public void test01(){
		
		
    Dog ouou=new Dog("żż","ѩ����");
	Dog feifei=new Dog("�Ʒ�","����");
	Dog yaya=new Dog("ѾѾ","��԰Ȯ");
	Dog meimei=new Dog("����","��ʿ��");
	
	List list= new ArrayList();
	
	list.add(ouou);
	list.add(feifei);
	list.add(yaya);
	
	int s = list.size();
	System.out.println(s);
	
	for(int i=0;i<list.size();i++){
		
		Dog dog=(Dog)list.get(i);
		System.out.println(dog.getName()+" "+dog.getStrain()+" ");
	
	
	
	
	}
	
	
		
		
		
	}
	
	

}
