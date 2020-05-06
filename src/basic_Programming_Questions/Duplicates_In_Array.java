package coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicates_In_Array {

	public static void main(String[] args) {
		String name[]= {"Java" , "ruby","js","python","Java"};
		//compare each element
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i].equals(name[j])) {
					System.out.println("Duplicate element is::" +name[i]);
				}
					
			}
		}
	//using HashSet:Stores unique values
	Set<String>Store=new HashSet<String>();
	for(String duplicate: name) {
	if(Store.add(duplicate)==false)
	{
		System.out.println("Duplicate element is::" +duplicate);
	}
	}
	
	//using hashmap:Duplicates are allowed , stores in the form of key value ,counter of occurance
	Map<String, Integer> obj = new HashMap<String, Integer>();
	for(String dup:name)
	{
		Integer count = obj.get(dup);
		if(count==null)
		{
			obj.put(dup, 1);
		
		}
		else
			obj.put(dup, ++count);
}

//get the values from this hashmap	
	
	Set<Entry<String,Integer>> entryset = obj.entrySet();
	
	for(Entry<String , Integer> entry :entryset)
	{
		if(entry.getValue()>1)
		{
			System.out.println("Duplicate element is ::" +entry.getKey());
		}
	}
	
	}
}
