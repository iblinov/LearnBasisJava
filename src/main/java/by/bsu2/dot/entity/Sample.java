package by.bsu2.dot.entity;

public class Sample {
  private String name;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Sample sample = (Sample) o;

    return name != null ? name.equals(sample.name) : sample.name == null;
  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }
}
