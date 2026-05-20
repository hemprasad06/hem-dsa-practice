package test.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSums
{
    @Test
    public void test1()
    {
    int[] input = {2,2,2,5,5};
    int target = 7;
    int[] expected = {0,3};
        Assert.assertEquals(twoSum(input,target), expected);
    }
    public int[] twoSum(int[] input, int target)
    {
        for(int i=0;i<=input.length-1;i++)
        {
            for(int j=0;j<input.length-1;j++)
            {
                if ((input[j] + input[j + 1]) == target)
                    return new int[]{j, j + 1};
                else j++;
            }
        }
        return null;

    }
}
