package com.optionexample.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DataBaseHelper {
    private final static String SQL_INSERT_ABONENT =
            "INSERT INTO phonebook(idphonebook, lastname, phone ) VALUES(?,?,?)";
    private Connection connection;

    public DataBaseHelper() throws SQLException {
       // connection = ConnectorDB.getConnection();
    }

    public boolean insert(Abonent ab) {
        boolean flag = false;
        try(PreparedStatement ps = connection.prepareStatement(SQL_INSERT_ABONENT)) {
            ps.setInt(1, ab.getId());
            ps.setString(2, ab.getName());
            ps.setInt(3, ab.getPhone());
            ps.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
}

