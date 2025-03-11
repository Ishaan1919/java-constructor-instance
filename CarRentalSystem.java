class CarRental{
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int costPerDay;

    protected CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = 800;
    }

    protected int getTotalRentalCost(){
        return this.costPerDay*this.rentalDays;
    }
}


public class CarRentalSystem{
    public static void main(String[] args) {
        CarRental car = new CarRental("Ishaan Gupta", "Taigun", 3);
        int totalRentalCost = car.getTotalRentalCost();
        System.out.println("The total rental cost for of the car is " + totalRentalCost);

//        The total rental cost for of the car is 2400

    }
}