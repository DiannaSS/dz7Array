import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayserviceSumTest {
    @Test
    public void Sumq() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        ArrayserviceSumTest servise = new ArrayserviceSumTest();
        long actual = servise.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

    public class ArrayserviceAvgTest {
        @Test
        public void Avgq() {
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            ArrayserviceAvgTest servise = new ArrayserviceAvgTest();
            long actual = servise.avg(sales);
            long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 2;
            Assertions.assertEquals(expected, actual);
        }

        public class ArrayserviceminSalesTest {
            @Test
            public void minSales() {
                long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
                ArrayserviceminSalesTest servise = new ArrayserviceminSalesTest();
                long actual = servise.minSales(sales);
                long expected = 7;
                Assertions.assertEquals(expected, actual);
            }

            public class ArrayserviceminSalesTest {
                @Test
                public void maxSales() {
                    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
                    ArrayserviceAvgTest.ArrayserviceminSalesTest servise = new ArrayserviceAvgTest.ArrayserviceminSalesTest();
                    long actual = servise.maxSales(sales);
                    long expected = 5;
                    Assertions.assertEquals(expected, actual);
                }

            }
