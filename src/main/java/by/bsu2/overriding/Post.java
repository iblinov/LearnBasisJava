package by.bsu2.overriding;

public class Post <K extends Number, V> {
  private K postId;
  private V message;

  public V getMessage() {
    return message;
  }

  public void setMessage(V message) {
    this.message = message;
  }

  public void setPostId(K postId) {
    this.postId = postId;
  }
}
