package com.chainsys.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListArrayDemo {

	public static void main(String[] args) {
		lessonArrayList1();
	}
public static void lessonArrayList1() {
	ArrayList<Emp> EmpArrayList=new ArrayList<Emp>(30);
	System.out.println("InitiempArrayList size of empArray:" +EmpArrayList.size());
	try {
		for (int i=0; i<9; i++) {
			Emp e1=new Emp(i);
			e1.Name="Emp" + i;
			EmpArrayList.add(e1);//doubt
			}
		System.out.println("size of empArrayList after additions: "+EmpArrayList.size());
		Emp e3=(Emp) EmpArrayList.get(4);
		System.out.println("size of empArrayList after additions: "+EmpArrayList.size());;
		 
		EmpArrayList.add(new Emp(4));
		System.out.println("Freq of [Emp id-4] in ArrayList- "+Collections.frequency(EmpArrayList,e3));
		Iterator<Emp>empIterator=EmpArrayList.iterator();
		while(empIterator.hasNext()){
			Object element=empIterator.next();
			Emp e1=(Emp) element;
			System.out.println("\t" +e1.getId() +""+e1.Name);
		}
		
	}catch (Exception err) {
		System.out.println("ERROR!!! "+err.getMessage());
	} 
}
}
