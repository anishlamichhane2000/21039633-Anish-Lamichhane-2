
//importing packages
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

//creating a class to make a GUI form for Fuelcar and electricCar
public class GUI_DEMO implements ActionListener
{
    // declaring attributes of JFrame, JLabel, JTextField, JcomboBox, JButton class
    public JFrame frm;
    public JButton clrBtn;

    //..................fuel car...........
    public JLabel lblTitlefuel,lblCarIDfuel,lblCarNamefuel,lblCarBrandfuel,lblCarPricefuel,lblCarColorfuel,lblDistributorname,lblFuelType,lblNumberOfSeats,
    lblMileage,lblTransmissionType,lblPurchaseDate,lblBookedDate,lblCarIDfuel1,lblCarBrandfuel1,lblCarNamefuel1;
    public JTextField txtCarIDfuel,txtcarNamefuel,txtcarBrandfuel,txtCarPricefuel,txtCarColorfuel,txtDistributorname,txtFuelType,txtNumberofSeats,
    txtMileage,txtTransmissionType,txtCarIDfuel1,txtcarNamefuel1,txtcarBrandfuel1;
    public JButton fcaraddBtn,fcarpurBtn,fcardisBtn; 
    public JComboBox cmbyearPurchaseDate,cmbmthPurchaseDate,cmbdayPurchaseDate,cmbyearBookedDate,cmbdayBookedDate,cmbmthBookedDate;
    //..................Electric car.................
    public JLabel ecarlblTitle,ecarlblCarID,ecarlblcarName,ecarlblcarBrand,ecarlblPurchaseDate,ecarlblCarPrice,lblCustomername,ecarlblCarPrice1,
    lblBatteryCapacity,lblBatteryWarranty,lblRange,ecarlblcarcolor,lblRechargetime,ecarlblCarID1,ecarlblcarName1,ecarlblcarBrand1;
    public JTextField ecartxtCarID,ecartxtCarName,ecartxtcarBrand,ecartxtCarPrice,txtCustomername,txtBatteryCapacity,txtBatteryWarranty,
    txtRange,txtRechargetime,ecartxtCarID1,ecartxtcarcolor,ecartxtCarName1,ecartxtcarBrand1,ecartxtCarPrice1;
    public JButton ecaraddBtn,sellBtn,buyBtn,ecardisBtn; 
    public JComboBox ecarcmbyearPurchaseDate,ecarcmbmthPurchaseDate,ecarcmbdayPurchaseDate;

    //Creating Array list of car to store data of GUI form
    //Declration of arraylist
    public ArrayList<Car> list= new ArrayList();
    FuelCar fuel;
    ElectricCar electric;

    // creating main method
    public static void main(String[] args)
    {
        new GUI_DEMO().CarForm();

    }
    // creating a method name CarForm to make GUI form
    public void CarForm()
    {
        //making window frame for Carform
        frm=new JFrame("Car");

        lblTitlefuel =new JLabel();
        lblTitlefuel.setText("Fuel car ");
        lblTitlefuel.setBounds(130, 20, 500, 40);
        frm.add(lblTitlefuel);
        Font ff=new Font("Serif",Font.BOLD,22);
        lblTitlefuel.setFont(ff);

        lblCarIDfuel=new JLabel("Car ID:");
        lblCarIDfuel.setBounds(20,70,100,20);
        frm.add(lblCarIDfuel);

        txtCarIDfuel=new JTextField("");
        txtCarIDfuel.setBounds(90,70,100,20);
        frm.add(txtCarIDfuel);

        lblCarNamefuel=new JLabel("Car Name:");
        lblCarNamefuel.setBounds(220, 70, 100, 20);
        frm.add(lblCarNamefuel);

        txtcarNamefuel=new JTextField("");
        txtcarNamefuel.setBounds(290,70,100,20);
        frm.add(txtcarNamefuel);

        lblCarBrandfuel=new JLabel("Car Brand:");
        lblCarBrandfuel.setBounds(20,130,150,20);
        frm.add(lblCarBrandfuel);

        txtcarBrandfuel=new JTextField("");
        txtcarBrandfuel.setBounds(90,130,100,20);
        frm.add(txtcarBrandfuel);

        lblCarPricefuel=new JLabel("Car Price:");
        lblCarPricefuel.setBounds(220,130,150,20);
        frm.add(lblCarPricefuel);

        txtCarPricefuel=new JTextField("");
        txtCarPricefuel.setBounds(290,130,100,20);
        frm.add(txtCarPricefuel);

        lblFuelType=new JLabel("Fuel Type:");
        lblFuelType.setBounds(20,190,200,20);
        frm.add(lblFuelType);

        txtFuelType=new JTextField("");
        txtFuelType.setBounds(90,190,100,20);
        frm.add(txtFuelType);

        lblNumberOfSeats=new JLabel("No of Seats");
        lblNumberOfSeats.setBounds(220,190,200,20);
        frm.add(lblNumberOfSeats);

        txtNumberofSeats=new JTextField("");
        txtNumberofSeats.setBounds(290,190,100,20);
        frm.add( txtNumberofSeats);

        lblMileage=new JLabel("Mileage:");
        lblMileage.setBounds(20,250,250,20);
        frm.add(lblMileage);

        txtMileage=new JTextField("");
        txtMileage.setBounds(90,250,100,20);
        frm.add(txtMileage);

        fcaraddBtn = new JButton("Add");
        fcaraddBtn.setBackground(Color.BLUE);
        fcaraddBtn.setBounds(220,250,100,30);
        frm.add(fcaraddBtn);
        fcaraddBtn.addActionListener(this);
        // for puchase.......................//
        lblCarIDfuel1=new JLabel("Car ID:");
        lblCarIDfuel1.setBounds(20,300,300,20);
        frm.add(lblCarIDfuel1);

        txtCarIDfuel1=new JTextField("");
        txtCarIDfuel1.setBounds(90,300,100,20);
        frm.add(txtCarIDfuel1);

        lblCarNamefuel1=new JLabel("Car Name:");
        lblCarNamefuel1.setBounds(220, 300, 300, 20);
        frm.add(lblCarNamefuel1);

        txtcarNamefuel1=new JTextField("");
        txtcarNamefuel1.setBounds(290,300,100,20);
        frm.add(txtcarNamefuel1); 

        lblCarBrandfuel1=new JLabel("Car Brand:");
        lblCarBrandfuel1.setBounds(20,360,300,20);
        frm.add(lblCarBrandfuel1);

        txtcarBrandfuel1=new JTextField("");
        txtcarBrandfuel1.setBounds(90,360,100,20);
        frm.add(txtcarBrandfuel1);

        lblCarColorfuel=new JLabel("Car Color:");
        lblCarColorfuel.setBounds(220,360,300,20);
        frm.add(lblCarColorfuel);

        txtCarColorfuel=new JTextField("");
        txtCarColorfuel.setBounds(290,360,100,20);
        frm.add(txtCarColorfuel);

        lblTransmissionType=new JLabel("trans type:");
        lblTransmissionType.setBounds(20,420,100,20);
        frm.add(lblTransmissionType);

        txtTransmissionType=new JTextField("");
        txtTransmissionType.setBounds(90,420,100,20);
        frm.add(txtTransmissionType);

        lblDistributorname=new JLabel("Dist Name:");
        lblDistributorname.setBounds(220,420,100,20);
        frm.add(lblDistributorname);

        txtDistributorname=new JTextField("");
        txtDistributorname.setBounds(290,420,100,20);
        frm.add(txtDistributorname);

        lblPurchaseDate=new JLabel("Purchase Date");
        lblPurchaseDate.setBounds(20,460,100,20);
        frm.add(lblPurchaseDate);

        String[] puryear = { "2000", "2001", "2002", "2003", "2004", "2005", "2006","2007","2008", "2009", "2010", "2011","2012", 
                "2013", "2014", "2015", "2016", "2017" ,"2018", "2019", "2020", "2021","2022"};
        cmbyearPurchaseDate=new JComboBox(puryear);
        cmbyearPurchaseDate.setBounds(140,460,60,20);
        frm.add(cmbyearPurchaseDate);

        String[] purmonth = {"January","February", "March", "April", "May", "June","July", "August", "September", 
                "October", "November", "December"};
        cmbmthPurchaseDate=new JComboBox(purmonth);
        cmbmthPurchaseDate.setBounds(220,460,60,20);
        frm.add(cmbmthPurchaseDate);

        String[] purday = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" ,"15", "16", "17", "18", "19",
                "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30","31"};
        cmbdayPurchaseDate=new JComboBox(purday);
        cmbdayPurchaseDate.setBounds(300,460,60,20);
        frm.add(cmbdayPurchaseDate);

        lblBookedDate=new JLabel("Booked Date");
        lblBookedDate.setBounds(20,510,100,20);
        frm.add(lblBookedDate);

        String[] bookyear = { "2000", "2001", "2002", "2003", "2004", "2005", "2006","2007","2008", "2009", "2010", "2011","2012", 
                "2013", "2014", "2015", "2016", "2017" ,"2018", "2019", "2020", "2021","2022"};
        cmbyearBookedDate=new JComboBox(bookyear);
        cmbyearBookedDate.setBounds(140,510,60,20);
        frm.add(cmbyearBookedDate);

        String[] bookmonth = {"January","February", "March", "April", "May", "June","July", "August", "September", 
                "October", "November", "December"};
        cmbmthBookedDate=new JComboBox(bookmonth);
        cmbmthBookedDate.setBounds(220,510,60,20);
        frm.add(cmbmthBookedDate);

        String[] bookday = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" ,"15", "16", "17", "18", "19",
                "20", "21", "22", "23", "24", "25","26", "27", "28", "29", "30","31"};
        cmbdayBookedDate=new JComboBox(bookday);
        cmbdayBookedDate.setBounds(300,510,60,20);
        frm.add(cmbdayBookedDate);

        fcarpurBtn = new JButton("Purchase");
        fcarpurBtn.setBackground(Color.yellow);
        fcarpurBtn.setBounds(180,540,100,30);
        frm.add(fcarpurBtn);
        fcarpurBtn.addActionListener(this);

        fcardisBtn = new JButton("Display");
        fcardisBtn.setBackground(Color.yellow);
        fcardisBtn.setBounds(300,540,100,30);
        frm.add(fcardisBtn);
        fcardisBtn.addActionListener(this);

        //............................GUI for Electric car.............................
        ecarlblTitle =new JLabel();       
        ecarlblTitle.setText("Electric car ");
        ecarlblTitle.setBounds(600, 20, 500, 40);
        frm.add(ecarlblTitle);
        Font fff=new Font("Serif",Font.BOLD,22);
        ecarlblTitle.setFont(fff);

        ecarlblCarID=new JLabel("Car ID:");
        ecarlblCarID.setBounds(460,70,100,20);
        frm.add(ecarlblCarID);

        ecartxtCarID=new JTextField("");
        ecartxtCarID.setBounds(530,70,100,20);
        frm.add(ecartxtCarID);

        ecarlblcarName=new JLabel("Car Name:");
        ecarlblcarName.setBounds(660, 70, 100, 20);
        frm.add(ecarlblcarName);

        ecartxtCarName=new JTextField("");
        ecartxtCarName.setBounds(730,70,100,20);
        frm.add(ecartxtCarName);

        ecarlblcarBrand=new JLabel("Car Brand:");
        ecarlblcarBrand.setBounds(460,130,150,20);
        frm.add(ecarlblcarBrand);

        ecartxtcarBrand=new JTextField("");
        ecartxtcarBrand.setBounds(530,130,100,20);
        frm.add(ecartxtcarBrand);

        ecarlblCarPrice=new JLabel("Car Price:");
        ecarlblCarPrice.setBounds(660,130,150,20);
        frm.add(ecarlblCarPrice);

        ecartxtCarPrice=new JTextField("");
        ecartxtCarPrice.setBounds(730,130,100,20);
        frm.add(ecartxtCarPrice);

        lblBatteryCapacity=new JLabel("Battery Capacity:");
        lblBatteryCapacity.setBounds(460,190,150,20);
        frm.add(lblBatteryCapacity);

        txtBatteryCapacity=new JTextField("");
        txtBatteryCapacity.setBounds(570,190,100,20);
        frm.add(txtBatteryCapacity);

        ecaraddBtn = new JButton("Add");
        ecaraddBtn.setBackground(Color.red);
        ecaraddBtn.setBounds(730,190,100,30);
        frm.add(ecaraddBtn);
        ecaraddBtn.addActionListener(this);
        // buy and sell for electric car.......................//

        ecarlblCarID1=new JLabel("Car ID:");
        ecarlblCarID1.setBounds(460,240,100,20);
        frm.add(ecarlblCarID1);

        ecartxtCarID1=new JTextField("");
        ecartxtCarID1.setBounds(530,240,100,20);
        frm.add(ecartxtCarID1);

        ecarlblcarName1=new JLabel("Car Name:");
        ecarlblcarName1.setBounds(660, 240, 100, 20);
        frm.add(ecarlblcarName1);

        ecartxtCarName1=new JTextField("");
        ecartxtCarName1.setBounds(730,240,100,20);
        frm.add(ecartxtCarName1);

        ecarlblcarBrand1=new JLabel("Car Brand:");
        ecarlblcarBrand1.setBounds(460,300,150,20);
        frm.add(ecarlblcarBrand1);

        ecartxtcarBrand1=new JTextField("");
        ecartxtcarBrand1.setBounds(530,300,100,20);
        frm.add(ecartxtcarBrand1);

        ecarlblCarPrice1=new JLabel("Car Price:");
        ecarlblCarPrice1.setBounds(660,300,150,20);
        frm.add(ecarlblCarPrice1);

        ecartxtCarPrice1=new JTextField("");
        ecartxtCarPrice1.setBounds(730,300,100,20);
        frm.add(ecartxtCarPrice1);

        ecarlblcarcolor=new JLabel("Car Color:");
        ecarlblcarcolor.setBounds(460,360,150,20);
        frm.add(ecarlblcarcolor);

        ecartxtcarcolor=new JTextField("");
        ecartxtcarcolor.setBounds(530,360,100,20);
        frm.add(ecartxtcarcolor);

        lblBatteryWarranty=new JLabel("Warranty:");
        lblBatteryWarranty.setBounds(660,360,150,20);
        frm.add(lblBatteryWarranty);

        txtBatteryWarranty=new JTextField("");
        txtBatteryWarranty.setBounds(730,360,100,20);
        frm.add(txtBatteryWarranty);

        lblCustomername=new JLabel("Cust Name:");
        lblCustomername.setBounds(460,420,150,20);
        frm.add(lblCustomername);

        txtCustomername=new JTextField("");
        txtCustomername.setBounds(530,420,100,20);
        frm.add(txtCustomername);

        lblRange=new JLabel("Range:");
        lblRange.setBounds(660,420,150,20);
        frm.add(lblRange);

        txtRange=new JTextField("");
        txtRange.setBounds(730,420,100,20);
        frm.add(txtRange);

        lblRechargetime=new JLabel("Rechargetime:");
        lblRechargetime.setBounds(460,480,150,20);
        frm.add(lblRechargetime);

        txtRechargetime=new JTextField("");
        txtRechargetime.setBounds(560,480,100,20);
        frm.add(txtRechargetime);

        ecarlblPurchaseDate=new JLabel("Purchase Date");
        ecarlblPurchaseDate.setBounds(460,530,100,20);
        frm.add(ecarlblPurchaseDate);

        String[] purcyear = { "2000", "2001", "2002", "2003", "2004", "2005", "2006","2007","2008", "2009", "2010", "2011","2012", 
                "2013", "2014", "2015", "2016", "2017" ,"2018", "2019", "2020", "2021","2022"};
        ecarcmbyearPurchaseDate=new JComboBox(purcyear);
        ecarcmbyearPurchaseDate.setBounds(560,530,60,20);
        frm.add(ecarcmbyearPurchaseDate);

        String[] purcmonth = {"January","February", "March", "April", "May", "June","July", "August", "September", 
                "October", "November", "December"};
        ecarcmbmthPurchaseDate=new JComboBox(purcmonth);
        ecarcmbmthPurchaseDate.setBounds(640,530,60,20);
        frm.add(ecarcmbmthPurchaseDate);

        String[] purcday = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" ,"15", "16", "17", "18", "19",
                "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30","31"};
        ecarcmbdayPurchaseDate=new JComboBox(purcday);
        ecarcmbdayPurchaseDate.setBounds(720,530,60,20);
        frm.add(ecarcmbdayPurchaseDate);

        buyBtn = new JButton("Buy");
        buyBtn.setBackground(Color.green);
        buyBtn.setBounds(580,580,100,30);
        frm.add(buyBtn);
        buyBtn.addActionListener(this);

        ecardisBtn = new JButton("Display");
        ecardisBtn.setBackground(Color.green);
        ecardisBtn.setBounds(460,580,100,30);
        frm.add(ecardisBtn);
        ecardisBtn.addActionListener(this);

        sellBtn = new JButton("Sell");
        sellBtn.setBackground(Color.green);
        sellBtn.setBounds(710,580,100,30);
        frm.add(sellBtn);
        sellBtn.addActionListener(this);

        clrBtn = new JButton("Clear");
        clrBtn.setBackground(Color.red);
        clrBtn.setBounds(350,600,100,30);
        frm.add(clrBtn);
        clrBtn.addActionListener(this);

        frm.setSize(900,700);
        frm.setLayout(null);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == fcaraddBtn){
            int carId=0;
            int numberOfSeats=0;
            int mileage=0;
            String carName="";
            String carBrand="";
            String fuelType="";
            String carPrice="";
            try{
                carId = Integer.parseInt(txtCarIDfuel.getText());
                carName = txtcarNamefuel.getText();
                carBrand = txtcarBrandfuel.getText();
                fuelType = txtFuelType.getText();
                numberOfSeats = Integer.parseInt(txtNumberofSeats.getText());
                mileage = Integer.parseInt(txtMileage.getText());
                carPrice = txtCarPricefuel.getText();
                boolean isDuplicatecarId = false;

                for(Car cars:list){
                    if(cars.getCarId() == carId){
                        isDuplicatecarId= true;
                        break;
                    }
                }

                if(isDuplicatecarId == false){
                    FuelCar fuel= new FuelCar(carId,carName,carBrand,carPrice,fuelType,numberOfSeats,mileage);
                    list.add(fuel);
                    JOptionPane.showMessageDialog(frm,"Car has been added."+ list.size());
                }
                else{
                    JOptionPane.showMessageDialog(frm, "Car Id already exits. Please enter the new Car Id");
                }

            }catch(Exception ex){
                JOptionPane.showMessageDialog(frm, "Please check if you have entered valid information");
            }
        }
        if(e.getSource() == clrBtn)
        {
            // clearing textfield of Fuelcar
            txtCarIDfuel.setText("");
            txtcarNamefuel.setText("");
            txtcarBrandfuel.setText("");
            txtCarPricefuel.setText("");
            txtCarColorfuel.setText("");
            txtFuelType.setText("");
            txtNumberofSeats.setText("");
            txtMileage.setText("");
            txtTransmissionType.setText("");
            txtCarIDfuel1.setText("");
            txtcarNamefuel1.setText("");
            txtcarBrandfuel1.setText("");
            txtDistributorname.setText("");
            // clearing textfield of Electriccar
            ecartxtCarID.setText("");
            ecartxtCarName.setText("");
            ecartxtcarBrand.setText("");
            ecartxtCarPrice.setText("");
            txtBatteryCapacity.setText("");
            txtBatteryWarranty.setText("");
            txtCustomername.setText("");
            txtRange.setText("");
            ecartxtcarcolor.setText("");
            ecartxtCarID1.setText("");
            ecartxtCarName1.setText("");
            ecartxtcarBrand1.setText("");
            ecartxtCarPrice1.setText("");
            txtRechargetime.setText("");

        }
        if(e.getSource()== ecaraddBtn){
            int  carID3 = 0;
            String carName = "";
            String carBrand = "";
            int batteryCapacity = 0;
            String carPrice = "";

            try{
                int carID= Integer.parseInt(ecartxtCarID.getText());
                String CarName = ecartxtCarName.getText();
                String CarBrand = ecartxtCarID.getText();
                String CarPrice = ecartxtCarID.getText();
                int BatteryCapacity= Integer.parseInt(txtBatteryCapacity.getText());

                boolean carIDFound = false;
                for(Car cars :list){
                    if(cars.getCarId()== carID3){
                        carIDFound = true;
                        break;
                    }
                }
                if(carIDFound==false){
                    ElectricCar electric= new ElectricCar(carID,CarName,CarBrand,CarPrice,BatteryCapacity);
                    list.add(electric);
                    JOptionPane.showMessageDialog(frm,"Car has been added."+list.size());

                }else{
                    JOptionPane.showMessageDialog(frm,"CarID  already exists please enter new Car ID");
                }

            }catch(Exception ex1){
                JOptionPane.showMessageDialog(frm,"Please Enter Valid Informations");
            }
        }

        if(e.getSource()==fcardisBtn)
        {
            if(list.size()<=0){
                JOptionPane.showMessageDialog(frm,"FuelCar is not Added");
            }else{
                JOptionPane.showMessageDialog(frm,"Fuel Car detail is displayed");

                for(Car var5:list){
                    if(var5 instanceof FuelCar){
                        System.out.println("fuelcar is displayed");
                        FuelCar fuel=(FuelCar) var5;
                        fuel.display();

                    }
                }
            }
        }
        if(e.getSource() == fcarpurBtn){

            try{
                int carId = Integer.parseInt(txtCarIDfuel1.getText());
                String carName = txtcarNamefuel1.getText();
                String carBrand = txtcarBrandfuel1.getText();
                String carColor = txtCarColorfuel.getText();
                String transmissionType = txtTransmissionType.getText();
                String distributorName = txtDistributorname.getText();
                String purchasedDate = String.valueOf(cmbyearPurchaseDate.getSelectedItem())+String.valueOf(cmbmthPurchaseDate.getSelectedItem()) + String.valueOf(cmbdayPurchaseDate.getSelectedItem());
                String bookedDate = String.valueOf(cmbyearBookedDate.getSelectedItem())+String.valueOf(cmbmthBookedDate.getSelectedItem()) + String.valueOf(cmbdayBookedDate.getSelectedItem());
                boolean isCarIdThere = false;
                for(Car car:list){
                    if(car.getCarId() == carId){
                        if(car instanceof FuelCar){
                            FuelCar fuelCar = (FuelCar)car;
                            if(fuelCar.getIsPurchased() == true){
                                fuelCar.setCarColor(carColor);
                                JOptionPane.showMessageDialog(frm, "FuelCar has already been purchased : " + distributorName);

                            }
                            else{
                                fuelCar.setDistributorName(distributorName);
                                fuelCar.setTransmissionType(transmissionType);
                                JOptionPane.showMessageDialog(frm, "FuelCar has  been sucessfully purchased");
                            }
                            fuelCar.purchasedFuelCar(bookedDate, purchasedDate);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(frm, "PurchasedCarId doesnot found");
                    }
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(frm, "Invalid Data! please enter a valid Data");
            }
        }
        //event handling for the Electric car// 
        if(e.getSource()==ecardisBtn)
        {
            if(list.size()<=0){
                JOptionPane.showMessageDialog(frm,"Electric Car is not Added");
            }else{
                JOptionPane.showMessageDialog(frm,"Electric Car detail is displayed");
                for(Car var5:list){
                    if(var5 instanceof ElectricCar){
                        System.out.println("Electric car is displayed: ");
                        ElectricCar obj5=(ElectricCar)var5;
                        obj5.display();
                        JOptionPane.showMessageDialog(frm,"Electric Car detail is displayed");

                    }
                }
            }
        }

        if(e.getSource()== buyBtn){
            System.out.println("Buy button is pressed");
            try{
                int carID = Integer.parseInt(ecartxtCarID1.getText());
                if(list.isEmpty()){
                    JOptionPane.showMessageDialog(frm,"Car List is Empty");
                }else{
                    boolean isThere =false;
                    for(Car car:list){
                        System.out.println(car.getCarName());
                        if(car.getCarId()==carID && car instanceof ElectricCar){
                            
                                ElectricCar electricCar =(ElectricCar)car;
                                String boughtDate = String.valueOf(ecarcmbyearPurchaseDate.getSelectedItem())+String.valueOf(ecarcmbmthPurchaseDate.getSelectedItem()) + String.valueOf(ecarcmbdayPurchaseDate.getSelectedItem());
                                String customerName = txtCustomername.getText();
                                int Warranty = Integer.parseInt(txtBatteryWarranty.getText());
                                String range = txtRange.getText();
                                int rechargeTime = Integer.parseInt(txtRechargetime.getText());
                                if(electricCar.getIsBought() == false){
                                    JOptionPane.showMessageDialog(frm,"Electric Car has been Bought");
                                    
                                } else{
                                    JOptionPane.showMessageDialog(frm,"Electric Car has been already Bought");
                                }
                                electricCar.buyElectricCar(customerName, Warranty, boughtDate, range, rechargeTime);
                                isThere=false;
                                break;
                            }
                        
                        else{
                            isThere = true;
                            
                            
                        }

                    }
                        if(isThere == true){
                            JOptionPane.showMessageDialog(frm, "No Record Found ");
                        }

                    }
                
            }
            catch(Exception ex2){
                JOptionPane.showMessageDialog(frm,"Please Enter the Valid ID. ID should be Number");

            }
        }
    

        if(e.getSource()== sellBtn){
            System.out.println("Sell button is pressed");
            try{
                int carID = Integer.parseInt(ecartxtCarID1.getText());
                if(list.isEmpty()){
                    JOptionPane.showMessageDialog(frm,"Car List is Empty");
                }else{
                    boolean isThere = false;
                    for(Car car:list){
                        if(car.getCarId() == carID && car instanceof ElectricCar){
                             

                                ElectricCar electricCar =(ElectricCar)car;
                                
                                 if(electricCar.getIsSold() == false){
                                      electricCar.sellElectricCar( txtCustomername.getText());
                                     JOptionPane.showMessageDialog(frm,"Electric Car has been sold");

                                } else{
                                    JOptionPane.showMessageDialog(frm,"Electric Car has been already sold");
                                }
                                isThere=false;
                                break;
                            

                        }
                        else
                            isThere = true;

                    }
                    if(isThere == true){
                        JOptionPane.showMessageDialog(frm, "No Record Found ");
                    }

                } 

            }

            catch(Exception ex3){
                JOptionPane.showMessageDialog(frm,"Please Enter the Valid ID. ID should be Number");

            }
        }  
    }
}


    


 
