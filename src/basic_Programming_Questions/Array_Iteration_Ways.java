package coding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_Iteration_Ways {
	
public static void main(String[] args) {
	ArrayList<String> tvseries = new ArrayList<String>();
	tvseries.add("F.R.I.E.N.D.S");
	tvseries.add("Sherlock Holmes");
	tvseries.add("Game of Thrones");
	tvseries.add("How I met your Mother");
	tvseries.add("Prison Break");
	
	
		System.out.println("*****using For each and lamda expression*******");
	
	tvseries.forEach(shows ->{
		System.out.println(shows);
	});
	
	System.out.println("****Using Iterator ********");
	
	Iterator<String> it = tvseries.iterator();
	while(it.hasNext()) {
		String shows = it.next();
		System.out.println(shows);
	}
	
	
	System.out.println("*********Iterator & ForEachRemaining()  ********");
	it = tvseries.iterator();
	it.forEachRemaining(show ->{
		System.out.println(show);
	});
	
	System.out.println("*********For each loop  ********");
	for(String show : tvseries ) {
		System.out.println(show);
	}
	
	System.out.println("*********Simple For loop with index/order ********");
for(int i=0;i<tvseries.size();i++)
{
	System.out.println(tvseries.get(i));
}

System.out.println("*********ListIterator() to traverse in both direction ********");
ListIterator <String> tvseriesListIterator = tvseries.listIterator(tvseries.size());
while(tvseriesListIterator.hasPrevious()) {
	String show= tvseriesListIterator.previous();
	System.out.println(show);
	
}

}
}
