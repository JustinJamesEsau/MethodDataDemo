import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class MyStepDefinition {

	/**
	 * The step definitions below match with Homepage Gherkin steps
	 */

	@Given("I navigate to Method Data homepage")
	def I_navigate_to_Method_Data_homepage() {

		WebUI.openBrowser("https://www.methoddata.com/")
		
		//		'Maximize current window'
		//		WebUI.maximizeWindow()
		
	}

	@When("I click footer dropdown button")
	def I_click_footer_dropdown_button() {

		WebUI.click(findTestObject('Object Repository/Page_MethodData - Home/svg_Expand' ))
	}

	@And("I click dropdown option button to take me to a new page")
	def I_click_dropdown_option_button_to_take_me_to_a_new_page() {

		WebUI.click(findTestObject('Object Repository/Page_MethodData - Home/a_Integrations  Automation'))
	}

	@And("I verify section heading")
	def I_verify_section_heading() {

		WebUI.click(findTestObject('Object Repository/Page_Integrations  Automation - MethodData/h2_Our Methodology'))
		WebUI.delay(5)
	}

	@And("I verify section image")
	def I_verify_section_image() {

		WebUI.click(findTestObject('Object Repository/Page_Integrations  Automation - MethodData/img_Raise and resolve challenges_wp-image-897'))
	}

	@Then("I click on Phase 2 btn")
	def I_click_on_Phase_2_btn() {

		WebUI.click(findTestObject('Object Repository/Page_Integrations  Automation - MethodData/span_Phase 2 Execution  Sprints Begin'))
	}

	@And("I click on Phase 3 btn")
	def I_click_on_Phase_3_btn() {

		WebUI.click(findTestObject('Object Repository/Page_Integrations  Automation - MethodData/span_Phase 3 Ongoing Support'))
	}

	@Then("I close browser")
	def I_close_browser() {

		'Close browser'
		WebUI.closeBrowser()
	}


	/**
	 * The step definitions below match with cloud services Gherkin steps
	 */

	@Given("I navigate to Method Data cloud services page view port max window")
	def I_navigate_to_Method_Data_cloud_services_page_view_port_max_window() {

		WebUI.openBrowser("https://www.methoddata.com/services/cloud-services/")
		
		'Maximize current window'
		WebUI.maximizeWindow()
		WebUI.delay(5)
	}

	@Given("I navigate to Method Data cloud services page view port min window")
	def I_navigate_to_Method_Data_cloud_services_page_view_port_min_window() {

		WebUI.openBrowser("https://www.methoddata.com/services/cloud-services/")
		WebUI.delay(5)

	}
	
	@Given("I navigate to Method Data cloud services page view port mobile window")
	def I_navigate_to_Method_Data_cloud_services_page_view_port_mobile_window() {

		WebUI.openBrowser("https://www.methoddata.com/services/cloud-services/")

		'Set viewport size 347x703'
		WebUI.setViewPortSize(347, 703)
		WebUI.delay(5)
		
	}
	
	/**
	 * The step definitions below match with FAQ Gherkin steps
	 */

	@When("I click the FAQ button")
	def I_click_the_FAQ_button() {

		WebUI.click(findTestObject('Object Repository/Page_MethodData - Home/Page_MethodData - Home/a_FAQs'))
	}

	@Then("I verify the heading")
	def I_verify_the_heading () {

		WebUI.click(findTestObject('Page_FAQs - MethodData/h1_Frequently Asked Questions'))
	}


	@And("I click the first FAQ dropdown")
	def I_click_the_first_FAQ_dropdown () {

		WebUI.click(findTestObject('Object Repository/Page_MethodData - Home/Page_FAQs - MethodData/span_First_question'))
	}


	@And("I click the forth FAQ dropdown")
	def I_click_the_forth_FAQ_dropdown () {

		WebUI.click(findTestObject('Object Repository/Page_MethodData - Home/Page_FAQs - MethodData/span_What services are typically included i_8149d0'))
	}


	/**
	 * The step definitions below match with Search Gherkin steps
	 */

	@When("I click the search icon I am presented with the search field")
	def I_click_the_search_icon_I_am_presented_with_the_search_field () {

		WebUI.click(findTestObject('Object Repository/Page_MethodData - Home/Page_MethodData - Home/button_Search'))
	}

	@Then("I enter (.*) in search field")
	def I_enter_search_text_in_search_field(String search_text) {

		WebUI.setText(findTestObject('Object Repository/Page_MethodData - Home/Page_MethodData - Home/input_Search for_s'), search_text)
	}

	@And("I click seach button")
	def I_click_seach_button () {

		WebUI.click(findTestObject('Object Repository/Page_MethodData - Home/Page_MethodData - Home/input_Search for_search-submit'))
	}

	/**
	 * The step definitions below match with Contact-Us Gherkin steps
	 */
	
	@Given("I navigate to Method Data contact us page")
	def I_navigate_to_Method_Data_contact_us_page() {

		WebUI.openBrowser("https://staging.methoddata.com/contact-us/")

		//		'Maximize current window'
		//		WebUI.maximizeWindow()
		WebUI.delay(10)
	}
	
	@When("I click contact us button")
	def I_click_contact_us_button () {

		WebUI.click(findTestObject('Object Repository/Page_MethodData - Home/a_Contact Us')) 
	}
	
	@Then("I enter (.*) in full name field")
	def I_enter_name_in_full_name_field(String full_name) {

		WebUI.click(findTestObject('Object Repository/Page_Contact Us - MethodData/input_Full Name_kb_field_0') , full_name) 
	}
	
	@And("I enter (.*) in email field")
	def I_enter_email_in_email_field(String email) {

		WebUI.setText(findTestObject('Object Repository/Page_Contact Us - MethodData/input_Email_kb_field_1') , email)
	}
	
	@And("I enter (.*) in message field")
	def I_enter_message_in_message_field(String message) {

		WebUI.setText(findTestObject('Object Repository/Page_Contact Us - MethodData/textarea_Message_kb_field_2') , message)
	}
	
}