package src.enums;

public enum ActionLetter {
    B("b"),
    C("c"),
    D("d"),
    E("e"),
    F("f"),
    G("g");

    private final String value;

    ActionLetter(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
