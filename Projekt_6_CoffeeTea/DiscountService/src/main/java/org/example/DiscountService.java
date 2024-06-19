package org.example;

public class DiscountService implements ReduceInterface{
    @Override
    public double applyDiscount(String code) {
        try {
            DiscountCode discountCode = DiscountCode.getByCode(code);
            return discountCode.getDiscount();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
