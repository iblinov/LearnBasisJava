package task;

import wildcard.Person1;

import java.sql.ResultSet;

public interface Mapper<T extends Person1> {
  T buildObj(ResultSet resultSet);
}
