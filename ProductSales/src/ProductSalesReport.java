public class ProductSalesReport {

    public static void main(String[] args) {

        // Two-dimensional array
        int[][] productSales = {
                {300, 150, 700},
                {250, 200, 600}
        };

        // Single-dimensional array
        int[] allSales = new int[6];

        int index = 0;

        for (int[] year : productSales) {
            for (int sale : year) {
                allSales[index] = sale;
                index++;
            }
        }

        ProductSales sales = new ProductSales();

        int total = sales.TotalSales(productSales);
        double average = sales.AverageSales(productSales);
        int maximum = sales.MaxSale(productSales);
        int minimum = sales.MinSale(productSales);

        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("--------------------------------");

        System.out.println("Total sales:    " + total);

        System.out.printf("Average sales:  %.0f%n", average);

        System.out.println("Maximum sale:   " + maximum);

        System.out.println("Minimum sale:   " + minimum);

        System.out.println("--------------------------------");
    }
}
