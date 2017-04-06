import javax.swing.JOptionPane;
import java.util.Scanner;

public class Fibonacci_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Gathering Data		
		//---
		int fibVal = 0;
		int fibIteration = 0;
		
		// Cleaning the Base Value
		do{
			
			String userInput1 = JOptionPane.showInputDialog("Please input starting integer for Fibonacci sequence (Minimum 1, Maximum 10000): ");
			userInput1 = userInput1.replaceAll("[^0-9]", "");
			
			if(userInput1 == null || userInput1.isEmpty() || Integer.parseInt(userInput1) <= 0 || Integer.parseInt(userInput1) > 10000){
				
				//Improper Entry
				JOptionPane.showMessageDialog(null, "Invalid Value!", "InfoBox: Starting Value", JOptionPane.INFORMATION_MESSAGE);

			}else{

				fibVal = Integer.parseInt(userInput1);

			}
			
		} while (fibVal <= 0 || fibVal > 10000);
		
		// Cleaning the Iteration Value
		do{
			
			String userInput2 = JOptionPane.showInputDialog("Please input number of positions out for the Fibonacci sequence (Minimum 1, Maximum 12): ");
			userInput2 = userInput2.replaceAll("[^0-9]", "");
			if(userInput2 == null || userInput2.isEmpty( ) || Integer.parseInt(userInput2) <= 0 || Integer.parseInt(userInput2) > 12){
				
				//Improper Entry
				JOptionPane.showMessageDialog(null, "Invalid Value!!", "InfoBox: Starting Value", JOptionPane.INFORMATION_MESSAGE);
			
			}else{
				
				fibIteration = Integer.parseInt(userInput2);
			}
			
		} while (fibIteration <= 0 || fibIteration > 12);
		//---
		
		// Processing Data
		//---
		// Establish Variables for Processing
		int fibWorkingVal1 = fibVal;
		int fibWorkingVal2 = 0;		
		int fibAnswer = 0;
		int counter = 1;
		
		//Establish Iterative Loop
		do{
			//Get current answer
			fibAnswer = fibWorkingVal1 + fibWorkingVal2;
			//Set up for next iteration
			fibWorkingVal2 = fibWorkingVal1;
			fibWorkingVal1 = fibAnswer;
			
		} while(++counter < fibIteration);
		//---
		
		// Return Data
		//---
		JOptionPane.showMessageDialog(null, "The Final Answer in Position: " + fibIteration + " is: " + fibAnswer, "InfoBox: Final Value in Position: " + fibIteration, JOptionPane.INFORMATION_MESSAGE);
		//---
	}

}
