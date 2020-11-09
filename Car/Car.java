class Car
{
    String registration;
    String make;
    double price;
    
    //Methods to set car details below here
    
    
    
    //displayCarDetails()
    
    
    
    //Try out these 'getter' methods after you have set info.
    public String getRegistration()
    {
       return registration;
    }
    
    public String getMake()
    {
        return make;
    }

    public double getPrice()
    {
        return price;
    }
    
    public void setRegistration(String regIn) {
    	registration = regIn;
    }
    
    public void setMake(String makeIn) {
    	make = makeIn;
    }
    
    public void setPrice(double priceIn) {
    	price = priceIn;
    }
    
    public void displayDetails() {
    	System.out.printf("The car has registration number: %s%n", getRegistration());
    	System.out.printf("The car is of make: %s%n", getMake());
    	System.out.printf("The price of the car is: %f%n", getPrice());
    }
    
}


