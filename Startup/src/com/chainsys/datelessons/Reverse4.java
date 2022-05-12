package com.chainsys.datelessons;

import java.util.Scanner;

public class Reverse4 {
 
        
        public static void reversee()
        {
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter a sentence");
                String first= sc.nextLine();
                String sentence ="";
                try {
                        sentence=sc.nextLine();
                }
                finally {
                        sc.close();
                }
                for(int i=first.length()-1;i>=0;i--)
                {
                        sentence=sentence+first.charAt(i);
                }
                System.out.println(sentence);
        }
}


