//In This Class we will ask the Teacher for their Points,
//as well as calculating their Pretax, the Prsi paid,
// Tax Paid, Exam Papers corrected and After tax Pay. Finally it will output a Payslip
//Containing all of that information


import java.util.InputMismatchException;
public class Teacher extends Employee {

	//Here i set the value for the 	Basic Pay	
	static byte PointsOnScale;	
	static int ExamScriptAmount;
	//Here I set the price per Script
	static double ScriptRate=10.18;
	boolean again=true;

	Teacher() {
		BasicPay=40123;
	}

	public void Points() {
		//In this method we will ask the user to select how many points they got on the scale
		//and whatever they select will set the additional payment rate
		while(again) {
			try {
				System.out.println("Please select your points on the Scale: ");
				System.out.println("1 , 2, 3, 4 Or 0 to Exit=>");
				Byte PointsOnScale= Main.sc.nextByte ();

				switch (PointsOnScale) {
				case 1: AdditionalPay = 5120; break;
				case 2: AdditionalPay = 6789; break;
				case 3: AdditionalPay = 7999; break;
				case 4: AdditionalPay = 9000; break;
				case 0:
					System.out.println("\tGoodbye");
					break;

				default:
					System.out.println("\t\nError in input: Choice must be 1, 2, 3, 4  or X");
					continue;
				}
				again=false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Error\n ");
				Main.sc.next();
			}

		}


	}

	public void ExamPapers () {
		//Here we will ask the teacher to input how many exam papers they have corrected
		//and we will calculate the payment 		
		System.out.println("Please Enter the Amount of Exam Papers: ");
		ExamScriptAmount =Main.sc.nextInt();
		ScriptTotal = ExamScriptAmount*ScriptRate;


	}
	public void OverTime () {
		//In this method we will ask the user how many overtime hours they have worked
		//And calculate their overtime pay

		again=true;
		while(again) {
			try {
				System.out.println("Please Enter Number of OverTime hours: ");
				int OverTimeHours = Main.sc.nextInt ();
				OverTimePay = OverTimeHours*34.03;

				again=false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Error");
				Main.sc.next();

			}
		}

	}

	public void Tax() {
		//Here we will calculate the total tax deducted as well as the after Tax payment
		PreTaxPay=OverTimePay+AdditionalPay+BasicPay+ScriptTotal;
		calcTax();



	}

}

