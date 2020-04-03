package com.kolmikra.items;

import java.util.Objects;

public class DiscountedItem extends Item {
    private double discount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        if (!(o instanceof DiscountedItem)) {
            return o.equals(this);
        }
        return super.equals(o) && Double.compare(((DiscountedItem) o).discount, discount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}
