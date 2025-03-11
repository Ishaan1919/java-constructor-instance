class Vehicle{
    private String ownerName;
    private String vehicleType;
    static int registrationFee = 10000;

    protected Vehicle(String ownerName, String vehicleType, int fee){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        registrationFee = fee;
    }

    protected void displayVehicleDetails(){
        System.out.println("Owner of the vehicle is " + ownerName);
        System.out.println("Type of the vehicle is " + vehicleType);
        System.out.println("Registration fee for all the vehicles is " + registrationFee + " Rs.");
    }
    static void updateRegistrationFee(int updateRegistrationFee){
        registrationFee = updateRegistrationFee;
    }
}

class VehicleRegistration{
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Ishaan", "car", 9000);
        car.displayVehicleDetails();
        Vehicle.updateRegistrationFee(90000);
        car.displayVehicleDetails();

//        Owner of the vehicle is Ishaan
//        Type of the vehicle is car
//        Registration fee for all the vehicles is 9000 Rs.
//        Owner of the vehicle is Ishaan
//        Type of the vehicle is car
//        Registration fee for all the vehicles is 90000 Rs.
    }
}

