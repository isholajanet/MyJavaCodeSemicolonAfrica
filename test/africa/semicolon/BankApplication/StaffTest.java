package africa.semicolon.BankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StaffTest {
    Staff bankStaff;
    @BeforeEach
    void setUp(){
        bankStaff = new Staff("admin", 1234);

    }



}
