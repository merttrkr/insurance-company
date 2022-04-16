package Insurance;
import InsuredValues.*;
public class Traffic extends Insurance {
	 private InsuredValue insuredValue;
	 private double policycharge;

    public Traffic(Traffic originalHousehold) {//copy constructor
        super(originalHousehold);

    }

    public Traffic(InsuredValue insuredValue) {//full argument constructor
        super();
        this.insuredValue = insuredValue;
    }



    @Override
    public double calculatePolicyCharge() {
    double riskFactor = insuredValue.calculateRiskFactor();
    double fixedFee = getFixedFee();
    policycharge = (fixedFee*0.9) + (Math.sqrt(riskFactor) * fixedFee);
      if (2020- insuredValue.getYearOfInsurance() > 1) {

        policycharge = policycharge-policycharge*0.2;
    }
      return policycharge;
    }
    @Override
    public String toString() { // prints the policy charge to console
    	return String.valueOf(policycharge) ;
    }

}