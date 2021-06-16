//In This Class we will ask the Principal for their Points,
//as well as calculating their Pretax pay and the Prsi paid
//and Tax Paid and After tax Pay. Finally it will output a Payslip
//Containing all of that information


import java.util.InputMismatchException;
public class Principal extends Employee{

	
	static double NumberOfTeachers;
	boolean again=true;

	Principal() {
		BasicPay=60000;
	}
	
	public void Points() {
		//In this method we will ask the user to select how many points they got on the scale
		//and whatever they select will set the additional payment rate
		while(again) {
			try {
				System.out.println("Please Enter the Number of Teachers you have in the School: ");
				System.out.println(" If 0-9 press A\n If 10-99 press B\n If 100-199 press C\n If over 200 press D or press X to exit");
				String NumberOfTeachers= Main.sc.nextLine ();



				switch (NumberOfTeachers.toUpperCase()) {
				case "A": AdditionalPay = 9310; break;
				case "B": AdditionalPay = 10432; break;
				case "C": AdditionalPay = 12238; break;
				case "D": AdditionalPay = 14360; break;
				case "x":
					System.out.println("\tGoodbye");
					break;

				default:
					System.out.println("\t\nError in input: Choice must be A, B, C, D  or X");
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

	public void Tax() {
		//Here we will calculate the total tax deducted as well as the after Tax payment

		PreTaxPay=OverTimePay+AdditionalPay+BasicPay;
		calcTax();


	}
	

}