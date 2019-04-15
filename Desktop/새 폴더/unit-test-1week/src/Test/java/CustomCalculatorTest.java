import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {



    @Test
    public void 더하기테스트()
    {
        CustomCalculator cal = new CustomCalculator();
        int result = cal.add(3,4);
        assertTrue(result == 7);
    }
    @Test
    public void 마이너스테스트()
    {
        CustomCalculator cal = new CustomCalculator();
        int result = cal.subtract(10,2); //subtract함수 사용해서 뺄셈수행.
        assertTrue(result == 8); //Test 결과 확인
    }
    /* 곱하기와 나누기는 생략함. */


}