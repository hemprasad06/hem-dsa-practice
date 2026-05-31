package test.day2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class FindCountOfPairsWithGivenSumDSAversion
{
    @Test
    public void test1()
    {
        int[] input = {0,2,4,6,3,3,1,5};
        int target = 6;
        int actualResult01 = findAllPairs(input, target);
        int expectedResult01 = 4;
        Assert.assertEquals(actualResult01, expectedResult01);
    }
    @Test
    public void test2()
    {
        int[] input = {0,7,0,4,3,5,0,2,0};
        int target = 7;
        int actualResult02 = findAllPairs(input, target);
        int expectedResult02 = 6;
        Assert.assertEquals(actualResult02, expectedResult02);
    }

    private int findAllPairs(int[] input, int target)
    {
        Map<Integer,Integer> mapped = new HashMap<>();
                int count =0;
        for(int num:input)
        {
        int complement = target-num;
            if(mapped.containsKey(complement))
            {
                count += mapped.get(complement);
            }
            mapped.put(num,mapped.getOrDefault(num,0)+1);
        }
        return count;

    }
}
