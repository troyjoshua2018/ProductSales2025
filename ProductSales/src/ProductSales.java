public class ProductSales implements IProductSales {

    @Override
    public int TotalSales(int[][] productSales) {

        int total = 0;

        for (int[] year : productSales) {
            for (int sale : year) {
                total += sale;
            }
        }

        return total;
    }

    @Override
    public double AverageSales(int[][] productSales) {

        int count = 0;

        for (int[] year : productSales) {
            count += year.length;
        }

        if (count == 0) {
            return 0.0;
        }

        return (double) TotalSales(productSales) / count;
    }

    @Override
    public int MaxSale(int[][] productSales) {

        if (productSales.length == 0 || productSales[0].length == 0) {
            throw new IllegalArgumentException("Sales data cannot be empty.");
        }

        int maximum = Integer.MIN_VALUE;

        for (int[] year : productSales) {
            for (int sale : year) {
                maximum = Math.max(maximum, sale);
            }
        }

        return maximum;
    }

    @Override
    public int MinSale(int[][] productSales) {

        if (productSales.length == 0 || productSales[0].length == 0) {
            throw new IllegalArgumentException("Sales data cannot be empty.");
        }

        int minimum = Integer.MAX_VALUE;

        for (int[] year : productSales) {
            for (int sale : year) {
                minimum = Math.min(minimum, sale);
            }
        }

        return minimum;
    }
}
