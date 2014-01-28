
/**
 * Calculates and displays the final amount after 5 years for deposits 
 * ranging from $1000 – $20000 with a 1% annual interest rate
 * with:
 *  a) no compounding, 
 *  b) monthly compounding, and 
 *  c) continuous compounding of interest.
 * @author Santhiya Holmes
 */
public class DepositCalculator {
	
	 public static final double ANNUAL_INTEREST_RATE = 1.0;
	  public static final int NUMBER_OF_YEARS = 5;
	  public static final int MONTHS_PER_YEAR = 12;
	  public static final int LOW_DEPOSIT_AMOUNT = 1000;
	  public static final int HIGH_DEPOSIT_AMOUNT = 20000;
	  public static final int DEPOSIT_AMOUNT_INCREMENT = 1000;
	  /**
	  *Displays the table with all the values calculated 
	  *@param args command line arguments (not used)
	  */
	public static void main(String[] args) {
	System.out.println();
		System.out.println("Final amount (1% annual interest, 5 years)");
		System.out.println();
		System.out.println("Initial	            Compounding 		");
		System.out.println("Deposit	   None       Monthly    Continuous");
		System.out.println("-------	   ----       -------    ----------");
		
		
		
		for (int i=LOW_DEPOSIT_AMOUNT;i<=20000; i=i+DEPOSIT_AMOUNT_INCREMENT)
		{
			double none = calculateAmountNoCompounding(i, ANNUAL_INTEREST_RATE, NUMBER_OF_YEARS);
			double monthly = calculateAmountMonthlyCompounding(i, ANNUAL_INTEREST_RATE, NUMBER_OF_YEARS);
           double continual = calculateAmountContinuousCompounding(i, ANNUAL_INTEREST_RATE, NUMBER_OF_YEARS);
			System.out.print(i +  "  ");
			System.out.printf("%10.2f %s %10.2f %s %10.2f", none, " ",  monthly, " ", continual);
			System.out.println();
		}
		}
		
	/**
	   * Calculates final amount of deposit with no compounding of interest
	   * 
	   * @param deposit deposit amount
	   * @param annualInterestRate annual interest rate
	   * @param numberOfYears number of years
	   * @return final amount
	   */   
	  public static double calculateAmountNoCompounding(double deposit, double annualInterestRate,
	                                                    int numberOfYears) {
		  annualInterestRate = annualInterestRate / 100;
		 double finalAmount = deposit * (1 + (annualInterestRate*numberOfYears));			
		 return finalAmount;
	  }
	

/**
 * Calculates final amount of deposit with monthly compounding of interest
 * 
 * @param deposit deposit amount
 * @param annualInterestRate annual interest rate
 * @param numberOfYears number of years
 * @return final amount
 */   
public static double calculateAmountMonthlyCompounding(double deposit, double annualInterestRate,
                                                       int numberOfYears) {
	annualInterestRate = annualInterestRate / 100;
	 double finalAmount = deposit * Math.pow((1 + (annualInterestRate/12)), 12*numberOfYears);
	  return finalAmount; 
}

/**
 * Calculates final amount of deposit with continuous compounding of interest
 * 
 * @param deposit deposit amount
 * @param annualInterestRate annual interest rate
 * @param numberOfYears number of years
 * @return final amount
 */  
public static double calculateAmountContinuousCompounding(double deposit, double annualInterestRate,
                                                          int numberOfYears) {
		annualInterestRate = annualInterestRate / 100;
	  double finalAmount = deposit * Math.exp(annualInterestRate*numberOfYears);
	  return finalAmount;
}
}