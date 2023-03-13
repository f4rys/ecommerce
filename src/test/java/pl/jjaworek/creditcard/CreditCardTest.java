package pl.jjaworek.creditcard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions. *;
import java.math.BigDecimal;

public class CreditCardTest {

    @Test
    void itAllowsToAssignCreditLimit(){
        //Arrange
        CreditCard card = new CreditCard("1234-5678");
        //Act
        card.assignCredit(BigDecimal.valueOf(1000));
        //Assert
        assertEquals(BigDecimal.valueOf(1000), card.getBalance());
    }

    @Test
    void itAllowsToAssignCreditLimits(){
        //Arrange
        CreditCard card = new CreditCard("1134-5678");
        CreditCard card1 = new CreditCard("1234-5678");
        //Act
        card.assignCredit(BigDecimal.valueOf(1000));
        card1.assignCredit(BigDecimal.valueOf(1200));
        //Assert
        assertEquals(BigDecimal.valueOf(1000), card.getBalance());
        assertEquals(BigDecimal.valueOf(1200), card1.getBalance());
    }

    @Test
    void itCantAssignLimitBelowCertainThreshold(){
        CreditCard card1 = new CreditCard("3254-1234");

        try{
            card1.assignCredit(BigDecimal.valueOf(10));
            fail("Should throw exception");
        } catch (CreditLimitBelowThresholdException e){
            assertTrue(true);
        }

        assertThrows(CreditLimitBelowThresholdException.class,
                () -> card1.assignCredit(BigDecimal.valueOf(10)));
        assertThrows(CreditLimitBelowThresholdException.class,
                () -> card1.assignCredit(BigDecimal.valueOf(99)));
        assertDoesNotThrow(
                () -> card1.assignCredit(BigDecimal.valueOf(100)));
    }

    @Test
    void checkDoublesAndFloat(){
        //double x1 = 0.01;
        //double x2 = 0.03;
        //double result = x2 - x1;

        //float y1 = 0.01;
        //float y2 = 0.03;
        //float yresult = y2 - y1;
    }

}
