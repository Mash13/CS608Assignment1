import java.lang.Math;
import java.text.SimpleDateFormat;  
import java.util.Date; 

public class CS6081AMichaelAshikari {

	/**
	 * 
	 */
	public CS6081AMichaelAshikari() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date)); 
		
		System.out.println("Name: Mike Ashikari");
		
		System.out.println("Course #: CS 608");

		System.out.println("Assignment 1A");
		
		double num = 2;
		double ans = 1;
		double convDiv = 0;
		
		for (int i = 1; i <= 10000; i++) {
			
			ans = ans + (1/Math.pow(num,2));
			
			
			//Test to see if the series is convergent or divergent using the 10th and 11th numbers.
			if (i == 4998) {
				
				convDiv = ans;
				
				//System.out.println(ans);
				
			}
			
			if (i == 4999) {
				
				convDiv = ans - convDiv;
				
				//System.out.println(ans);
				
			}
			
			if (i == 1000) {
				
				System.out.println(ans + " 1000");
				
				
				
			}
			else if (i == 2000) {
				
				System.out.println(ans + " 2000");
				
				
				
			}
			else if (i == 3000) {
				
				System.out.println(ans + " 3000");
				
				
				
			}
			else if (i == 4000) {
	
				System.out.println(ans + " 4000");
				
				
	
			}
			else if (i == 5000) {
	
				System.out.println(ans + " 5000");
				
				
	
			}
			else if (i == 6000) {
	
				System.out.println(ans + " 6000");
				
				
	
			}
			else if (i == 7000) {
	
				System.out.println(ans + " 7000");
				
				
	
			}
			else if (i == 8000) {
	
				System.out.println(ans + " 8000");
				
				
	
			}
			else if (i == 9000) {
	
				System.out.println(ans + " 9000");
				
				
	
			}
			else if (i == 10000) {
	
				System.out.println(ans + " 10000");
				
				
	
			}
			
			
			
			num++;
			
		}
		
		if (convDiv < .0001) {
		
			System.out.println("The above series of numbers is convergent... Approx sum value = " + ans);
		
		}
		
		else {
			
			System.out.println("The above series of numbers is divergent");
		
		}
		
		System.out.println("Assignment 1B");
		
		double num2 = 3;
		double ans2 = 1;
		double convDiv2 = 0;

		
for (int k = 1; k <= 10000; k++) {
			
			ans2 = ans2 + (1 / num2);
			
			//Test to see if the series is convergent or divergent using the 10th and 11th numbers.
			if (k == 4998) {
				
				convDiv2 = ans2;
				
				//System.out.println(ans2);
				
			}
			
			if (k == 4999) {
				
				convDiv2 = ans2 - convDiv2;
				
				//System.out.println(ans2);
				
			}
			
			if (k == 1000) {
				
				System.out.println(ans2 + " 1000");
				
				
				
			}
			else if (k == 2000) {
				
				System.out.println(ans2 + " 2000");
				
				
				
			}
			else if (k == 3000) {
				
				System.out.println(ans2 + " 3000");
				
				
				
			}
			else if (k == 4000) {
	
				System.out.println(ans2 + " 4000");
				
				
	
			}
			else if (k == 5000) {
	
				System.out.println(ans2 + " 5000");
				
			
	
			}
			else if (k == 6000) {
	
				System.out.println(ans2 + " 6000");
				
				
	
			}
			else if (k == 7000) {
	
				System.out.println(ans2 + " 7000");
				
				
	
			}
			else if (k == 8000) {
	
				System.out.println(ans2 + " 8000");
				
				
	
			}
			else if (k == 9000) {
	
				System.out.println(ans2 + " 9000");
				
				
	
			}
			else if (k == 10000) {
	
				System.out.println(ans2 + " 10000");
				
	
			}
			
			num2 = num2 + 2;
			
		}
		


		if (convDiv2 < .0001) {

			System.out.println("The above series of numbers is convergent... Approx sum value = " + ans2);

		}

		else {
	
			System.out.println("The above series of numbers is divergent");

		}

	}

}
