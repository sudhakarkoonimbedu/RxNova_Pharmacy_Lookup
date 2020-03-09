package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.APS33512_VerifyPharmacyLookUpBenefitsEligibility_MedicalBenefit_Steps;
import cucumber.api.java.en.Then;

public class APS33512_VerifyPharmacyLookUpBenefitsEligibility_MedicalBenefit
{
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	private PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	
	private APS33512_VerifyPharmacyLookUpBenefitsEligibility_MedicalBenefit_Steps medicalbenefit_Steps;
	
	public APS33512_VerifyPharmacyLookUpBenefitsEligibility_MedicalBenefit(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
	{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	public void init() throws Throwable
	{
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		medicalbenefit_Steps = new APS33512_VerifyPharmacyLookUpBenefitsEligibility_MedicalBenefit_Steps(SharedResource,utils);
	}
	@Then("^User perform search for existing pharmacy by entering details in Pharmacy Lookup$")
	public void User_perform_search_for_existing_pharmacy_by_entering_details_in_Pharmacy_Lookup(Map<String,String> searchDetails) throws Throwable
	{
		medicalbenefit_Steps.searchPharmacyLookUp(searchDetails);
	}
	@Then("^User click on Medical Benefit$")
	public void user_click_on_medical_benefits() throws Throwable
	{
		pharmacyLookup_Details_Steps.verifyBenefitsEligibility();
		medicalbenefit_Steps.clickOnMedicalBenefit();
	}
	@Then("^User verifies Medical Benefit HRA details$")
	public void user_verifies_medicalbenefit_hra_details(Map<String,String> HRADetails) throws Throwable
	{
		medicalbenefit_Steps.verifyMedicalBenefitDetails(HRADetails);
	}
	@Then("^User click on FSA radioButton and Verify FSA details$")
	public void user_click_on_fsa_radiobutton_and_verify_fsa_details(Map<String,String> FSADetails) throws Throwable
	{
		medicalbenefit_Steps.verifyMedicalBenefitDetails(FSADetails);
	}
	@Then("^User click on HSA radioButton and Verify HSA details$")
	public void user_click_on_hsa_radiobutton_and_verify_hsa_details(Map<String,String> HSADetails) throws Throwable
	{
		medicalbenefit_Steps.verifyMedicalBenefitDetails(HSADetails);
	}
	@Then("^User click on ADJ radioButton and Verify ADJ details$")
	public void user_click_on_adj_radiobutton_and_verify_adj_details(Map<String,String> ADJDetails) throws Throwable
	{
		medicalbenefit_Steps.verifyMedicalBenefitDetails(ADJDetails);
	}	
	@Then("^User click on SPAP radioButton and Verify SPAP details$")
	public void user_click_on_spap_radiobutton_and_verify_spap_details(Map<String,String> SPAPDetails) throws Throwable
	{
		medicalbenefit_Steps.verifyMedicalBenefitDetails(SPAPDetails);
	}
}
