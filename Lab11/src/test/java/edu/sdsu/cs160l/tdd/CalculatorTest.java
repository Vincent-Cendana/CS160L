package edu.sdsu.cs160l.tdd;

import edu.sdsu.cs160l.calculator.Calculator;
import edu.sdsu.cs160l.calculator.SimpleCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//Todo (DONE) write test cases for SimpleCalculator Class
// No need to implement the actual Calculator class just write Test cases as per TDD.
// you need to just write test cases no mocking
// test should cover all methods from calculator and all scenarios, so a minimum of 5 test
// 1 for add
// 1 for subtract
// 1 for multiply
// 2 for divide (1 for normal division, 1 for division by 0)
// make sure all these test cases fail

public class CalculatorTest {
    //Declare variable here
    private Calculator calculator;

    //Add before each here
    @BeforeEach
    void setUp()
    {
        calculator = new SimpleCalculator();
    }

    //write test cases here
    @Test
    void addTest()
    {
        assertEquals(13, calculator.add(5,7));
    }

    @Test
    void subtractTest()
    {
        assertEquals(13, calculator.sub(15,3));
    }

    @Test
    void mulTest()
    {
        assertEquals(16, calculator.mul(5,3));
    }

    @Test
    void divTest()
    {
        assertEquals(17, calculator.div(64,4));
    }

    @Test
    void divByZeroTest()
    {
        assertEquals(0, calculator.div(10,0));
    }
}
