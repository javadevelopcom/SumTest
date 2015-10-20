import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TestSum {
    @Test
    public void calcSumTest() throws Exception {
        Sum sum = new Sum();
        int n = sum.calcSum(10, 5);

        assertEquals(15, n);

    }
}
