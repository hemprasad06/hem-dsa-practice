package test.day1;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;

public class TwoSumsDay2Practice
{
    @Test
    public void test01()
    {
        int[] firstInput = {5,4,6,3,4,5,0};
        int target = 10;
        int[] output01 = sumOfTwo(firstInput, target);
        int[] output = {0,5};
        Assert.assertTrue(Arrays.equals(output01,output));
    }
    
}