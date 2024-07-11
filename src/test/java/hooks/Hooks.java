package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void before_suite()

	{
		System.out.println("This is before");
	}
	@After
	public void after_suite()

	{
		System.out.println("This is aftr");
	}
}
