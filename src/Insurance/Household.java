package Insurance;
import InsuredValues.InsuredValue;

public class Household extends Insurance {

    private InsuredValue insuredValue;
    private double policycharge;

    public Household(Household originalHousehold) {//copy constructor
        super(originalHousehold);

    }

    public Household(InsuredValue insuredValue) {//full argument constructor
        super();
        this.insuredValue = insuredValue;
    }


    
    @Override
    public double calculatePolicyCharge() {
    double riskFactor = insuredValue.calculateRiskFactor();      
    policycharge = getFixedFee() * (riskFactor * riskFactor);
      if (2020-insuredValue.getYearOfInsurance() >2) {
		policycharge = policycharge -  (policycharge * 0.1);
	}   
      return policycharge;
    }
    

    @Override
    public String toString() { // prints the policy charge to console
    	return String.valueOf(policycharge) ;
    }

}
