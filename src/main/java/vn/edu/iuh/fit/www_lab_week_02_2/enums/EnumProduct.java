package vn.edu.iuh.fit.www_lab_week_02_2.enums;

public enum EnumProduct {
    ACTIVE(1),
    IN_ACTIVE(0),
    TERMINATED(-1);
    ;

    private int value;

    EnumProduct(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
