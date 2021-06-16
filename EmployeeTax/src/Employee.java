//In this class we will ask the user to input their PPS
//Number as well as their Overtime Hours.



import java.util.InputMismatchException;
public class Employee {



	static byte OvertimeHours;
	static double OverTimePay;
	static boolean again=true;
	static String PpsNo;
	static double TaxAmount;
	static double PrsiAmount;
	static double PreTaxPay;
	static double AdditionalPay;
	static double BasicPay;
	static double ScriptTotal;
	static double AfterTaxPay;


	public void GetPPS () {
		//In This method we will ask the user to input their PPS number
		while(again) {
			try {
				System.out.println("Please Enter your PPS Number: ");
				PpsNo = Main.sc.nextLine ();
				//PpsNo = Main.sc.nextLine ();
				again=false;
			}

			catch(InputMismatchException ex) {
				System.out.println("Error ");
				Main.sc.next();
			}
		}
	}
	public void calcTax () {
		//In this method we will calculate the Amount of Tax deducted and calculate the final take home pay
		if (PreTaxPay<=40000)
			TaxAmount = 40000*0.22;

		else 
			TaxAmount = 40000*0.22 + (PreTaxPay-40000)*0.42;


		PrsiAmount = PreTaxPay*0.04;

		AfterTaxPay=PreTaxPay-TaxAmount-PrsiAmount;
		
	}
	public void Payslip(byte empNo) {
		//Here we will print out a Payslip containing all of the details we have asked the user and calculated
		//double PreTaxPay=OverTimePay+AdditionalPay+BasicPay;

		System.out.println("\n\n\t\t        Payslip");
		System.out.println("\n\tYour PPS Number is:          "  + PpsNo);
		System.out.println("\n\tYour Additional Pay is:      " + Main.moneyFormat.format(AdditionalPay));
		if (empNo==1)	{	
			System.out.println("\n\tYour Overtime Pay is:        " + Main.moneyFormat.format(OverTimePay));	
			System.out.println("\n\tYour Script Pay is:          " + Main.moneyFormat.format(ScriptTotal));
		}
		System.out.println("\n\tYour Pre Tax Pay is:         " + Main.moneyFormat.format(PreTaxPay));
		System.out.println("\n\tYour PRSI Deducted is:       " + Main.moneyFormat.format(PrsiAmount));
		System.out.println("\n\tYour Total Tax Deducted is:  " + Main.moneyFormat.format(TaxAmount));
		System.out.println("\n\tYour Take Home Pay is:       " + Main.moneyFormat.format(AfterTaxPay));

	}


	
}
