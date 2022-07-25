package testprogram;

public class Stringqus {

	public static void main(String[] args) {
		


		      
		               
		                
		                String s="Tom And Jerry Are Good Friends";
		                int count=0;
		                String[]b=s.split(" ");
		                char[]k=s.toCharArray();
		                for(String i:b) {
		                        count++;
		                }
		                System.out.println("number of string is"+" "+count);
		                for(int i=k.length-1;i>=0;i--) {
		                        System.out.print(k[i]);
		                }
		        }
		}
	


