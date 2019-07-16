package test.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMain {
	public static void main(String args [])
	{
	  A a= new A(10,12.2,"a");	
	  A a1= new A(20,12.1,"a1");
	  A a2= new A(-90,2.1,"a2");
	  
	  A b1 = new A(1);
	  A b2 = new A(2);
	  A b3 = new A(4);
	  A b4 = new A(3);
	  A b5 = new A(0);
	  
	  List<A> list = Arrays.asList(a,a1,a2);
	  
	  List<A> blist = Arrays.asList(b1,b2,b3,b4,b5);
	  System.out.println(list);

	  Collections.sort(list);
	  System.out.println(list);

	  Collections.reverse(list);
	  System.out.println("reverse "+list);
	 
	  Collections.sort(blist);
	  
	  int [] arr = {1,2,3,4,1,2,5};
	  
	  
	  List<Integer> listIntegers = Arrays.asList(1, 6, 9, 3, 2, 0, 8, 4, 7, 5);
	 
	  System.out.println("Before sorting: " + listIntegers);
	  

String [] array = {"ram" ,"aam" ,"am" ,"bat"};
List <String> strinLlist = Arrays.asList(array);
Collections.sort(strinLlist);
System.out.println(strinLlist);

int n = 2354;
String s = String.valueOf(n);

char [] charArray = new char [s.length()];
System.out.println("n   = "+n);

for(int i=s.length()-1,j=0;i>= 0 ;i--,j++){
	
	charArray[j]=(s.toCharArray())[i]; 
}

System.out.println("n  "+String.valueOf(charArray));




	}

}
