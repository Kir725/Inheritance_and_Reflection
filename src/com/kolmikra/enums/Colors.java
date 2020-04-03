package com.kolmikra.enums;

public enum Colors {
    BLACK("Black"), RED("Red"), BLUE("Blue"), GREEN("Green"),
    CYAN("Cyan"), MAGENTA("Magenta"), YELLOW("Yellow"), WHITE("White");
    private String color;

    Colors(String color) {
        this.color = color;
    }

    public String getBlue() {
        return BLUE.color;
    }

    public String getRed() {
        return RED.color;
    }

    public String getGreen() {
        return GREEN.color;
    }
}
