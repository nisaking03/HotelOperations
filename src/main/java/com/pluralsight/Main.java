package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Room> rooms = new ArrayList<>();

        Room r101 = new Room(1);
        Room r102 = new Room(2);
        Room r103 = new Room(2);
        Room r104 = new Room(2);
        Room r105 = new Room(2);

        rooms.add(r101);
        rooms.add(r102);
        rooms.add(r103);
        rooms.add(r104);
        rooms.add(r105);

        for(Room r : rooms){
            System.out.println(r);
        }

        ArrayList<Reservation> reservations = new ArrayList<>();
        Reservation res1 = new Reservation("king", 2, false);
        Reservation res2 = new Reservation("king", 2, false);
        Reservation res3 = new Reservation("king", 2, false);
        Reservation res4 = new Reservation("king", 2, false);

        reservations.add(res1);
        reservations.add(res2);
        reservations.add(res3);
        reservations.add(res4);

        for(Reservation r : reservations){
            System.out.println(r);
        }

        ArrayList<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        for(Employee e : employees){
            System.out.println(e);
        }

    }
}
