package com.chainsys.variables;

public class variables {

			
			public static void testGlobalVariable()
			{
				//display the value of static field
				//value is zero (default value)
				//DataA is accessed without creating an object
				System.out.println("DataA: " + demoa1.DataA);
				//display the value of immutable field
				//this is not possible  without an object
				//System.out.println("DataB: " + Startup.DataB);
				//display the value of constant field
				
				System.out.println("DataC: " + demoa1.DataC);
				//modifying value of the static field DataA
				demoa1.DataA=2345;
				System.out.println("DataA: " + demoa1.DataA);
				//modifying value of the static field DataC
				//ERROR: The final field Startup.DatC cannot be assigned
				//Startup.DataC=2345;
			}

		
		
	}


