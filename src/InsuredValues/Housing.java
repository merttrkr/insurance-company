package InsuredValues;

public class Housing extends Premises {
	private String residentStiuation;
	
	public Housing() { //no arg constructor
		setInsuranceNumber("");
		setNumberOfFloors(0);
		setPremisesCity("");
		setSurfaceArea(0);
		setYearOfConstruction(0);
		setYearOfInsurance(0);
		setTypeOfConstruction("");
		residentStiuation = "";
		
	}
	


	//arg constructor
	public Housing(String insuranceNumber, int yearOfInsurance, String premisesCity,int numberOfFloors,int yearOfConstruction,String typeOfConstruction,int surfaceArea, String residentStiuation) {
		super(insuranceNumber,yearOfInsurance, premisesCity,numberOfFloors,yearOfConstruction , typeOfConstruction,surfaceArea);
		this.residentStiuation = residentStiuation;
		
	}
	
	public Housing(Housing originalHousing) {//copy constructor
        super(originalHousing);
        if (originalHousing == null)
        {
            System.out.println("Error: null originalObject object.");
            System.exit(0);
        }
        this.residentStiuation = originalHousing.residentStiuation;
    }
	
	
	@Override
	public double calculateRiskFactor() {
	
		double val = super.calculateRiskFactor();
		double residentriskFactorValue = 0;
		
		
		if(residentStiuation.equals("tenant"))residentriskFactorValue = 0.18;	
		else if(residentStiuation .equals("landlord"))residentriskFactorValue = 0.42 ;
		else  System.out.println("residentriskFactorValue is null"); 
		return val/ residentriskFactorValue;
			

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Insured Value: Housing " + super.toString() ;
	}
	
	
	@Override
	public Housing clone() {
		// TODO Auto-generated method stub
		return new Housing(this);
	}

	
	public String getResidentStiuation() {
		return residentStiuation;
	}

	public void setResidentStiuation(String residentStiuation) {
		this.residentStiuation = residentStiuation;
	}
}
