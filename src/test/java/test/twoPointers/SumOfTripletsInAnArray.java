package test.twoPointers;
//in a given array, find if a sum of any triplets (3 digits of a given array) is equal to zero

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfTripletsInAnArray {
    @Test
    public void test1() {
        int[] inputArray01 = {0, -2, 1, 1, -3, 2, 1};
        Assert.assertTrue(tripletSumResultsZero(inputArray01), "Given Array" + inputArray01 + "is zero for one of the 3 values");
    }
@Test
    public void test2() {
        int[] inputArray02 = {0, -2, 1, -3, 1};
        Assert.assertFalse(tripletSumResultsZero(inputArray02), "Given Array" + inputArray02 + "is zero for one of the 3 values");
    }

    public boolean tripletSumResultsZero(int[] inputArray) {
        if (inputArray.length == 0)
            return false;
        else
            for (int i = 0; i < inputArray.length - 2; i++) {
                //for(int j = 0;j<=2;j++) {

                int temp = inputArray[i] + inputArray[i + 1] + inputArray[i + 2];
                if (temp == 0) {
                    return true;
                }
                else temp = 0;
            }
            return false;

    }
}