package com.client;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.CollectionType;

public class Test {
	public static void main(String[] args) {
		System.out.println("ssss");
		
		
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
		CollectionType c=(CollectionType)ap.getBean("c");
		
		List<String> c1 = c.getCities();
		Set<Integer>s1=c.getCode();
		Map<Integer, String> m1= c.getCountry();
		
		/* for(String ss:c1)
		 {
			 System.out.println(ss);
		 }
		 for(Integer ii:s1)
		 {
			 System.out.println(ii);
		 }
		
		 Set<Integer>se=m1.keySet();
		 for(Integer i:se)
		 {
//			 System.out.println(i);
			 String s=m1.get(i);
			 
			 System.out.println(s);
		 }*/
		
		/*
		 * c1.forEach(s->{ System.out.println(s); }); s1.forEach(ss->{
		 * System.out.println(ss); }); m1.forEach((k,v)->{ System.out.println(k);
		 * System.out.println(v); });
		 */
	
	
	Iterator<String>itr=c1.iterator();
	while(itr.hasNext())
	{
		String s=itr.next();
		System.out.println(s);
	}
	
	 
		
		
		
				}

}
