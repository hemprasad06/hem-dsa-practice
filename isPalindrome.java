package simpleStringPracticePackage
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsAnagram {

    @Test
    public void test1() {
        String input1 = "madam";
        Assert.assertTrue(isThisTextPalindrome(input1));
    }

    public boolean isThisTextPalindrome(String inputText) {
        String reversed = new StringBuilder(inputText).reverse().toString();
        return reversed.equals(inputText);
    }
}