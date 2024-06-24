import java.util.Scanner;
public class LargestArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		// declare an array
		//data type array variable= new data type[size of array]
		
		float marks[] = new float[5];
		
		/*for(float mark: marks) {
			System.out.println(mark);
		}
		System.out.println("--------------------------");*/
		
		// read the values using the for-loop
		for(int index=0;index<marks.length; index++) {
			System.out.println("Enter the mark for index " + index + ":");
			marks[index]=scnr.nextFloat();
		}
		float large; 
		large = marks[0];
		for(int counter = 1; counter < marks.length;counter ++) {
			if(large < marks[counter]) {
				large = marks[counter];
			}
		}
		System.out.println("Largest Element in an Array is : " + large);

	}

}
