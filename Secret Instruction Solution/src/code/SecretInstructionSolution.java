package code;

import java.util.Scanner;

public class SecretInstructionSolution {

	public static void main(String[] args) {

		/* resize array 
		 * int [] array1 = new int[10];
		 * int [] array2 = new int[array1.length+1];
		 * for(int x = 0; x <array1.length; x++)
		 * 		array2[x] = array1[x];
		 * array1 = array2; taking name away from object and attach to new one 
		 */
		
		Scanner input = new Scanner(System.in); 
		String[] words = new String[1000000]; //any large number 
		int count = 0;
		
		do 
		{
			words[count] = input.next();
			count++;
			
		}while( !words[count-1].equals("99999") );

		String direction = "";
		
		for(int x = 0; x < count; x++)
		{
			int number1 = words[x].charAt(0) - 48;
			int number2 = words[x].charAt(1) - 48;
			
			if(number1 + number2 == 0)
			{
				
			}
			else if( (number1 + number2) % 2 == 0)
			{
				direction = "left ";
			}
			else
			{
				direction = "right ";
			}
			
			String secondPart = words[x].substring(2);
			
			if( !words[x].equals("99999") )
			{
				System.out.println(direction + secondPart);
			}
		}
		
		
	}

}
