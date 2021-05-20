package africa.semicolon.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {
    Invoice myInvoice;
    @BeforeEach
    public void RunThisBeforeEachTest(){
        myInvoice = new Invoice("1203940950", "A table", 4, 100.00);
    }
    @Test
    public void testThatInvoicePartNumberCanBeSet(){
        myInvoice.setPartNumber("1233444555");
        assertEquals("1233444555", myInvoice.getPartNumber());
    }
    @Test
    public void testThatInvoicePartDescriptionCanBeSet(){
        myInvoice.setPartDescription("A book");
        assertEquals("A book", myInvoice.getPartDescription());
    }
    @Test
    public void testThatInvoiceQuantityCanBeSet(){
        myInvoice.setQuantity(4);
        assertEquals(4, myInvoice.getQuantity());
    }
    @Test
    public void testThatInvoicePriceCanBeSet(){
        myInvoice.setPrice(100.00);
        assertEquals(100.00, myInvoice.getPrice());
    }
    @Test
    public void testThatInvoiceCanGetInvoiceAmount(){
        myInvoice.setQuantity(4);
        myInvoice.setPrice(200.00);
        myInvoice.invoiceAmount();
        assertEquals(800.00, myInvoice.getInvoiceAmount());
    }
    @Test
    public void testThatInvoiceAmountWillBeZeroIfQuantityIsNotPositive(){
        myInvoice.setQuantity(-5);
        myInvoice.setPrice(200.00);
        myInvoice.invoiceAmount();
        assertEquals(0, myInvoice.getInvoiceAmount());
    }
    @Test
    public void testThatInvoiceAmountWillBeZeroIfPriceIsNotPositive(){
        myInvoice.setQuantity(5);
        myInvoice.setPrice(-200.00);
        myInvoice.invoiceAmount();
        assertEquals(0.0, myInvoice.getInvoiceAmount());
    }
}
