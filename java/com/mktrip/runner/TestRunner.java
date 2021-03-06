package com.mktrip.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",
				 tags="@OnewayTrip",
				 monochrome=true,
				 dryRun=false,
				 glue="com.mkmytrip.stepdefinitions",
				 plugin= {"html:target/cucumber-report/",
						 "json:target/cucumber.json",
						 "pretty:target/cucumber-pretty.txt",
						 "junit:target/cucumber-results.xml"
				 }
)
public class TestRunner {

}
