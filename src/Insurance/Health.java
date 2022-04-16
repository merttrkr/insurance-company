package Insurance;
import InsuredValues.*;

public class Health extends Insurance {
	 private InsuredValue insuredValue; //to make a connection between Insured values and Insurances
	 private double policycharge;
	 
	 
    public Health(Health originalHousehold) {//copy constructor
        super(originalHousehold);

    }

    public Health(InsuredValue insuredValue) {//full argument constructor
        super();
        this.insuredValue = insuredValue;
    }



    @Override
    public double calculatePolicyCharge() {
    double riskFactor = insuredValue.calculateRiskFactor();
   
      if ((riskFactor >50.00 && insuredValue.getYearOfInsurance()<3)) {
    	
        return 1000000000;
    }else {
    	 policycharge = getFixedFee() * (riskFactor * riskFactor * riskFactor)/208;
    	  return policycharge;}

      
    }
    
    @Override
    public String toString() { // prints the policy charge to console
    	return String.valueOf(policycharge) ;
    }
    
    
}