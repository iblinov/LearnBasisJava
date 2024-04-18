package com.epam.array.entity;

import java.util.EventObject;

public class ArrayEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ArrayEvent(CustomArrayE source) {
        super(source);
    }

    @Override
    public CustomArrayE getSource() {
        return (CustomArrayE) super.getSource();
    }
}
