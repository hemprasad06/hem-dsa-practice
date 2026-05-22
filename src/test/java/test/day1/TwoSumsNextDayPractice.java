package test.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoSumsNextDayPractice {
    @Test
    public void test01() {
        int[] inputValue = {5, 56, 5, 2, 2, 2, 5};
        int target = 10;
        int[] result = sumOfTwoValues(inputValue, target);
        int[] expectedValue = {0, 2};
        Assert.assertTrue(Arrays.equals(result, expectedValue));
    }

    @Test
    public void test02() {
        int[] inputValue = {5, 0};
        int target = 10;
        int[] result = sumOfTwoValues(inputValue, target);
        int[] expectedValue = null;
        Assert.assertTrue(Arrays.equals(result, expectedValue));
    }


    @Test
    public void test03() {
        int[] inputValue = {5,3};
        int target = 10;
        int[] result = sumOfTwoValues(inputValue, target);
        int[] expectedValue = null;
        Assert.assertTrue(Arrays.equals(result, expectedValue));
    }

    private int[] sumOfTwoValues(int[] inputValue, int target)
    {
        if(inputValue == null || inputValue.length == 0){
            return null;
        }
        else
        {
            for(int i = 0; i<inputValue.length; i++)
            {
                for(int j=i+1; j<inputValue.length;j++)
                {
                    if(inputValue[i]+inputValue[j]==target)
                    {
                        return new int[]{i,j};
                    }
                }
            }
        }
        return null;
    }

}
