package test.basic;

import java.util.Arrays;
import java.util.List;


public class A implements Comparable<A>{
	
	int    id;
	double age;
	String name;
	
	A(int id, double age,String name)
	{
		this.id =id;
		this.age =age;
		this.name = name;
	}
	
	A(int id)
	{
		this.id =id;
	}
	
	@Override
	public int compareTo(A obj) {	
		return this.id - obj.id ;
	}
	
	public String toString()
	{
		return "id "+id+" age "+age+" name "+name;
	}
	
	
}

class Sort{

	public static void main(String args [])
	{
	  A a= new A(10,12.2,"aa");	
	  A a1= new A(-20,12.1,"ab");
	  
	  List<A> list = Arrays.asList(a,a1);
	  System.out.println(list);

	  java.util.Collections.sort(list);
	  System.out.println(list);
	}
	
	
}