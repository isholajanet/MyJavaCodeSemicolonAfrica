package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void testThatAccountCanDepositOnce(){
        //given
        Account janetAccount = new Account();
        //when
        janetAccount.deposit(850.00);
        //confirm
        double janetBalance = janetAccount.getAccountBalance();
        assertEquals(850.00, janetBalance);
    }

    @Test
    public void testThatAccountCanDepositTwice(){
        //given
        Account janetAccount = new Account();
        //when
        janetAccount.deposit(850.00);
        janetAccount.deposit(150.00);
        //confirm
        double janetBalance = janetAccount.getAccountBalance();
        assertEquals(1000.00, janetBalance);
    }

    @Test
    public void testThatAccountCanDepositThrice(){
        //given
        Account janetAccount = new Account();
        //when
        janetAccount.deposit(850.00);
        janetAccount.deposit(150.00);
        janetAccount.deposit(500.00);
        //confirm
        double janetBalance = janetAccount.getAccountBalance();
        assertEquals(1500.00, janetBalance);
    }
    @Test
    public void testThatAccountCanWithdraw(){
        //given
        Account janetAccount = new Account();
        //when
        janetAccount.deposit(1000.00);
        janetAccount.withdraw(850.00, 1233);

        //confirm
        double janetBalance = janetAccount.getAccountBalance();
        assertEquals(150.00, janetBalance);

    }
    @Test
    public void testThatUserCannotDepositANegativeValue(){
        //given
        Account janetAccount = new Account();
        //when
        janetAccount.deposit(850.00);
        janetAccount.deposit(-850.00);
        //confirm
        double janetBalance = janetAccount.getAccountBalance();
        assertEquals(850.00, janetBalance);
    }
    @Test
    public void testThatUserCanSetPin(){
        //given
        Account janetAccount = new Account();
        //when
        janetAccount.setAccountPin(3456);
        //System.out.print("Set your 4-digit pin: ");
        //Scanner input = new Scanner(System.in);
        //int pin = input.nextInt();
        double pin = janetAccount.getMyAccountPin();
        assertEquals(3456, pin);
        //System.out.println();
    }
}
