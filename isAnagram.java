package test;
import org.testng.annotations.Test;
import org.testng.Assert;
public class isAnagram {
	@Test
	public void test1()
	{
		String input1 = "madam";
        Assert.assertTrue(isThisTextPalindrome(input1));
	}
public boolean isThisTextAnagram(String inputText)
{
	StringBuilder reversed = new StringBuilder(inputText).reverse().toString();
	if(reversed.equals(inputText))
	{
		return true;
	}
	else
		return false;
}
}
