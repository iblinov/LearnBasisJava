package by.bsu2.inner;

public interface BaseDAO {
    boolean insert(Entity ob);
    boolean delete(Entity ob);
    Entity update(Entity ob);
    Entity findEntityById(long id);
    default void closeConnection() {
        // код закрытия соединения Base
    }
    static void configure(String filename) {
        // загрузка конфигурации
    }
}
