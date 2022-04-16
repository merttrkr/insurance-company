package InsuredValues;

public class Workplace extends Premises{
	private int annualRevenue;
	
	public Workplace() { //no argument constructor
		setInsuranceNumber("");
		setNumberOfFloors(0);
		setPremisesCity("");
		setSurfaceArea(0);
		setYearOfConstruction(0);
		setYearOfInsurance(0);
		setTypeOfConstruction("");
		annualRevenue = 0;

	}
	
	public Workplace(String insuranceNumber, int yearOfInsurance, String premisesCity,int numberOfFloors,int yearOfConstruction,String typeOfConstruction ,int surfaceArea, int annualRevenue) { //constructor with parameters
		super(insuranceNumber,yearOfInsurance, premisesCity,numberOfFloors,yearOfConstruction,typeOfConstruction , surfaceArea);
		this.annualRevenue = annualRevenue;

	}

	public Workplace(Workplace originalWorkplace) {//copy constructor
        super(originalWorkplace);

        if (originalWorkplace == null)
        {
            System.out.println("Error: null originalWorkplace object.");
            System.exit(0);
        }

        this.annualRevenue = originalWorkplace.annualRevenue;
    }
	
	@Override
	public double calculateRiskFactor() {
	
		double val = super.calculateRiskFactor();
		double AnnualRevenueFactorValue=getAnnualRevenue();
		
		return val*0.2*AnnualRevenueFactorValue*0.003;		

	}
	
	
	
	
	@Override
	public String toString() {

		return "Insured Value: Workplace " + super.toString() ;
	}

	@Override
	public Workplace clone() {
		// TODO Auto-generated method stub
		return new Workplace(this);
	}
	
	public int getAnnualRevenue() {
		return annualRevenue;
	}

	public void setAnnualRevenue(int annualRevenue) {
		this.annualRevenue = annualRevenue;
	}


}
