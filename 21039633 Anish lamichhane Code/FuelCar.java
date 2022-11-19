 
/**
 * Write a description of class FuelCar here.
 *
 * @author (21039633 Anish lamichhane)
 * @version (1.0.0)
 */
 //creating a sub or child class name fuelcar of super class Car 
public class FuelCar extends Car
{
     //state 8 attributes using (private) access modifier to use in FuelCar class only 
    private String distributorName;  
    private String fuelType;
    private int numberOfSeats;
    private String bookedDate;
    private String purchasedDate;
    private int mileage;
    private String transmissionType;
    private boolean isPurchased;
    //creating constructor having parameter like distributorName,fuelType,numberofSeats,bookedDate
     //purchasedDate,mileage,transmissionType,isPurchased
     
    public FuelCar(int carId, String carName, String carBrand, String carPrice, String fuelType,
    int numberOfSeats, int mileage){
    //for accessing instance variable and methods from super class (super) keyword is used  
       super(carId,carName,carBrand,carPrice);
        this.fuelType = fuelType;
        this.numberOfSeats = numberOfSeats;
        this.mileage = mileage;
     //set the empty string to the rest of the string variable and false to the boolean 
        this.distributorName = "";
        this.bookedDate = "";
        this.purchasedDate = "";
        this.transmissionType = "";
        this.isPurchased = false;
    }
    // creating accessor method name distributorName which return initialized value of instance variable 
    public String getDistributorName(){
        return this.distributorName;
    }
     //creating accessor method name FuelType which return initialized value of instance variable 
    public String getFuelType(){
        return this.fuelType;    
    }
    //creating accessor method name getNumberOfSeats which return initialized value of instance variable 
    public int getNumberOfSeats(){
        return this.numberOfSeats;
    }
    //creating accessor method name BookedDate which return initialized value of instance variable 
    public String getBookedDate(){
        return this.bookedDate;
    }
    //creating accessor method name PurchasedDate which return initialized value of instance variable 
    public String getPurchasedDate(){
        return this.purchasedDate;
    }
    //creating accessor method name Mileage which return initialized value of instance variable 
    public int getMileage(){
        return this.mileage;
    }
    //creating accessor method name TransmissionType which return initialized value of instance variable 
    public String getTransmissionType(){
        return this.transmissionType;
    }
    //creating accessor method name IsPurchased which return initialized value of instance variable 
    public boolean getIsPurchased(){
        return this.isPurchased;
    }
    
      //creating mutator method name TransmissionType to set value of type of Transmission 
    public void setTransmissionType(String transmissionType){
        this.transmissionType = transmissionType;
    }
     //creating mutator method name DistributorName to set name of Distributor 
    public void setDistributorName(String distributorName){
        this.distributorName = distributorName;
    }
     //creating mutator method name IsPurchased to set value of IsPurchased 
    public void setIsPurchased(boolean isPurchased){
        this.isPurchased = isPurchased;
    }
        /*creating mutator method name String bookedDate, String purchasedDate
 * check if joined is true a messege is display
 * else value of String bookedDate, String purchasedDate is set
 */

    public void purchasedFuelCar(String bookedDate, String purchasedDate){
        if( isPurchased == true){
            setCarColor(getCarColor());
            super.display();
              System.out.println("id:" + getCarId());
            System.out.println("name:"+ getCarName());
            System.out.println("brand:"+ getCarBrand());
            System.out.println("price:"+ getCarPrice());
            System.out.println("distributorName "+distributorName);
        }else{
            setDistributorName(distributorName);
            setTransmissionType(transmissionType);
            this.bookedDate = bookedDate;
            this.purchasedDate = purchasedDate;
            isPurchased = true;
        }
    }
    //method name display is created
 //display method of super class is called using super key word
 //value of distributorName,fuelType,numberofSeats,bookedDate,purchasedDate,mileage,
     //transmissionType,isPurchasedis display with proper messege
    public void display(){
     if(isPurchased == true){
            super.display();
            System.out.println("Distributor Name: "+distributorName);
            System.out.println("Fuel Type: "+fuelType);
            System.out.println("Booked Date: "+bookedDate);
            System.out.println("Purchased Date: "+purchasedDate);
            System.out.println("Mileage: "+mileage);
            System.out.println("Number of Seats: "+numberOfSeats);
            System.out.println("Transmission Type: "+transmissionType);
        }
            
            //}
    
}
}
