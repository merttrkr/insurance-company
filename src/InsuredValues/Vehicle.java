package InsuredValues;

public class Vehicle extends InsuredValue {
	private String plateCity;
	private double engineVolume;
	private int yearOfProduction;
	private String typeOfGear;
	private int fuelTankVolume;
	
	
	public Vehicle() { //no arg const
		setInsuranceNumber("");
		setYearOfInsurance(0);
		plateCity = "";
		engineVolume = 0;
		yearOfProduction = 0;
		typeOfGear = "";
		fuelTankVolume = 0;

		
	}
	public Vehicle(Vehicle originalVehicle) {//copy constructor
        super(originalVehicle);

        if (originalVehicle == null)
        {
            System.out.println("Error: null originalVehicle object.");
            System.exit(0);
        }
        this.plateCity = originalVehicle.plateCity;
        this.engineVolume = originalVehicle.engineVolume;
        this.yearOfProduction = originalVehicle.yearOfProduction;
        this.typeOfGear = originalVehicle.typeOfGear;
        this.fuelTankVolume = originalVehicle.fuelTankVolume;
    }

	@Override
    public double calculateRiskFactor() {

        double plateCityRiskFactor;
       

        if(getPlateCity().equals("Izmir"))plateCityRiskFactor =  0.78 ;
        else if(getPlateCity().equals("Istanbul"))plateCityRiskFactor = 0.97 ;
        else if(getPlateCity().equals("Ankara"))plateCityRiskFactor = 0.85 ;
        else plateCityRiskFactor = 0.65;

    
        int age = 2020 - yearOfProduction;
        
        return   engineVolume* fuelTankVolume*age*plateCityRiskFactor* 0.03 ;

    }
	
	
	// arg const	
	public Vehicle(String insuranceNumber, int yearOfInsurance, String plateCity, double engineVolume,int yearOfProduction ,String typeOfGear,int fuelTankVolume) { //constructor with parameters
		super(insuranceNumber , yearOfInsurance);
		this.plateCity = plateCity;
		this.engineVolume = engineVolume;
		this.yearOfProduction = yearOfProduction;
		this.typeOfGear = typeOfGear;
		this.fuelTankVolume = fuelTankVolume;
	}
	
	@Override
	public Vehicle clone() {
		// TODO Auto-generated method stub
		return new Vehicle(this);
	}
	


	public String getPlateCity() {
		return plateCity;
	}

	public void setPlateCity(String plateCity) {
		this.plateCity = plateCity;
	}

	public double getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public String getTypeOfGear() {
		return typeOfGear;
	}

	public void setTypeOfGear(String typeOfGear) {
		this.typeOfGear = typeOfGear;
	}

	public int getFuelTankVolume() {
		return fuelTankVolume;
	}

	public void setFuelTankVolume(int fuelTankVolume) {
		this.fuelTankVolume = fuelTankVolume;
	}
	
	
	
	
	
	
	
	
}
