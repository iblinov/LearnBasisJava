package by.bsu2.overriding;

public enum Role {
  GUEST {
    @Override
    public void methodTwo() {

    }
  }, CLIENT(20) {
    @Override
    public void methodTwo() {

    }
  }, MODERATOR(5) {
    @Override
    public void methodTwo() {

    }
  }, ADMINISTRATOR(1) {
    @Override
    public void methodTwo() {

    }
  };
  private int currentUserNumber;

  Role() {
  }

  Role(int currentUserNumber) {
    this.currentUserNumber = currentUserNumber;
  }

  public void method(){
    System.out.println("method" + this.name());
  }

  public void setCurrentUserNumber(int currentUserNumber) {
    this.currentUserNumber = currentUserNumber;
  }
  public  void methodTwo(){}
  public int getCurrentUserNumber() {
    return currentUserNumber;
  }
}
