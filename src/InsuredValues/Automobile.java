package InsuredValues;


public class Automobile extends Vehicle{
	private String typeOfRoof;
	
	public Automobile() {//no arg constr
		setInsuranceNumber("");
		setYearOfInsurance(0);
		setEngineVolume(0);
		setFuelTankVolume(0);
		setPlateCity("");
		setTypeOfGear("");
		setYearOfProduction(0);
		typeOfRoof = "";
	}
	//arg constr
	public Automobile( String insuranceNumber, int yearOfInsurance, String plateCity, double engineVolume,int yearOfProduction ,String typeOfGear,int fuelTankVolume ,String typeOfRoof ) {
		super(insuranceNumber,yearOfInsurance,plateCity,engineVolume,yearOfProduction,typeOfGear,fuelTankVolume );
		this.typeOfRoof = typeOfRoof;
	}
	
	
	public Automobile(Automobile originalAutomobile) {//copy constructor
        super(originalAutomobile);

        if (originalAutomobile == null)
        {
            System.out.println("Error: null originalAutomobile object.");
            System.exit(0);
        }

        this.typeOfRoof = originalAutomobile.typeOfRoof;
    }
	@Override
	public String toString() {
		return "Insured Value: Automobile " + super.toString() ;
	}
	
	@Override
    public double calculateRiskFactor() {
		double val = super.calculateRiskFactor();
		double roofRiskFactor = 0;

        if(typeOfRoof.equals("sunroof"))roofRiskFactor = 0.64 ;
        else if(typeOfRoof.equals("moonroof"))roofRiskFactor = 0.48 ;
        else if(typeOfRoof.equals("regular"))roofRiskFactor = 0.1 ;
        

        
        return  (val * 0.004)/ roofRiskFactor;

    }
	
	
	

	 @Override
	public Automobile clone() {
		// TODO Auto-generated method stub
		return new Automobile(this);
	}
	 
	public String getTypeOfRoof() {
		return typeOfRoof;
	}
	public void setTypeOfRoof(String typeOfRoof) {
		this.typeOfRoof = typeOfRoof;
	}
	
}
