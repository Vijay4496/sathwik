package Testruner;

import org.junit.runner.RunWith;

import Selfdefination.defination;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/log.feature",glue={"defination"})

public class Runner {

}
