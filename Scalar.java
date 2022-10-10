/*
 * Take in user input of coridnates
 * calculate them into a vector
 * by multiplying one row across 
 * the next but switch them around
 * to get the smallest possible vector
 */

import java.util.Arrays;
import java.util.Scanner;

public class Scalar{
	public static void main(String args[]) {
		int counter = 0;
		int testCases;
		int numCordinates;
		int vectorOne;
		int VectorTwo;
		
		int[] myList = {};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many test cases");
		testCases = input.nextInt();
		
			while(counter < testCases) {
				System.out.println("How many cordinates");
				numCordinates = input.nextInt();
				
				int listOne[]; 
				int listTwo[];
				listOne = new int [numCordinates];
				listTwo = new int [numCordinates];	
					//input x codrinates
					for(int i = 0; i < numCordinates; i++) {
						System.out.println(" x cordinate");
						listOne[i] = input.nextInt();
					}	
					//input y cordinates
					for(int j = 0; j < numCordinates; j++) {
						System.out.println(" y cordinate");
						listTwo[j] = input.nextInt();
						
					}				
					
					System.out.println("The smallest vector is: " + calcSmallestVector(listOne,listTwo,numCordinates));
					counter++;
			}
	}
	//------------------
	public static int calcSmallestVector(int[] listOne, int [] listTwo,int numCordinates) {
		Arrays.sort(listTwo);
		Arrays.sort(listOne);
		int sum = 0;
		int k = numCordinates-1;
		for(int i = 0; i < numCordinates; i++) {
			sum+=(listOne[i]*listTwo[k]);
			
			k--;
			
		}
		return sum;
	}
}
