package africa.semicolon.chapterSeven.TotalSales;

import org.junit.jupiter.api.BeforeEach;

public class SlipTest {
    Slip slip;
    Product product;

    @BeforeEach
    void setUp(){
        product = new Product(1, 200.00);
        slip = new Slip(product, 3);
    }

}
