package day19_ForLopp;

import java.util.Iterator;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 
		 for( initialization; condition; iterator ) {
		 
		 			statements that we awanna repeat
		 			
		 	}
		 	
		 	initialization: starting point    int i = 10 ....
		 	Condition: created based on the initialization   i > 0 ...
		 	iterator: co-related to the condition.
		 	 		Needs to be capable enough to make the condition false
		 	 		
		 	 if the condition of loop is true, the loop will be keep executed		
		 	
		 
		
		for(double i = 1; i <= 10 ; i += 2 ) {
			System.out.println("Hello World "+i);
		}
		
		
		
		for(int i=1;i<11;i++) {
			System.out.println(i*i);
		}
		
		for (int i = 0; i < 33; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
			
		}
		*/
		String str="java";
		String revers="";
		
		for (int i = str.length()-1; i >= 0; i--) {
		revers+=	str.charAt(i);
			
		}
		System.out.println(revers);
	}
	
}