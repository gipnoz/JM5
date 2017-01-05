package JM5.API;


import JM5.Room;

import java.util.ArrayList;
import java.util.List;

public abstract class APIabstr implements API{
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> foundRooms = new ArrayList<>();
        for (Room r : getRooms()) {
            if ((price == r.getPrice()) && (persons == r.getPersons()) && (city.equals(r.getCityName()) && (hotel.equals(r.getHotelName())))) {
                foundRooms.add(r);
            }
        }
        return foundRooms;
    }
}

