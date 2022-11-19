/**
 * Write a description of class Car here.
 *
 * @author (21039633 Anish lamichhane)
 * @version (1.0.0)
 */
 
public class ElectricCar extends Car{
    //attributes of class ElectricCar
    private String customerName;
    private int batteryCapacity;
    private int batteryWarranty;
    private String purchaseDate;
    private String range;
    private int rechargeTime;
    private boolean isBought;
    private boolean isSold;
    
    //Creation of contrustor for class ElectricCar
    public ElectricCar(int carId,String carName,String carBrand,String carPrice,int batteryCapacity){
        //constructor of parent class inherited must be initialized from child class which is done using super keyword
        super(carId, carName, carBrand, carPrice);
        this.batteryCapacity = batteryCapacity;
        
        this.customerName = "";
        this.batteryWarranty = 0;
        this.purchaseDate = "";
        this.range = "";
        this.rechargeTime = 0;
        this.isBought = false;
        this.isSold = false;
    }
        //getter of the data of the class ElectricCar
    public String getCustomerName(){
        return this.customerName;
    }
    
    public int getBatteryCapcity(){
        return this.batteryCapacity;
    }
    
    public int getBatteryWarrenty(){
        return this.batteryWarranty;
    }
    
    public String getPurchaseDate(){
        return this.purchaseDate;
    }
    
    public String getRange(){
        return this.range;
    }
    
    public int getRechargeTime(){
        return this.rechargeTime;
    }
    
    public boolean getIsBought(){
        return this.isBought;
    }
    
    public boolean getIsSold(){
        return this.isSold;
    }
    
    //setter/Mutator of the data of class ElectricCar
    public void setCustomerName(String customerName){
            // setting customer name only if car is not bought.
        if(isBought == false){
            this.customerName = customerName;
        }else{
            System.out.println("The Electric car is already bought so customer name cannot be assigned");
        }
        }
        // Creating a method to buyElectricCar
    public void buyElectricCar(String customerName, int batteryWarranty, String purchaseDate, String range, int rechargeTime){
            if(isBought == false){
            setCustomerName(customerName);
            this.batteryWarranty = batteryWarranty;
            this.purchaseDate = purchaseDate;
            this.range = range;
            this.rechargeTime = rechargeTime;
            this.isBought = true;
        }else{
            System.out.println("The Electric car has already been bought");
        }
        }
        //Creating a method to sellElectricCar
    public void sellElectricCar(String customerName){
            if(isSold == false){
            // setting new customer name after electric car sold
            this.customerName = customerName;
            this.batteryCapacity = 0;
            this.batteryWarranty = 0;
            this.purchaseDate = "";
            this.range = "";
            this.rechargeTime = 0;
            this.isSold = true;
            this.isBought = false;
        }else{
            System.out.println("The Electric car has already been sold");
        }
        
        }
        //Creating display method for class ElectricCar
    @Override
    public void display(){
            super.display();
            // if(isBought == true){
            System.out.println("Customer Name: "+customerName);
            System.out.println("Battery Capacity: "+batteryCapacity);
            System.out.println("Battery Warranty: "+batteryWarranty);
            System.out.println("Purchased Date: "+purchaseDate);
            System.out.println("Range: "+range);
            System.out.println("Recharge Time: "+rechargeTime);
        }
    }  
