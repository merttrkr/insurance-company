package Insurance;
import InsuredValues.*;
import java.util.Random;



public class Insurance {
    private int fixedFee; //every insurance has a random fixed fee
   

    public Insurance() {//no argument constructor
    	 Random rand = new Random();
         int high = 3000;
         int low = 1000;
         this.fixedFee = rand.nextInt(high-low)+low;
      

    }

    public Insurance(InsuredValue insuredValue) {// arg const
    	Random rand = new Random();
        int high = 3000;
        int low = 1000;
        this.fixedFee = rand.nextInt(high-low)+low;

    }
    

  
	public Insurance(Insurance originalInsurance) {//copy constructor
        if (originalInsurance == null)
        {
            System.out.println("Error: null originalInsurance object.");
            System.exit(0);
        }
        this.fixedFee = originalInsurance.fixedFee;

    }
    public double calculatePolicyCharge() {
        return 0;
    }

    

//getters and setters
    public int getFixedFee() {
        Random rand = new Random();
        int high = 3000;
        int low = 1000;
        int fixedFee = rand.nextInt(high-low)+low;
        return fixedFee;
    }

}