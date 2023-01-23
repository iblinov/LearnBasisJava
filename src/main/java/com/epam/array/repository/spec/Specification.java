package com.epam.array.repository.spec;

import com.epam.array.entity.CustomArray;

public interface Specification {
  boolean specify(CustomArray array);
}
