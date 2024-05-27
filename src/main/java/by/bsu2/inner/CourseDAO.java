package by.bsu2.inner;

public class CourseDAO implements BaseDAO, GeneralDAO {
    @Override
    public boolean insert(Entity ob) {
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
    public void closeConnection() {
        // код закрытия соединения Course
    }
}
