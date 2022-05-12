package firstproject;

import java.util.ArrayList;
import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		int a[]=new int[5];


ArrayList<Integer> alist=new ArrayList<Integer>();
			
for(int i=1; i<=10; i++) 
alist.add(i);
System.out.println(alist);
	alist.add(111);
	System.out.println(alist);
	System.out.println(alist.get(5));//change value
	alist.remove(3);
	alist.set(0,555);
	System.out.println(alist);
	ArrayList slist=new ArrayList();
	slist.add("lio");
	slist.add(101);
	slist.add('A');
	
	System.out.println(slist);
	for(int i:alist)
		System.out.println(i);
	
	  Iterator<Integer> i=alist.iterator();
	 
	System.out.println("Aravinth00");
	System.out.println(i.next());
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
System.out.println("\tAravinth chainsys");
System.out.println("\bAravinth chainsys");
System.out.println("\nAravinth chainsys");
System.out.println("\rAravinth chainsys");
System.out.println("\'Aravinth chainsys");
System.out.println("\"Aravinth chainsys");
System.out.println("\\Aravinth chainsys");
boolean x=true;
System.out.println("the value is "+x);
long x1=90l;
System.out.println(x1);
short x2=12349;
System.out.println(x2);
	}
}

