package InsuredValues;

public class Truck extends Vehicle{
	private String typeOfTruckbed;
	
	public Truck() {// no arg constructor 
		setEngineVolume(0);
		setFuelTankVolume(0);
		setInsuranceNumber(""); 
		setPlateCity("");
		setTypeOfGear("");
		setYearOfInsurance(0); 
		setYearOfProduction(0);
		typeOfTruckbed = "";
	}
	
	//arg constructor 
	public Truck(String insuranceNumber, int yearOfInsurance, String plateCity, double engineVolume,int yearOfProduction ,String typeOfGear,int fuelTankVolume, String typeOfTruckbed) {
		super(insuranceNumber,yearOfInsurance,plateCity,engineVolume,yearOfProduction,typeOfGear,fuelTankVolume );
		this.typeOfTruckbed = typeOfTruckbed;
	}
	//copy
	public Truck(Truck originalTruck) {
        super(originalTruck);

        if (originalTruck == null)
        {
            System.out.println("Error: null originalTruck object.");
            System.exit(0);
        }

        this.typeOfTruckbed = originalTruck.typeOfTruckbed;
    }

	@Override
    public double calculateRiskFactor() {
        double val = super.calculateRiskFactor();
        int age  = 2020- getYearOfProduction();
        double truckBedRiskFactor = 0;

        if(typeOfTruckbed.equals("trailer"))truckBedRiskFactor = 0.87 ;
        else if(typeOfTruckbed.equals("tanker"))truckBedRiskFactor = 0.84 ;
        else if(typeOfTruckbed.equals("regular"))truckBedRiskFactor = 0.15 ;
       
        return (val * age*age* 0.008) / truckBedRiskFactor;
    }
	
	
	@Override
	public Truck clone() {
		// TODO Auto-generated method stub
		return new Truck(this);
	}
	@Override
	public String toString() {
		return "Insured Value: Truck " + super.toString() ;
	}


	public String getTypeOfTruckbed() {
		return typeOfTruckbed;
	}

	public void setTypeOfTruckbed(String typeOfTruckbed) {
		this.typeOfTruckbed = typeOfTruckbed;
	}
}
