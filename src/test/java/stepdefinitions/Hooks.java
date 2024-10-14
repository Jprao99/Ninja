package stepdefinitions;

import java.time.Duration;

import com.ninja.Utils.BaseClass;

import io.cucumber.java.*;
import io.cucumber.java.en.Given;

public class Hooks extends BaseClass {
	
	@Before
	public void ggg2() {
		System.out.println("before");
	}
	
	@After
	public void ggg1() {
		System.out.println("after");
	}
	
	
	@Before(order =0)
	public void setup() {
		initialize();
		System.out.println("normal setup");
	}

	@Before(order =0)
	public void aetup() {
		System.out.println("taggedhook");
	}
	

	
	@Before(value="@new")
	public void ggg() {
		System.out.println("before with tag");
	}
	
	@Before(order=1)
	@Given("user open the browser and launch the application")
	public void user_open_the_browser_and_launch_the_application() {
	    driver.get("https://tutorialsninja.com/demo/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	

//	@BeforeStep
//	public static void before_Step_Method() {
//		System.out.println("BeforeStep executed....");
//	}
//
	@AfterStep
	public static void after_Step_Method() {
		System.out.println("AfterStep executed....");
	}
	
	@BeforeAll
	public static void before_all_Method() {
		System.out.println("BeforeAll executed....");
	}

//	@AfterAll {
//		System.out.println("AfterAllMethod executed...");
//	}


	
	@After
	public void close() {
		tearDown();
	}
	

	//BeforeAll->Before With Condition->Before ->Before with tag -> BeforeStep

}
