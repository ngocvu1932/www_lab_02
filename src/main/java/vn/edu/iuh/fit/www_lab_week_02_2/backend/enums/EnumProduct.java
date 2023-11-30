package vn.edu.iuh.fit.www_lab_week_02_2.backend.enums;

public enum EnumProduct {
    ACTIVE(0),
    IN_ACTIVE(1),
    TERMINATED(2);
    ;
    private int value;

    EnumProduct(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
