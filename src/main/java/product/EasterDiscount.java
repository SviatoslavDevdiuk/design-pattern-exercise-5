package product;

public class EasterDiscount implements DiscountStrategy {
    @Override
    public void discountCalculation(Product product, DiscountType discountType) {
        product.setDiscount(product.getCost() * 0.10);
    }
}
