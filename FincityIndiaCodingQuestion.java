package practice;

//importing required libraries
import java.util.Scanner;

public class FincityIndiaCodingQuestion {
	
public static void main(String[] args)
{
	//Creating scanner object
	Scanner sc=new Scanner (System.in);
	System.out.print("enter number of patients :");
	//getting input number of patients
	int patients=sc.nextInt();
	System.out.print("enter number of steps :");
	//getting input step size
	int steps=sc.nextInt();
	//class object creation to call function
	FincityIndiaCodingQuestion fi=new FincityIndiaCodingQuestion();
	//getting output
	System.out.println("Steps required by batman are : "+fi.findNumOfStepsRequired(patients, steps));
	return;
}
public int findNumOfStepsRequired(int patients,int steps)
{
	int requiredSteps=0;
	//iterating through number of patients
	for(int i=1;i<patients;i++)
	{
		int temp=i*steps;
		requiredSteps=requiredSteps+temp;
	}
	return requiredSteps;
}

}
