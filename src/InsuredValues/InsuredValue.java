package InsuredValues;

public class InsuredValue {
		private String insuranceNumber;
		private int yearOfInsurance;
		
		
		public InsuredValue() { //no argument constructor
			insuranceNumber = "";
			yearOfInsurance = 0;
		}
		
		public InsuredValue(String insuranceNumber, int yearOfInsurance  ) { //constructor with parameters
			this.insuranceNumber = insuranceNumber;
			this.yearOfInsurance = yearOfInsurance;
		}
	
		public InsuredValue(InsuredValue IV) { //copy constructor
			if (IV == null)
            {
                System.out.println("Error: null InsuredValue object.");
                System.exit(0);
            }
			this.insuranceNumber = IV.insuranceNumber;
			this.yearOfInsurance = IV.yearOfInsurance;
			
		}
		
		public double calculateRiskFactor() {
			return 0;
		}
			
		
		public String getInsuranceNumber() {
			return insuranceNumber;
		}
		public void setInsuranceNumber(String insuranceNumber) {
			this.insuranceNumber = insuranceNumber;
		}
		public int getYearOfInsurance() {
			return yearOfInsurance;
		}
		public void setYearOfInsurance(int yearOfInsurance) {
			this.yearOfInsurance = yearOfInsurance;
		}
		
		@Override
		public String toString() {
			return "Insurance number: " + insuranceNumber + "  Year of insurance: " + yearOfInsurance ;
		}
		
		@Override
		public InsuredValue clone() {
			return new InsuredValue(this);
		}
		
		
}
