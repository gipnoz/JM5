package JM5;

import JM5.API.API;
import JM5.API.APIabstr;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingComAPI extends APIabstr implements API {
    private List<Room> bookingComAPI = new ArrayList<>();

    public  BookingComAPI() {
        bookingComAPI.add (new Room(1, 200, 2, new Date(), "BlackSea", "Odessa"));
        bookingComAPI.add (new Room(2, 400, 3, new Date(), "Stolychniy", "Kyiv"));
        bookingComAPI.add (new Room(3, 300, 5, new Date(), "Grand Canyon Luxury Resort & SPA 5*", "Zaporogye"));
        bookingComAPI.add (new Room(4, 500, 2, new Date(), "Bristol", "Odessa"));
        bookingComAPI.add (new Room(5, 1000, 2, new Date(), "Continental", "Kyiv"));
    }

    @Override
    public List<Room> getRooms() {
        return bookingComAPI;
    }
}
