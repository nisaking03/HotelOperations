package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }


    public double getPrice(){
        double basePrice;
        if(roomType.equalsIgnoreCase("king")){
            basePrice = 139;
        }
        else if (roomType.equalsIgnoreCase("double")){
            basePrice = 124;
        }
        else{
            return 0;
        }

        if(isWeekend){
            return basePrice * 1.10;
        }
        else{
            return basePrice;
        }
    }
    public double getReservationTotal(){
        return getPrice() * numberOfNights;
    }
}
