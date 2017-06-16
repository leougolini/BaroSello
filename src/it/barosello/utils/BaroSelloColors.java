package it.barosello.utils;

public enum BaroSelloColors {

    GREEN("\033[32m"),
    RED("\033[31m"),
    BLUE("\033[34m"),
    YELLOW("\033[33m"),
	COLOR_RESET("\033[0m");
    String value;

    BaroSelloColors(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
