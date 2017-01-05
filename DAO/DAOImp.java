package JM5.DAO;

import JM5.Room;

import java.util.ArrayList;
import java.util.List;


public class DAOImp implements DAO {
    private List<Room> DAOImp = new ArrayList<>();
    @Override
    public Room save(Room room) {
        return null;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room update(Room room) {
        return null;
    }

    @Override
    public Room findById(long id) {
        return null;
    }

    @Override
    public List<Room> getAll() {
        return DAOImp;
    }
    public List<Room> getDaoImp(){
        return DAOImp;
    }
}
