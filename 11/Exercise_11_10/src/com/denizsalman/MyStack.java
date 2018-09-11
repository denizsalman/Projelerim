package com.denizsalman;

import java.util.ArrayList;

public class MyStack extends ArrayList {

    public Object pop() {
        Object object = this.get(size() - 1);
        this.remove(size() - 1);
        return object;
    }

    public void push(Object object) {
        this.add(object);
    }
}
