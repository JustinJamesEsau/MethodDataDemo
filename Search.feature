

@tag
Feature: I want to search text and be served an article

  @tag1
  Scenario Outline: search test
    Given I navigate to Method Data homepage
    When I click the search icon I am presented with the search field 
    Then I enter <search_text> in search field
    And I click seach button
    #Then I close browser

    Examples: 
      | search_text  | 
      | Integration  | 
    