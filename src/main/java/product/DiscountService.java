package product;

public class DiscountService implements DiscountStrategy {

    DiscountStrategy discountStrategy;

    @Override
    public void discountCalculation(Product product, DiscountType discountType) {
        if (discountType.equals(DiscountType.CHRISTMAS)) {
            discountStrategy = new ChristmasDiscount();
            discountStrategy.discountCalculation(product, discountType);
            printDiscount(product, discountType);

        } else if (discountType.equals(DiscountType.EASTER)) {
            discountStrategy = new EasterDiscount();
            discountStrategy.discountCalculation(product, discountType);
            printDiscount(product, discountType);

        } else if (discountType.equals(DiscountType.NEWYEAR)) {
            discountStrategy = new NewYearDiscount();
            discountStrategy.discountCalculation(product, discountType);
            printDiscount(product, discountType);
        }


    }

    public void printDiscount(Product product, DiscountType discountType) {
        System.out.println( discountType.toString() + " discount for " + product.getName() +
                " with price " + product.getCost() + " is: " + product.getDiscount());
    }


}
