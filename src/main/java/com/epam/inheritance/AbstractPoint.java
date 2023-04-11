package com.epam.inheritance;

import java.util.StringJoiner;

public abstract class AbstractPoint   {
  private long pointId;
  public AbstractPoint() {
  }

  public AbstractPoint(long pointId) {
    this.pointId = pointId;
  }

  public long getPointId() {
    return pointId;
  }

  public void setPointId(long pointId) {
    this.pointId = pointId;
  }
  public abstract double distance();
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof AbstractPoint)) return false;

    AbstractPoint that = (AbstractPoint) o;

    return pointId == that.pointId;
  }

  @Override
  public int hashCode() {
    return (int) (pointId ^ (pointId >>> 32));
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", AbstractPoint.class.getSimpleName() + "[", "]")
            .add("pointId=" + pointId)
            .toString();
  }
}
