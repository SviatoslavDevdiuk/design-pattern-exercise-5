package product;

public class NewYearDiscount implements DiscountStrategy {
    @Override
    public void discountCalculation(Product product, DiscountType discountType) {
        product.setDiscount(product.getCost() * 0.20);
    }
}
