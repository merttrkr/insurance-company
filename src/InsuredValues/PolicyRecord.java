package InsuredValues;
import FileAccess.*;
import java.io.IOException;
import java.util.ArrayList;

public class PolicyRecord {

	private  ArrayList<InsuredValue> insuredValueList  = new ArrayList<InsuredValue>() ;
	private FileIO data;
	
	public PolicyRecord() throws IOException{
		data = new FileIO();
		
	}
	private ArrayList<InsuredValue> helper(ArrayList<InsuredValue> insuredValues, ArrayList<InsuredValue> returnList) { //private helper method for getAll method
		for (int i = 0; i < insuredValues.size(); i++) {
			returnList.add(insuredValues.get(i));
		}
		return returnList;
	
	}
	
	public ArrayList<InsuredValue> getALL() { // returns an array list that contains all insured values
		ArrayList<InsuredValue> returnList  = new ArrayList<InsuredValue>();
		helper(getWorkPlaceList(), returnList);
		helper(getHousingList(), returnList);
		helper(getPersonList(), returnList);
		helper(getTruckList(), returnList);
		helper(getAutomobileList(), returnList);
		return returnList;
	}
	
	public ArrayList<InsuredValue> getWorkPlaceList() { // returns an array list that contains workplaces
		String [][] fileString = data.getInsuradValues();
		insuredValueList.clear(); //clears all the array to keep only workplaces
		for (int i = 0; i < fileString.length; i++) {
			
				if (fileString[i][0].startsWith("W")) {//parsing the file to assign values
					String insuranceNumber =fileString[i][0];
					int yearOfInsurance = Integer.parseInt(fileString[i][1]);
					String premisesCity = fileString[i][2];
					int numberOfFloors =  Integer.parseInt(fileString[i][3]);
					int yearOfConstruction = Integer.parseInt(fileString[i][4]);
					String typeOfConstruction = fileString[i][5];
					int surfaceArea = Integer.parseInt(fileString[i][6]);
					int annualRevenue = Integer.parseInt(fileString[i][7]);
					Workplace workplace = new Workplace(insuranceNumber, yearOfInsurance, premisesCity, numberOfFloors, yearOfConstruction, typeOfConstruction, surfaceArea, annualRevenue);
					insuredValueList.add(workplace);
					insuredValueList.trimToSize(); //trims the arraylist to avoid usage of unnecesarry space		
			}
		}
		return insuredValueList;
		
 	}
	
	public ArrayList<InsuredValue> getHousingList() { // returns an array list that contains housing objects
		String [][] fileString = data.getInsuradValues();
		insuredValueList.clear();
		for (int i = 0; i < fileString.length; i++) {
			
				if (fileString[i][0].startsWith("H")) { //parsing the file to assign values
					String insuranceNumber =fileString[i][0];
					int yearOfInsurance = Integer.parseInt(fileString[i][1]);
					String premisesCity = fileString[i][2];
					int numberOfFloors =  Integer.parseInt(fileString[i][3]);
					int yearOfConstruction = Integer.parseInt(fileString[i][4]);
					String typeOfConstruction = fileString[i][5];
					int surfaceArea = Integer.parseInt(fileString[i][6]);
					String residentSituation = fileString[i][7];
					Housing housing = new Housing(insuranceNumber, yearOfInsurance, premisesCity, numberOfFloors, yearOfConstruction, typeOfConstruction, surfaceArea, residentSituation);
					insuredValueList.add(housing);
					insuredValueList.trimToSize(); //trims the arraylist to avoid usage of unnecesarry space		
			}
		}
		return insuredValueList;
		
 	}
	
	public ArrayList<InsuredValue> getPersonList() {  // returns an array list that contains persons
		String [][] fileString = data.getInsuradValues();
		insuredValueList.clear();
		for (int i = 0; i < fileString.length; i++) {
			
				if (fileString[i][0].startsWith("P")) {//parsing the file to assign values
					String insuranceNumber =fileString[i][0];
					int yearOfInsurance = Integer.parseInt(fileString[i][1]);
					String residenceCity = fileString[i][2];
					String name =  fileString[i][3];
					long nationalID = Long.parseLong(fileString[i][4]);
					String gender = fileString[i][5];
					int yearOfBirth = Integer.parseInt(fileString[i][6]);
					String illness = fileString[i][7];
					Person person = new Person(insuranceNumber, yearOfInsurance, residenceCity, name, nationalID, gender, yearOfBirth, illness);
					insuredValueList.add(person);
					insuredValueList.trimToSize(); //trims the arraylist to avoid usage of unnecesarry space		
			}
		}
		return insuredValueList;
		
 	}
	public ArrayList<InsuredValue> getAutomobileList() {  // returns an array list that contains automobiles
		String [][] fileString = data.getInsuradValues();
		insuredValueList.clear();
		for (int i = 0; i < fileString.length; i++) {
			
				if (fileString[i][0].startsWith("A")) {
					String insuranceNumber =fileString[i][0];
					int yearOfInsurance = Integer.parseInt(fileString[i][1]);
					String plateCity = fileString[i][2];
					double engineVolume =  Double.parseDouble(fileString[i][3]);
					int yearOfProduction = Integer.parseInt(fileString[i][4]);
					String typeOfGear = fileString[i][5];
					int fuelTankVolume = Integer.parseInt(fileString[i][6]);
					String typeOfRoof = fileString[i][7];
					Automobile automobile = new Automobile(insuranceNumber, yearOfInsurance, plateCity, engineVolume, yearOfProduction, typeOfGear, fuelTankVolume, typeOfRoof);
					insuredValueList.add(automobile);
					insuredValueList.trimToSize(); //trims the arraylist to avoid usage of unnecesarry space		
			}
		}
		return insuredValueList;
		
 	}
	public ArrayList<InsuredValue> getTruckList() { // returns an array list that contains trucks
		String [][] fileString = data.getInsuradValues();
		insuredValueList.clear();
		for (int i = 0; i < fileString.length; i++) {
			
				if (fileString[i][0].startsWith("T")) {
					String insuranceNumber =fileString[i][0];
					int yearOfInsurance = Integer.parseInt(fileString[i][1]);
					String plateCity = fileString[i][2];
					double engineVolume =  Double.parseDouble(fileString[i][3]);
					int yearOfProduction = Integer.parseInt(fileString[i][4]);
					String typeOfGear = fileString[i][5];
					int fuelTankVolume = Integer.parseInt(fileString[i][6]);
					String typeOfTruckbed = fileString[i][7];
					Truck truck = new Truck(insuranceNumber, yearOfInsurance, plateCity, engineVolume, yearOfProduction, typeOfGear, fuelTankVolume, typeOfTruckbed);
							
					insuredValueList.add(truck);
					insuredValueList.trimToSize(); //trims the arraylist to avoid usage of unnecesarry space		
			}
		}
		return insuredValueList;
		
 	}
	
	
	
	

	
	
}
