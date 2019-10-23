package Nop_Commerce_BDD;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

//@RunWith(Cucumber.class)
@CucumberOptions(features=".", tags=("@register"),plugin={"pretty","html:target/Destinations"})
@Test
public class RunTest extends AbstractTestNGCucumberTests {


}
