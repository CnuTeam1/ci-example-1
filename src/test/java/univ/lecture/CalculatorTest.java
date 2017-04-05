package univ.lecture;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by tchi on 2017. 3. 19..
 */
public class CalculatorTest {
    @Test
    public void testCalculatorAdd () {
        Calculator calc = new Calculator();
        int output = calc.calculate("1+1");
        assertThat(output, is(2));
    }
    
    public void testCalculatorMult () {
        Calculator calc = new Calculator();
        int output = calc.calculate("2*3");
        assertThat(output, is(6));
    }
    public void testCalculatorDiv () {
        Calculator calc = new Calculator();
        int output = calc.calculate("6/3");
        assertThat(output, is(2));
    } 
    public void testCalculatorSub () {
        Calculator calc = new Calculator();
        int output = calc.calculate("6-3");
        assertThat(output, is(3));
    }
    
    
}
