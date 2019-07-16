package howToDoInJava.javaCollections.arrayList.arrayListExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InitializeArrayList {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<String>();
		
	//------------1.1. Arrays.asList() – Initialize arraylist from array ------------
	System.out.println("1.1. Arrays.asList() – Initialize arraylist from array");	
		list = new ArrayList<>(Arrays.asList("g","h"));
	System.out.println(list);
		
		list.add("w");
	System.out.println(list);
		
	//1.2. List.of() – Immutable list
		
	
		List<String>	listing =  List.of("m","n");	
//		listing.add("p");     //java.lang.UnsupportedOperationException
//		listing.remove(1);	 //java.lang.UnsupportedOperationException
	System.out.println(listing);
	
		
		
		
		List<String> names = List.of("alex", "brian");
	System.out.println(names);	

		/*	List<String>	listing = (ArrayList<String>) List.of("m","n");
		java.lang.ClassCastException: 
		java.base/java.util.ImmutableCollections$List2 cannot be cast to 
		java.base/java.util.ArrayList
		*/
		
		
	//------------	2. Create ArrayList and add objects – ArrayList constructor	------------
		
     System.out.println( "2. Create ArrayList and add objects – ArrayList constructor	");
		list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
	System.out.println(list);
		
		HashMap <String, Integer> map = new HashMap<>();
		map.put("d", 4);
		map.put("e", 5);
		map.put("f", 6);
		
		//2. Add elements from other collection
		list.addAll(map.keySet());
		
	System.out.println(list);
	
	 //----------  3. Initialize arraylist of lists ----------// 
	    
		List<List<Integer>> marks = new ArrayList<>();
	    
		marks.add( Arrays.asList(10, 20, 30) );
		marks.add( Arrays.asList(40, 50, 60) );
		marks.add( Arrays.asList(70, 80, 90) );
		 
		for (List<Integer> mark : marks) {
		   System.out.println(mark);
	}
		
		
		
  }

}
