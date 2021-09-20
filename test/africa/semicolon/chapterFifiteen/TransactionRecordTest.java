package africa.semicolon.chapterFifiteen;

import africa.semicolon.chapterFifteen.dietelExercises.TransactionRecord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TransactionRecordTest {
    TransactionRecord transactionRecord;
    Account account;

    @BeforeEach
    void setUp(){
        transactionRecord = new TransactionRecord(12345, 2500.00);
    }
    @Test
    void transactionRecordCanBeCreatedTest(){
        assertNotNull(transactionRecord);
    }
    @Test
    void transactionRecordCanGetAccountNumber(){
        transactionRecord = new TransactionRecord(12345, 10000.00);
        assertEquals(12345, transactionRecord.getAccountNumber());
    }
    @Test
    void transactionRecordCanGetAmount(){
        transactionRecord = new TransactionRecord(1234, 10000.00);
        assertEquals(10000.00, transactionRecord.getAmount());
    }
    @Test
    void transactionRecordCanCreateTest(){
        account = new Account("jane", "ishola", 1000.00, 1234);
        assertNotNull(account);
    }
    @Test
    void transactionRecordCanMatchTransactionAmount(){
        account = new Account("jane", "ishola", 2000.00, 1234);
        transactionRecord = new TransactionRecord(1234, 10000.00);
        account.combine(transactionRecord);
        assertEquals(12000.00, account.getBalance());
    }

}
