package polymorphism;

public class SBIbank extends Bank{
	
	float rateOfInterest=5;
	float accountBalance;
	float interest;
	
	/*polymorphism method */
	 public void calculateInterest() {
	    	System.out.println("Interest is calculated here...");
	        interest=accountBalance*rateOfInterest;   
	 
	 }

}
