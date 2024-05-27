package com.gl3;

public class RunnerNumberInfo {
    public static void main(String[] args) {
        NumberInfo info = new NumberInfo();
        Number[ ] num = {new Integer(7), 71, 3.14f, 7.2 };
        for (Number n : num) {
            info.viewNum(n);
        }
        info.viewNum(new Integer(8));
        info.viewNum(81);
        info.viewNum(4.14f);
        info.viewNum(8.2);
    }
}
