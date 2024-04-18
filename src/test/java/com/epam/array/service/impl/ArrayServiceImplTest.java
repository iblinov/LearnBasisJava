package com.epam.array.service.impl;

import com.epam.array.entity.CustomArray;
import com.epam.array.service.ArrayService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceImplTest {

    @BeforeAll
    static void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test()
    void findMinPositive() {
        int [] a = {3, 0, 5};
        CustomArray customArray = new CustomArray(a);
        ArrayService service = new ArrayServiceImpl();
        int actual = service.findMin(customArray);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}
