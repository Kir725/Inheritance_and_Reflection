package com.kolmikra.items;

import java.util.Objects;

public class Item {
    private String description;
    private double price;

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof Item)) return false;
        Item item = (Item) otherObject;
        return Double.compare(item.price, price) == 0 &&
                Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price);
    }
}
