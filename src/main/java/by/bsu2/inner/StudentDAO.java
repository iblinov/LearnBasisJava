package by.bsu2.inner;

public class StudentDAO implements BaseDAO {
    public StudentDAO() {
        BaseDAO.configure("config.txt");//????
    }
    @Override
    public boolean insert(Entity ob) {
        this.closeConnection();
        return false;
    }
    @Override
    public boolean delete(Entity ob) {
        return false;
    }
    @Override
    public Entity update(Entity ob) {
        return null;
    }
    @Override
    public Entity findEntityById(long id) {
        return null;
    }
}
