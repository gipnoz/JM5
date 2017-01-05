package JM5;


import JM5.API.API;
import JM5.DAO.DAO;
import JM5.DAO.DAOImp;

import java.util.ArrayList;
import java.util.List;


public class Controller {
    API apis[] = API.getAllSearchAPI();
    DAO dbDAO = new DAOImp();


    List<Room> requestRooms(int price, int persons, String city, String hotel){
        List<Room> RoomList = new ArrayList<>();
        for (API a: apis) {
            RoomList.addAll(a.findRooms(price, persons, city, hotel));
        }
        return RoomList;
    }

    List<Room> check(API api1, API api2) {
        List<Room> checkOutSimilar = new ArrayList<>();
        for (Room r : api1.getRooms()) {
            for (Room a : api2.getRooms()) {
                if (r.equals(a)) {
                    checkOutSimilar.add(r);
                    checkOutSimilar.add(a);
                }
            }
        }
        return checkOutSimilar;
    }

}
