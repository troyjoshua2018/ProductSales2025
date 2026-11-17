import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main {

    private ProductSales sales = new ProductSales();

    private int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
    };

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {

        int expectedTotal = 2200;

        int actualTotal = sales.TotalSales(productSales);

        assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void AverageSales_ReturnsAverageProductSales() {

        double expectedAverage = 2200.0 / 6;

        double actualAverage = sales.AverageSales(productSales);

        assertEquals(expectedAverage, actualAverage, 0.001);
    }
}

