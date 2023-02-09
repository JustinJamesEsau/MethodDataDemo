
@tag
Feature: Homepage Navigate to footer section go to new page
  On new page cycle through CTA

  @tag1
   Scenario: HP > Next page > Cycle through CTA
    Given I navigate to Method Data homepage
    When I click footer dropdown button 
    And I click dropdown option button to take me to a new page
    And I verify section heading
    Then I click on Phase 2 btn
    And I click on Phase 3 btn
    #Then I close browser
