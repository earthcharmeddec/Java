import java.io.*;
import java.util.*;
/**
* Finds and prints the minimum, maximum, sum, average, and the count of integers
* in a provided text file.
* @author Santhiya Holmes
*/
public class ProcessNumbers {

	/**
	* Calls its method to obtain the file name and passes to another method
	* @param args Command line arguments (not used)
	*/
	public static void main (String [] args) throws FileNotFoundException{
		String fileName = getFileName();
		readFile(fileName);
	}
	/**
	* Obtains the file name from the user and checks its existence
	* @return fileName
	*/
	public static String getFileName() {
		Scanner input= new Scanner(System.in);
		String fileName = "";
		File f = null;
		 do{
			System.out.print("Please enter the file name: ");
			fileName = input.next();
			f = new File(fileName);	
			try { 
				Scanner fileInput = new Scanner (f);
			}
			catch(FileNotFoundException e) { 
				System.out.println("File doesn't exist");
			}
		}while (!f.exists());
		return fileName;
	}
	/**
	* Searches and find the maximum, minimum, and the integer values. Then, counts them, sums them up,
	* finds the average. These results are then displayed.
	* @param fileName name of the file
	* @throws FileNotFoundExcetion 
	*/
	public static void readFile(String fileName) throws FileNotFoundException {
		int sum = 0;
		int max = Integer.MIN_VALUE;		 	
		int min = Integer.MAX_VALUE;
		int count = 0;
		double average;
		Scanner data = new Scanner(new File(fileName));
		while (data.hasNext()) {
				if (data.hasNextInt()) {
					int number = data.nextInt();
					sum += number;
					if (number < min) {
						min = number;
					}
					if (number > max) {
						max = number;
					}
					count++;
				}
				else {
					data.next();
				}
		}
	average = sum/((double)(count));
	
	System.out.println("Maximum = " + max);
	System.out.println("Minimum = " + min);
	System.out.println("Sum = " + sum);
	System.out.println("Count = " + count);
	System.out.printf("Average = %.2f \n" , average);
	}
}