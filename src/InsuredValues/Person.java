package InsuredValues;

public class Person extends InsuredValue {
	private String residenceCity;
	private String name;
	private long nationalID;
	private String gender;
	private int yearOfBirth;
	private String illness;
	
	public Person() { //no argument constructor
		setInsuranceNumber("");
		setYearOfInsurance(0);
		residenceCity = "";
		name = "";
		nationalID= 0;
		yearOfBirth = 0;
		gender = "";
		illness = "";
	}
	
	public Person(Person originalPerson) {//copy constructor

        super(originalPerson);

        if (originalPerson == null)
        {
            System.out.println("Error: null originalPerson object.");
            System.exit(0);
        }

        this.residenceCity = originalPerson.residenceCity;
        this.name = originalPerson.name;
        this.nationalID = originalPerson.nationalID;
        this.gender = originalPerson.gender;
        this.yearOfBirth = originalPerson.yearOfBirth;
        this.illness = originalPerson.illness;
    }
	
	
	public Person( String insuranceNumber, int yearOfInsurance, String residenceCity, String name,long nationalID,String gender,int yearOfBirth,String illness) { //constructor with parameters
		super(insuranceNumber , yearOfInsurance); //call to base class
		this.residenceCity = residenceCity;
		this.name = name;
		this.nationalID = nationalID;
		this.gender = gender;
		this.yearOfBirth = yearOfBirth;
		this.illness = illness;
		
	}
	
	@Override
	public double calculateRiskFactor() {
		
		double riskFactorValue = 0.0;
		
		if(illness.equals("cardiovascular"))riskFactorValue = 1.85 ;
		else if(illness.equals("diabetes"))riskFactorValue = 1.84 ;
		else if(illness.equals("respiratory"))riskFactorValue = 1.86 ;
		else if(illness.equals("other"))riskFactorValue = 1.8 ;
		else if(illness.equals("none"))riskFactorValue = 0.1 ;
		int age = 2020 - yearOfBirth;
		return  (age*age) / (riskFactorValue * 18);

	}
	

	

	
	@Override
	public Person clone() {
	// TODO Auto-generated method stub
	return new Person(this);
	}
@Override
public String toString() {
	return "Insured Value : Person " + super.toString();
}
	
	
	public String getResidenceCity() {
		return residenceCity;
	}
	public void setResidenceCity(String residenceCity) {
		this.residenceCity = residenceCity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNationalID() {
		return nationalID;
	}
	public void setNationalID(int nationalID) {
		this.nationalID = nationalID;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getIllness() {
		return illness;
	}
	public void setIllness(String illness) {
		this.illness = illness;
	}
	
	
	
	
}
