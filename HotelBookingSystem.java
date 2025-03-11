class HotelBooking{
    String guestName;
    String roomType;
    int nights;

    protected HotelBooking(){
        this.guestName = "";
        this.roomType = "";
        this.nights = 0;
    }

    protected HotelBooking(String name, String type, int nights){
        this.guestName = name;
        this.roomType = type;
        this.nights = nights;
    }

    protected HotelBooking(HotelBooking guest){
        this.guestName = guest.guestName;
        this.roomType = guest.roomType;
        this.nights = guest.nights;
    }

    protected void display(){
        System.out.println("Guest Name is " + this.guestName);
        System.out.println("Type of room the guest has" + this.roomType);
        System.out.println("The number of nights the guest is staying is " + this.nights);
    }
}


public class HotelBookingSystem{
    public static void main(String[] args) {
        HotelBooking guest1 = new HotelBooking();
        guest1.display();

        HotelBooking guest2 = new HotelBooking("Ishaan", "Normal", 2);
        guest2.display();

        HotelBooking guest3 = new HotelBooking(guest2);
        guest3.display();

//         Guest Name is
//         Type of room the guest has
//         The number of nights the guest is staying is 0
//
//         Guest Name is Ishaan
//         Type of room the guest hasNormal
//         The number of nights the guest is staying is 2
//
//         Guest Name is Ishaan
//         Type of room the guest hasNormal
//         The number of nights the guest is staying is 2
    }
}