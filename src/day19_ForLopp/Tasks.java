package day19_ForLopp;

public class Tasks {
	
	public static void main(String[] args) {
		
		// task01
		
	//	for(int i = 1; i <= 10; i++) {
	//		System.out.println("the square of "+ i + " is: " + (i * i) );
	//	}
		
		
		// task02
		for(int i = 1; i <= 32; i++) {
			
			if(i %2 == 0) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		
		
		// task03:
		for(int i = 1; i <= 32; i++) {
			
			if(i %2 == 1) {
				System.out.print(i+" ");
			} 
			
		}
		System.out.println();
		
		String str = "Cybertek";
		//			  01234567
		//	"avaJ"
		String Rev =""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
		
		String Reversed ="";
		for(int i = str.length()-1 ; i >= 0; i--) {
			Reversed += str.charAt(i);
		}
		
		System.out.println(Reversed);
	
	System.out.println("====================================");	
	/*
	  1. find the sum of all the numbers between 1 to 1000
	  2. find the sum of all even numbers between 1 to1000
	  3. find the sum of all odd numbers between 1 to 1000
	
	
	 int sum =1+2+3+4=5...1000;
	int sum=0;
	for (int i = 0; i < 1001; i++) {
		if(i%2==0) {
		 sum=sum+i;
		}
	}
	System.out.println(sum);
	
		
		
		
	}
 */
	/*
	 1. write a java program that can count how many time 
	 	the word "book" is appeared in a String
	    Ex:
		input: I like books, I have books, I need book
		output: 3
	 */
	
	String words ="Cybertek is school, Cybertek is great, I love Cybertek";
	int c=0;
	for (int i = 0; i < words.length()-7; i++) {
		if(words.substring(i,i+8).equals("Cybertek")) {
			c++;
		}
		
	}
	System.out.println(c);

	
	
	String s="aabbcc";
	String d="";
	for(int i=0;i<s.length();i++) {
		if(!d.contains(""+s.charAt(i))) {
			d+=s.charAt(i);
		}
	}
	System.out.println(d);
}
}