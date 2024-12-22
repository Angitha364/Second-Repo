package collectionAssig;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListAssign {

	public static void main(String[] args) {
		
		//program to create a new array list, add some colors (string) and print out the collection
		List<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("black");
		colors.add("purple");
		colors.add("violet");
		colors.add("green");
		System.out.println("colors in the list:" + colors);
		
		//program to retrieve an element (at a specified index) from a given array list.
		System.out.println("Element at index 1 is:" + colors.get(1));
		
		
		//program to iterate through all elements in a array list.
		
		Iterator<String> itr = colors.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.remove();//to remove array
		}
		System.out.println(colors);
		
	//program to remove the third element from a array list.
	List<String> colors1= new ArrayList<String>();
	colors1.add("red");
	colors1.add("blue");
	colors1.add("black");
	colors1.add("purple");
	colors1.add("violet");
	colors1.add("green");
	System.out.println(colors1);
	colors1.remove(2);
	System.out.println("After removing the third element: " +colors1);
	
	//program to search an element in a array list
	boolean containsBlue = colors1.contains("blue");
	if(containsBlue)
	{
		System.out.println("The list contains blue");
	}else {
		System.out.println("The list doesnot contain blue");
	}
	
}
}
