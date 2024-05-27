package by.bsu2.inner;

/**
 * Created by Ihar_Blinou on 12/11/2015.
 */
public interface GeneralDAO {
    default void closeConnection() {
        // код закрытия соединения General
    }
}
