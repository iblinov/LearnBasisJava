package com.epam.array.entity;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class CustomArrayProtectMain {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        CustomArrayProtect arrayProtect = new CustomArrayProtect(arr);
//        int arr2[] = arrayProtect.getCustomArray();
//        System.out.println(arrayProtect);
//        arr2[0] = 5;
//        System.out.println(arrayProtect);
        int[] arr3 = {1, 2, 3};
        arrayProtect.setCustomArray(arr3);
        System.out.println(arrayProtect);
        arr3[1] = 11;
        System.out.println(arrayProtect);
        Path path = Path.of("data/a1.txt");
        Path path2 = FileSystems.getDefault().getPath("data/a1.txt");
        System.out.println(path);
        System.out.println(path2);
        int [] b = new int[-2];

    }
}
