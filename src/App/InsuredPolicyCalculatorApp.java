package App;
import InsuredValues.*;
import Insurance.*;

import java.io.IOException;
import java.util.Scanner;  


public class InsuredPolicyCalculatorApp {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 All insured values, 2 Workplaces, 3 Housing, 4 Persons, 5 Automobiles, 6 Trucks.\nPlease enter your choice: ");
		String choice = scanner.nextLine();
		PolicyRecord policyRecord = new PolicyRecord();
		
		Insurance ins;
		
		switch(choice) {
		  case "1":
			  for (int i = 0; i < policyRecord.getALL().size(); i++) {
					System.out.println(policyRecord.getALL().get(i));
					
	
					if (policyRecord.getALL().get(i).getInsuranceNumber().startsWith("W") || policyRecord.getALL().get(i).getInsuranceNumber().startsWith("H") ) {
						ins = new Household(policyRecord.getALL().get(i));
						ins.calculatePolicyCharge();
						System.out.println("The policy charge of " + policyRecord.getALL().get(i).getInsuranceNumber() + ": " + ins );		
					}
					else if (policyRecord.getALL().get(i).getInsuranceNumber().startsWith("A") || policyRecord.getALL().get(i).getInsuranceNumber().startsWith("T")) {
						ins = new Traffic(policyRecord.getALL().get(i));
						ins.calculatePolicyCharge();
						System.out.println("The policy charge of " + policyRecord.getALL().get(i).getInsuranceNumber() + ": " + ins );	
					}
					else {
						ins = new Health(policyRecord.getALL().get(i));
						
						if (ins.calculatePolicyCharge() == 1000000000) {
							System.out.println("The insurance application is denied");
						}
						else {
							System.out.println("The policy charge of " + policyRecord.getALL().get(i).getInsuranceNumber() + ": " + ins );	
						}
						}
					
				}
		    break;
		  case "2":
			  for (int i = 0; i < policyRecord.getWorkPlaceList().size(); i++) {
				System.out.println(policyRecord.getWorkPlaceList().get(i));
				ins = new Household(policyRecord.getHousingList().get(i));
				ins.calculatePolicyCharge();
				System.out.println("The policy charge of " + policyRecord.getHousingList().get(i).getInsuranceNumber() + ": " + ins  );
				
			}
		    
		    break;
		  case "3":
			  for (int i = 0; i < policyRecord.getHousingList().size(); i++) {
				  System.out.println(policyRecord.getHousingList().get(i));
				  ins = new Household(policyRecord.getHousingList().get(i));
				  ins.calculatePolicyCharge();
				  System.out.println("The policy charge of " + policyRecord.getHousingList().get(i).getInsuranceNumber() + ": " + ins  );
			}
			   
			    break;
		  case "4":
			  for (int i = 0; i < policyRecord.getPersonList().size(); i++) {
					System.out.println("Insured Value: Person " + policyRecord.getPersonList().get(i));
					ins = new Health(policyRecord.getPersonList().get(i));
					
					if (ins.calculatePolicyCharge()  == 1000000000) {
						System.out.println("Insurance aplication denied");
					}
					else {
						System.out.println("The policy charge of " + policyRecord.getPersonList().get(i).getInsuranceNumber() + ": " + ins );	
					}
					
			  }
		
			    break;
		  case "5":
			  for (int i = 0; i < policyRecord.getAutomobileList().size(); i++) {
					System.out.println("Insured Value: Automobile " + policyRecord.getAutomobileList().get(i));
					ins = new Traffic(policyRecord.getHousingList().get(i));
					ins.calculatePolicyCharge();
					System.out.println("The policy charge of " + policyRecord.getAutomobileList().get(i).getInsuranceNumber() + ": " + ins  );
			  }
			    break;
		  case "6":
			  for (int i = 0; i < policyRecord.getWorkPlaceList().size(); i++) {
					System.out.println("Insured Value: Truck " + policyRecord.getTruckList().get(i));
					ins = new Traffic(policyRecord.getTruckList().get(i));
					ins.calculatePolicyCharge();
					System.out.println("The policy charge of " + policyRecord.getTruckList().get(i).getInsuranceNumber() + ": " + ins  );
			  }
			    break;
		  default:
		    System.out.println("Please enter a valid input.");
		}


		
		
		
		
	}

}
