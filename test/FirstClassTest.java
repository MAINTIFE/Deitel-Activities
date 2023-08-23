import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstClassTest {

    @Test
    void testForAddition() {
//        given
        int first = 9;
        int second = 8;
//        when
        int result = FirstClass.addition(first, second);
//        assert
        assertEquals(17, result);


    }
}