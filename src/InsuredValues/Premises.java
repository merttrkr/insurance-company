package InsuredValues;

public class Premises extends InsuredValue{
	private String premisesCity;
	private int numberOfFloors;
	private int yearOfConstruction;
	private int surfaceArea;
	private String typeOfConstruction;
	
	
	public Premises() { //no argument constructor
		setInsuranceNumber("");
		setYearOfInsurance(0);
		numberOfFloors = 0;
		premisesCity = "";
		numberOfFloors = 0;
		yearOfConstruction = 0;
		surfaceArea = 0;
		typeOfConstruction = "";
		
	}
	
	public Premises(Premises originalPremises) {
        super(originalPremises);

        if (originalPremises == null)
        {
            System.out.println("Error: null originalPremises object.");
            System.exit(0);
        }

        this.premisesCity = originalPremises.premisesCity;
        this.numberOfFloors = originalPremises.numberOfFloors;
        this.yearOfConstruction = originalPremises.yearOfConstruction;
        this.surfaceArea = originalPremises.surfaceArea;
        this.typeOfConstruction = originalPremises.typeOfConstruction;
        
    }
	
	public Premises(String insuranceNumber, int yearOfInsurance, String premisesCity,int numberOfFloors,int yearOfConstruction,String typeOfConstruction,int surfaceArea) { //constructor with parameters
		super(insuranceNumber , yearOfInsurance);
		this.premisesCity = premisesCity;
		this.numberOfFloors = numberOfFloors;
		this.yearOfConstruction = yearOfConstruction;
		this.surfaceArea = surfaceArea;
		this.typeOfConstruction = typeOfConstruction;
	}
	
	public double calculateRiskFactor() {
		
		double cityriskFactorValue ;
		double floorriskFactorValue =0;
		double yearOfConstructionriskFactorValue=0;
		double typeOfConstructionriskFactorValue;
		int surfaceArea = getSurfaceArea();
		
		if(getPremisesCity().equals("Izmir"))cityriskFactorValue = 0.4;
		else if(getPremisesCity().equals("Istanbul"))cityriskFactorValue = 0.6 ;
		else if(getPremisesCity().equals("Ankara"))cityriskFactorValue = 0.15;
		else  cityriskFactorValue = 0.25 ;
		
		if((getNumberOfFloors() < 3)) floorriskFactorValue = 0.1;
		else if((getNumberOfFloors() > 3 && getYearOfConstruction() < 7)) floorriskFactorValue= 0.25 ;
		else if((getNumberOfFloors() > 7 && getYearOfConstruction() < 18)) floorriskFactorValue = 0.5;
		else floorriskFactorValue = 0.85;
			
		if((getYearOfConstruction() < 1975)) yearOfConstructionriskFactorValue = 0.58;
		else if((getYearOfConstruction() > 1975 && getYearOfConstruction() < 1999)) yearOfConstructionriskFactorValue = 0.32 ;
		else if((getYearOfConstruction() > 1999)) yearOfConstructionriskFactorValue = 0.1;
		
		if(getTypeOfConstruction().equals("steel"))typeOfConstructionriskFactorValue = 0.1;
		else if(getPremisesCity().equals("concrete"))typeOfConstructionriskFactorValue = 0.37 ;
		else if(getPremisesCity().equals("wood"))typeOfConstructionriskFactorValue = 0.58;
		else  typeOfConstructionriskFactorValue = 0.92 ;
		
		return  (cityriskFactorValue * floorriskFactorValue * yearOfConstructionriskFactorValue * typeOfConstructionriskFactorValue) *(surfaceArea);
				

	}


	
	public String getTypeOfConstruction() {
		return typeOfConstruction;
	}

	public void setTypeOfConstruction(String typeOfConstruction) {
		this.typeOfConstruction = typeOfConstruction;
	}

	
	

	@Override
	public Premises clone() {
		// TODO Auto-generated method stub
		return new Premises(this);
	}
	

	public String getPremisesCity() {
		return premisesCity;
	}

	public void setPremisesCity(String premisesCity) {
		this.premisesCity = premisesCity;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public int getYearOfConstruction() {
		return yearOfConstruction;
	}

	public void setYearOfConstruction(int yearOfConstruction) {
		this.yearOfConstruction = yearOfConstruction;
	}

	public int getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(int surfaceArea) {
		this.surfaceArea = surfaceArea;
	}


}
