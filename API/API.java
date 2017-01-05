package JM5.API;

import JM5.BookingComAPI;
import JM5.GoogleAPI;
import JM5.Room;
import JM5.TripAdvisorAPI;

import java.util.List;


public interface API {
    List<Room> findRooms(int price, int persons, String city, String hotel);

    List<Room> getRooms();



    static API[] getAllSearchAPI(){
        API[] apis = new API[3];
        apis[0] = new BookingComAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2] = new GoogleAPI();
        return apis;
    }
}
