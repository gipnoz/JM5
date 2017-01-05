package JM5.DAO;


import JM5.Room;

import java.util.List;

public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
    List<Room> getAll();
}
