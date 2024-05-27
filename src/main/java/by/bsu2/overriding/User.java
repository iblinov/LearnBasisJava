package by.bsu2.overriding;

public class User {
  private long userId;
  private String name;
  private Role role = Role.valueOf("Guest".toUpperCase());

}
