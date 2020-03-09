package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		        features = {"classpath:features/PharmacyLookup/APS33512_PharmacyLookup_BenefitsEligibility_Verify_MedicalBenefit.feature" }, 
			    tags = {"@Functional"}, 
			    glue= {"classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions",
					   "classpath:DSTPS.Automation.HybridDesktop.Apps.common",
					   "classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common",
					   "classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages",
					   "classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.runners",
					   "classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps"},
			    plugin =  {"pretty","html:target/html", "json:APS33512_PharmacyLookup_BenefitsEligibility_Verify_MedicalBenefit.json", "rerun:src/test/resources/rerun.txt"},
			    strict=true
				)
public class APS33512_VerifyPharmacyLookUpBenefitsAndEligibilityMedicalBenefit_TestRunner extends AbstractTestNGCucumberTests
{

}
