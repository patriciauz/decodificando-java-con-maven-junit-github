package org.medellin.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {

    private final BasicCalculator basicCalculator=new BasicCalculator();

    @Test
    @DisplayName("testing sum 4 + 2 = 6")
    public void sum(){

        Long num1=4L;
        Long num2=2L;
        Long expectative=6L;

       Long result= basicCalculator.sum(num1,num2);

       assertEquals(expectative,result);

    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSum(Long num1, Long num2, Long result){
        assertEquals(result, basicCalculator.sum(num1,num2),() -> num1 + " + " + num2 + " should equal " + result);

    }
}
