package org.example;

public enum DiscountCode {

    DISCOUNT10("extra10", 10),
    DISCOUNT20("extra20", 20);

    private String code;
    private int discount;

    DiscountCode(String code, int discount) {
        this.code = code;
        this.discount = discount;
    }

    public String getCode() {
        return code;
    }

    public int getDiscount() {
        return discount;
    }

    public static DiscountCode getByCode(String code) throws Exception {
        for (DiscountCode discountCode : values()) {
            if (discountCode.getCode().equals(code)) {
                return discountCode;
            }
        }
        throw new Exception("Invalid or expired code");
    }
}
