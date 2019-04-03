package assignment.com.MonikaAssignment;

import org.testng.Assert;
import org.testng.annotations.Test;

import PomClasses.Login;

public class EndTestClass {
	
	@Test
	public void validLogin()
	{
		Login login=new Login();
		login.valiLogin();
	}

	@Test
	public void InvalidLogin_Email()
	{
		Login login=new Login();
		login.invaliEmailLogin();
	}
	@Test
	public void InvalidLogin_Password()
	{
		Login login=new Login();
		login.invaliPasswordLogin();
	}
	@Test
	public void WrongPasscount()
	{
		Login login=new Login();
		int count=0;
		if(count<3)
		{
			login.invaliPasswordLogin();
			++count;
		}
		else
		{
			String message="Email address and password doesn’t match. You only have one more chance. Please contact RightEye Support at 800-301-0803.’";
			Assert.assertTrue(login.getErroMessage().equals(message));
		}
		
	}
	@Test
	public void BlockedPasscount()
	{
		Login login=new Login();
		int count=0;
		if(count<4)
		{
			login.invaliPasswordLogin();
			++count;
		}
		else
		{
			String message="‘Your Email address is locked and invalid. Please contact RightEye Support at 800-301-0803.’";
			Assert.assertTrue(login.getErroMessage().equals(message));
		}
		
	}
	@Test
	public void validateNeedHelp()
	{
		Login login=new Login();
		String title=login.clickNeedHelp().getTitle();
		Assert.assertEquals(title, "Faq Title");
	}
}