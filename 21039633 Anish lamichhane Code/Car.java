
/**
 * Write a description of class Car here.
 *
 * @author (21039633 Anish lamichhane)
 * @version (1.0.0)
 */
// declaring 5 attrubutes of Car using (private) access modifier to use within this class only 
public class Car
{
    private int carId;
    private String carName;
    private String carBrand;
    private String carPrice;
    private String carColor;
    // declearing constructor which contain parameter like carID, carName, carBrand, carPrice, carColor 
    public Car(int carId, String carName, String carBrand, String carPrice){
         //attributes = parameter
    //to set the value for instance variables this. is used
        this.carName = carName;
        this.carId = carId;
        this.carBrand = carBrand;
        this.carPrice = carPrice;
        this.carColor = "";
    }
    
    // creating accessor method name carId which return initialized value of instance variable 
    public int getCarId(){
        return this.carId;
    }
        // creating accessor method name carName which return initialized value of instance variable 
    public String getCarName(){
        return this.carName;
    }
    // creating accessor method name carBrand which return initialized value of instance variable 
    public String getCarBrand(){
        return this.carBrand;
    }
        // creating accessor method name carColor which return initialized value of instance variable 
    public String getCarPrice(){
        return this.carPrice;
    }
    
    public String getCarColor(){
        return this.carColor;
    }
    
        // creating mutator method name carColor to set the color of the car which it's default is null and not initialized in 
    //constructor
  
    public void setCarColor(String carColor){
        this.carColor = carColor;
    }
        //(a method name display is created in this class the attributes 
      //carId,carName, carBrand, carPrice, carColor is displayed with proper data entry)
    

    public void display(){
        System.out.println("Car ID:  "+carId);
        System.out.println("Car Name:  "+carName);
        System.out.println("Car Brand:  "+carBrand);
        System.out.println("Car Price:  "+carPrice);
        if (carColor==""){
              System.out.println("the car color is empty");
              
          }
          else{
              System.out.println("the car color is "+carColor);
          }
    }
}
