package Maven_Parameter2;

import org.testng.annotations.Test;

public class Organisation_Test11
{
@Test
public void CreateOrganisationTest()
{
	System.out.println("Execute CreateOrganisationTest");
	
	String URL = System.getProperty("url");
	String BROWSER = System.getProperty("browser","chrome");
	String USERNAME = System.getProperty("username");
	String PASSWORD= System.getProperty("password");
	
	
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	
}
@Test
public void ModifyOrganisationTest()
{
	System.out.println("Execute ModifyOrganisationTest");
}
}
