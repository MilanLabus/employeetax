//Author: Milan Labus
//Class: CC
//Date: 06/04/2020

//this Program will ask the user to select their Occupation
//as either Principal or Teacher, Then it will ask the user to 
//input their PPS number and  ask the user to select
//How many points they got on the scale, How many Overtime hours they
//worked and how many Scripts they have corrected.
//Finally the Program will output a Payslip containing the PPS number,
//Additional Pay, Overtime Pay, Script Pay, PreTax Pay, PRSI deducted,
//Total Tax Deducted and the Take Home Pay.

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	static Scanner sc = new Scanner(System.in);
	static DecimalFormat moneyFormat = new DecimalFormat ("�#,##0.00");



	public static void main(String[] args) {
		
		String Occupation;
		boolean again=true;

		//Here the Program asks the User to select their Occupation
		while(again) {
			try {
				System.out.println("\n\nPlease select your occupation: ");
				System.out.println("T:Teacher , P:Principal Or X to Exit=>");
				Occupation= sc.nextLine ();

				switch (Occupation.toUpperCase()) {
				case  "T":
				Teacher TeacherObject = new Teacher ();
				TeacherObject.GetPPS();
				TeacherObject.Points();
				TeacherObject.OverTime();
				TeacherObject.ExamPapers();
				TeacherObject.Tax();
				TeacherObject.Payslip((byte) 1); break;
				case  "P": 
				Principal PrincipalObject = new Principal ();	
				PrincipalObject.GetPPS();
				PrincipalObject.Points();
				PrincipalObject.Tax(); 
				PrincipalObject.Payslip((byte) 2); break;
				case "x":
					System.out.println("\tThank you for using the Program");
					break;
				default:
					System.out.println("\t\nError in input: Choice must be A, B, or X");
					continue;
				}


			}
			catch(InputMismatchException ex) {
				System.out.println("Error\n ");
				sc.next();
			}
		}

	}

}
