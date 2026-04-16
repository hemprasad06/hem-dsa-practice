package test.twoPointers;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumofAnyTripletsIsZero {
    @Test
    public void test1()
    {
        int[] inputArray01 =  {1,0, -2, 1, 1, -3, 2};
        Assert.assertTrue(sumOfAnyTripletsinArray(inputArray01));
    }

    @Test
    public void test2()
    {
        int[] inputArray02 = {2,0, -2, 1, -3, 1};
        Assert.assertFalse(sumOfAnyTripletsinArray(inputArray02));
    }
    public boolean sumOfAnyTripletsinArray(int[] inputArray)
    {

    }
}
